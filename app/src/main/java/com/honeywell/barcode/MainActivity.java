package com.honeywell.barcode;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.honeywell.aidc.AidcManager;
import com.honeywell.aidc.AidcManager.CreatedCallback;
import com.honeywell.aidc.BarcodeReader;
import com.honeywell.barcode.Helper.SessionManager;

import java.io.IOException;

public class MainActivity extends Activity {

    private static BarcodeReader barcodeReader;
    private AidcManager manager;

    private Button btnAutomaticBarcode;
    private Button btnClientBarcode;
    private Button btnScannerSelectBarcode;

    private static final int REQUEST_CONNECT_DEVICE = 1;
    private static final String TAG = MainActivity.class.getName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        AidcManager.create(this, new CreatedCallback() {

            @Override
            public void onCreated(AidcManager aidcManager) {
                manager = aidcManager;
                barcodeReader = manager.createBarcodeReader();

            }
        });
        ActivitySetting();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    static BarcodeReader getBarcodeObject() {
        return barcodeReader;
    }
    /**
     * Create buttons to launch demo activities.
     */
    public void ActivitySetting() {
        btnAutomaticBarcode = (Button) findViewById(R.id.buttonAutomaticBarcode);
        btnAutomaticBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the intent action string from AndroidManifest.xml
                Intent barcodeIntent = new Intent("android.intent.action.AUTOMATICBARCODEACTIVITY");
                startActivity(barcodeIntent);
            }
        });

        btnClientBarcode = (Button) findViewById(R.id.buttonClientBarcode);
        btnClientBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the intent action string from AndroidManifest.xml
//                Intent barcodeIntent = new Intent("android.intent.action.CLIENTBARCODEACTIVITY");
//                startActivity(barcodeIntent);
                openBT();
            }
        });

        btnScannerSelectBarcode = (Button) findViewById(R.id.buttonScannerSelectBarcode);
        btnScannerSelectBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the intent action string from AndroidManifest.xml
                Intent barcodeIntent = new Intent(
                        "android.intent.action.SCANNERSELECTBARCODEACTIVITY");
                startActivity(barcodeIntent);
            }
        });
    }

    void openBT()  {
        try {
            Intent connectIntent = new Intent(MainActivity.this,
                    DeviceListActivity.class);
            startActivityForResult(connectIntent,
                    REQUEST_CONNECT_DEVICE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onActivityResult(int mRequestCode, int mResultCode,
                                 Intent mDataIntent) {
        super.onActivityResult(mRequestCode, mResultCode, mDataIntent);

        switch (mRequestCode) {
            case REQUEST_CONNECT_DEVICE:
                if (mResultCode == Activity.RESULT_OK) {
                    Bundle mExtra = mDataIntent.getExtras();
                    String mDeviceAddress = mExtra.getString("DeviceAddress");
                    String mDeviceName = mExtra.getString("DeviceName");
                    Log.v(TAG, "Coming incoming address " + mDeviceAddress);
                    SessionManager ss = new SessionManager(getApplicationContext());
                    ss.addPrinter(mDeviceName,mDeviceAddress);
                    //myLabel.setText(mDeviceName);
                    //mBluetoothDevice = mBluetoothAdapter
                    //        .getRemoteDevice(mDeviceAddress);
                    //mBluetoothConnectProgressDialog = ProgressDialog.show(this,
                    //        "Connecting...", mBluetoothDevice.getName() + " : "
                    //                + mBluetoothDevice.getAddress(), true, false);
                    //Thread mBlutoothConnectThread = new Thread(this);
                    //mBlutoothConnectThread.start();
                    // pairToDevice(mBluetoothDevice); This method is replaced by
                    // progress dialog with thread
                }
                break;

//            case REQUEST_ENABLE_BT:
//                if (mResultCode == Activity.RESULT_OK) {
//                    //ListPairedDevices();
//                    Intent connectIntent = new Intent(MainActivity.this,
//                            DeviceListActivity.class);
//                    startActivityForResult(connectIntent, REQUEST_CONNECT_DEVICE);
//                } else {
//                    Toast.makeText(MainActivity.this, "Message", Toast.LENGTH_SHORT).show();
//                }
//                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (barcodeReader != null) {
            // close BarcodeReader to clean up resources.
            barcodeReader.close();
            barcodeReader = null;
        }

        if (manager != null) {
            // close AidcManager to disconnect from the scanner service.
            // once closed, the object can no longer be used.
            manager.close();
        }
    }

}
