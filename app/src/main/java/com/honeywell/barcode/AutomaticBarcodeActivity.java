package com.honeywell.barcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.media.ToneGenerator;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tscdll.TSCActivity;
import com.honeywell.aidc.*;
import com.honeywell.barcode.Helper.AsyncResponse;
import com.honeywell.barcode.Helper.ConnectionTask;
import com.honeywell.barcode.Helper.Helper;
import com.honeywell.barcode.Helper.Label4X6;
import com.honeywell.barcode.Helper.SessionManager;
import com.honeywell.barcode.Response.CMSLabelResponse;

public class AutomaticBarcodeActivity extends Activity implements BarcodeReader.BarcodeListener,
        BarcodeReader.TriggerListener,AsyncResponse {

    private com.honeywell.aidc.BarcodeReader barcodeReader;
    private ListView barcodeList;
    private EditText txtBarcode;
    private TextView txtLabelPrinter;
    private ProgressBar myProgressBar;


    private final int duration = 3; // seconds
    private final int sampleRate = 8000;
    private final int numSamples = duration * sampleRate;
    private final double sample[] = new double[numSamples];
    private final double freqOfTone = 440; // hz

    private final byte generatedSnd[] = new byte[2 * numSamples];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode);
        myProgressBar = findViewById(R.id.mpProgressBar);
        txtBarcode =findViewById(R.id.txtBarcode);
        txtLabelPrinter=findViewById(R.id.txtPrinterLabel);
        myProgressBar.setVisibility(View.GONE);


        SessionManager sessionManager;
        sessionManager = new SessionManager(getApplicationContext());
        String  se = sessionManager.getPrinterName();
        if(se != null){
            txtLabelPrinter.setText("Printer: "+se);
        }
        // set lock the orientation
        // otherwise, the onDestory will trigger when orientation changes
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // get bar code instance from MainActivity
        barcodeReader = MainActivity.getBarcodeObject();

        if (barcodeReader != null) {

            // register bar code event listener
            barcodeReader.addBarcodeListener(this);

            // set the trigger mode to client control
            try {
                barcodeReader.setProperty(BarcodeReader.PROPERTY_TRIGGER_CONTROL_MODE,
                        BarcodeReader.TRIGGER_CONTROL_MODE_AUTO_CONTROL);
            } catch (UnsupportedPropertyException e) {
                Toast.makeText(this, "Failed to apply properties", Toast.LENGTH_SHORT).show();
            }
            // register trigger state change listener
            barcodeReader.addTriggerListener(this);
            Map<String, Object> properties = new HashMap<>();
            // Set Symbologies On/Off
            properties.put(BarcodeReader.PROPERTY_CODE_128_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_GS1_128_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_QR_CODE_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_CODE_39_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_DATAMATRIX_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_UPC_A_ENABLE, true);
            properties.put(BarcodeReader.PROPERTY_EAN_13_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_AZTEC_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_CODABAR_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_INTERLEAVED_25_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_PDF_417_ENABLED, true);
            // Set Max Code 39 barcode length
            properties.put(BarcodeReader.PROPERTY_CODE_39_MAXIMUM_LENGTH, 15);
            properties.put(BarcodeReader.PROPERTY_UPC_E_E1_ENABLED,true);
            // Turn on center decoding
            properties.put(BarcodeReader.PROPERTY_CENTER_DECODE, true);
            // Enable bad read response
            //properties.put(BarcodeReader.PROPERTY_NOTIFICATION_BAD_READ_ENABLED, true);
            // Apply the settings
            barcodeReader.setProperties(properties);
        }

        // get initial list
        barcodeList = (ListView) findViewById(R.id.listViewBarcodeData);

    }

    @Override
    public void onBarcodeEvent(final BarcodeReadEvent event) {
        ConnectionTask ct = new ConnectionTask(event.getBarcodeData(),this);
        //myProgressBar.setVisibility(View.VISIBLE);
        ct.execute();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                txtBarcode.setText(event.getBarcodeData());
                List<String> list = new ArrayList<>();
//                Helper H = new Helper();
                list.add("Searching");
//                list.add("Timestamp: " + event.getTimestamp());
                final ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(
                        AutomaticBarcodeActivity.this, android.R.layout.simple_list_item_1, list);
               barcodeList.setAdapter(dataAdapter);
            }
        });
    }

    @Override
    public void processFinish(String output) {
        myProgressBar.setVisibility(View.INVISIBLE);
    }
    @Override
    public void processStart(){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myProgressBar.setVisibility(View.VISIBLE);
            }
        });
    }

    void genTone(){
        // fill out the array
        for (int i = 0; i < numSamples; ++i) {
            sample[i] = Math.sin(2 * Math.PI * i / (sampleRate/freqOfTone));
        }

        // convert to 16 bit pcm sound array
        // assumes the sample buffer is normalised.
        int idx = 0;
        for (final double dVal : sample) {
            // scale to maximum amplitude
            final short val = (short) ((dVal * 32767));
            // in 16 bit wav PCM, first byte is the low order byte
            generatedSnd[idx++] = (byte) (val & 0x00ff);
            generatedSnd[idx++] = (byte) ((val & 0xff00) >>> 8);

        }
    }

    public void ringtone(){
        try {
            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), notification);
            r.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void processFinish(CMSLabelResponse cms) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myProgressBar.setVisibility(View.INVISIBLE);
            }
        });
        List<String> list = new ArrayList<>();
        if(cms ==null){
            ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_NOTIFICATION, 500);
            toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 2000);
            list.add("Not Found null");
            txtBarcode.setText("");
        }else{
            String st = cms.getStaffName();
            if (st.equals("")) {
                list.add("Not Found");
                txtBarcode.setText("");
                ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_NOTIFICATION, 200);
                toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 2000);
//                toneG.startTone(ToneGenerator.TONE_PROP_BEEP2, 1000);
//                toneG.startTone(ToneGenerator.TONE_PROP_ACK);
//                toneG.startTone(ToneGenerator.TONE_PROP_BEEP2);
            }else{
                ringtone();
                list.add("Found ");
                txtBarcode.setText("");
//            TSCActivity TscEthernetDll = new TSCActivity();
//            TscEthernetDll.openport("00:19:0E:A1:FB:E1");
//            String BILL = Label4X6.GetLabel4X6(cms);
//            TscEthernetDll.sendcommand(BILL.getBytes());
//            TscEthernetDll.printlabel(1, 1);
//            TscEthernetDll.closeport();

            }
        }
        final ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(
                AutomaticBarcodeActivity.this, android.R.layout.simple_list_item_1, list);
        barcodeList.setAdapter(dataAdapter);
    }

    public void UpdateUI(CMSLabelResponse cms){
        List<String> list = new ArrayList<>();
        list.add("Code ID: " + cms.getArea());
        list.add("Timestamp: " + cms.getBuilding());
        final ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(
                AutomaticBarcodeActivity.this, android.R.layout.simple_list_item_1, list);
        barcodeList.setAdapter(dataAdapter);
    }

    // When using Automatic Trigger control do not need to implement the
    // onTriggerEvent function
    @Override
    public void onTriggerEvent(TriggerStateChangeEvent event) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onFailureEvent(BarcodeFailureEvent arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onResume() {
        super.onResume();
        if (barcodeReader != null) {
            try {
                barcodeReader.claim();
            } catch (ScannerUnavailableException e) {
                e.printStackTrace();
                Toast.makeText(this, "Scanner unavailable", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (barcodeReader != null) {
            // release the scanner claim so we don't get any scanner
            // notifications while paused.
            barcodeReader.release();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (barcodeReader != null) {
            // unregister barcode event listener
            barcodeReader.removeBarcodeListener(this);

            // unregister trigger state change listener
            barcodeReader.removeTriggerListener(this);
        }
    }
}
