package com.honeywell.barcode.Helper;

import android.util.Log;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.honeywell.barcode.Response.CMSLabelResponse;
import com.honeywell.barcode.Response.ClientInfo;
import com.honeywell.barcode.Response.LabelGenerationRequest;
import com.honeywell.barcode.Response.LabelGenerationResponse;
import com.honeywell.barcode.Response.LabelInfo;
import com.honeywell.barcode.Response.SearchHAWBResponse;
import com.honeywell.barcode.Response.Transaction;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.StringReader;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ConnectionManager {
    private static final String TAG = ConnectionManager.class.getSimpleName();
    private static final String SOAP_ACTION = "http://tempuri.org/ILabelPrint/SelectedWaybill";
    private static final String METHOD_NAME = "SelectedWaybill";
    private static final String NAMESPACE = "http://tempuri.org/";
    private final String END_POINT="https://ws.aramex.net/CustomsExpress/api/shipment/getAllHAWBDetails?value=";
    private final String END_POINT_PRINT_LABEL="https://ws.aramex.net/ShippingAPI.V2/Shipping/Service_1_0.svc/json/PrintLabel";

    //private final String END_POINT_DEV ="http://dev.redit.aramex.net/Corp.MobilePrinting/API/";
    private final String END_POINT_DEV="http://redit.aramex.com/Corp.MobilePrinting/API/";
    private RequestBody body;
    private final MediaType MEDIATYPE_JSON = MediaType.parse("application/json");
    public String GetAWBDetails(String HAWB) {
        String url = END_POINT+HAWB;
        try{
            OkHttpClient client = new OkHttpClient();
            okhttp3.Request request = new okhttp3.Request.Builder()
                    .url(url)
                    .get()
                    //.addHeader("Content-Type", MEDIA_TYPE_URL_ENCODED)
                    .addHeader("cache-control", "no-cache")
                    .build();
            Response response = client.newCall(request).execute();
            if(response.code() != 200){
                Log.e("Resposne",response.toString());
                return null;
            }
            if(response.body() != null){
                //JSONObject json = new JSONObject(response.body().string());
                Gson gson = new GsonBuilder().create();
                Log.e("TAG",response.body().toString());
                List<SearchHAWBResponse> token =  gson.fromJson(response.body().string(), new TypeToken<List<SearchHAWBResponse>>() {
                }.getType());
                return  "Success";
            }
        }catch (SocketTimeoutException e){
            Log.e("Exception",e.getMessage());
            return null;
        }
        catch (Exception e){
            //Toast.makeText(mContext,e.getMessage(),Toast.LENGTH_SHORT).show();
            Log.e("Exception",e.getMessage());
            return null;
        }
        return null;
    }

    private ClientInfo GetClientInfo(){
        ClientInfo c = new ClientInfo();
        c.setAccountCountryCode("AE");
        c.setAccountEntity("DXB");
        c.setAccountNumber("45796");
        c.setAccountPin("116216");
        c.setUserName("dxbit@aramex.com");
        c.setPassword("Ar@m3x$h1pp1ng");
        c.setVersion("v1");
        c.setSource(24);
        return c;
    }

    private LabelInfo GetLabelInfo(){
        LabelInfo l = new LabelInfo();
        l.setReportID(9730);
        l.setReportType("RPT");
        return l;
    }

    private Transaction GetTransaction(){
        Transaction t = new Transaction();
        t.setReference1("");
        t.setReference2("");
        t.setReference3("");
        t.setReference4("");
        t.setReference5("");
        return t;
    }

    public byte[] GetLabel(String HAWB) {
        //return null;
        String url = END_POINT_PRINT_LABEL;
        LabelGenerationRequest request_payload = new LabelGenerationRequest();
        request_payload.setClientInfo(GetClientInfo());
        request_payload.setLabelInfo(GetLabelInfo());
        request_payload.setOriginEntity("DXB");
        request_payload.setProductGroup("DOM");
        request_payload.setShipmentNumber(HAWB);
        request_payload.setTransaction(GetTransaction());
        String jsonData = new GsonBuilder().create().toJson(request_payload);
        //Log.i("Request",jsonData);
        body = RequestBody.create(MEDIATYPE_JSON,jsonData);
        try{
            OkHttpClient client = new OkHttpClient();
            okhttp3.Request request = new okhttp3.Request.Builder()
                    .url(url)
                    .post(body)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Accept", "application/json")
                    .addHeader("cache-control", "no-cache")
                    .build();
            Response response = client.newCall(request).execute();
            if(response.code() != 200){
                //Log.e("Resposne",response.body().toString());
                return null;
            }
            if(response.body() != null){
                Gson gson = new GsonBuilder().serializeNulls().create();

                LabelGenerationResponse response_payload =  gson.fromJson(response.body().string(),LabelGenerationResponse.class);
                jsonData = new GsonBuilder().create().toJson(response_payload);
                //Log.e("TAG",jsonData);
                if(response_payload.getHasErrors()){
                    return null;
                }
                return  response_payload.getShipmentLabel().getLabelFileContents();
            }
        }catch (SocketTimeoutException e){
            Log.e("Exception",e.getMessage());
            return null;
        }
        catch (Exception e){
            //Toast.makeText(mContext,e.getMessage(),Toast.LENGTH_SHORT).show();
            Log.e("Exception",e.getMessage());
            return null;
        }
        return null;
    }
    public String GetCMSLabel(){
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("text/xml");
        RequestBody body = RequestBody.create(mediaType, "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:pm=\"http://tempuri.org/\">\r\n   <soapenv:Header/>\r\n   <soapenv:Body>\r\n      <pm:SelectedWaybill>\r\n         <pm:Hawb>44265883583</pm:Hawb>\r\n      </pm:SelectedWaybill>\r\n   </soapenv:Body>\r\n</soapenv:Envelope>");
        Request request = new Request.Builder()
                .url("https://10.29.1.103/CMSClientAPI/LabelPrint.svc")
                .post(body)
                .addHeader("Content-Type", "text/xml")
                .addHeader("SOAPAction", "\"http://tempuri.org/ILabelPrint/SelectedWaybill\"")
                .build();
        try{

//            client.newCall(request).enqueue(new Callback() {
//                                                @Override
//                                                public void onFailure(Call call, IOException e) {
//                                                    String mMessage = e.getMessage().toString();
//                                                    Log.w("failure Response", mMessage);
//                                                }
//
//                                                @Override
//                                                public void onResponse(Call call, Response response) throws IOException {
//                                                    String mMessage = response.body().string();
//                                                    //code = response.code();
//                                                    getResponse(mMessage, response);
//                                                }
//                                            });
            Response response = client.newCall(request).execute();
            String result = response.body().toString();
        return result;

//            StringBuffer result;
//            Response response = client.newCall(request).execute();
//            result = new StringBuffer(response.body());
//
//            Log.i(TAG, "result: " + result.toString());
        }catch (Exception ex)
        {
            return ex.getMessage();
        }

    }


    public CMSLabelResponse GetCMSLabelfromServer(String HAWB){
        OkHttpClient client = new OkHttpClient();
        String url = END_POINT_DEV+"Printing/label/cms/"+HAWB;
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("cache-control", "no-cache")
                //.addHeader("Postman-Token", "5cd9ef20-d5df-4820-8749-4aa365c7a913")
                .build();
        try{
            Response response = client.newCall(request).execute();
            if(response.code() != 200){
                Log.e("Resposne",response.toString());
                return null;
            }
            if(response.body() != null){
                //JSONObject json = new JSONObject(response.body().string());
                Gson gson = new GsonBuilder().create();
                //Log.e("TAG",json.toString());
                CMSLabelResponse token =  gson.fromJson(response.body().string(), new TypeToken<CMSLabelResponse>() {
                }.getType());
                return  token;
            }
        }catch(Exception ex){
            Log.e(ex.getMessage(),TAG);
        }

        return null;
    }
    public void getResponse(String response, Response mainRes){

       try{
//           DocumentBuilder newDocumentBuilder =
//////                   DocumentBuilderFactory.newInstance().newDocumentBuilder();
//////           final Document parse = newDocumentBuilder.parse(new ByteArrayInputStream(response.getBytes()));
//////           //Log.i(TAG, "result: " + response);
//////
//////
//////           String dataString = parse.toString();
//////           ///Log.i(TAG, "result: " + dataString);
//////             String s=      parse.getElementsByTagName("Landmark").item(0).getTextContent();
//////           Log.i(TAG, "result: " + s);

           XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
           factory.setNamespaceAware(true);
           XmlPullParser xpp = factory.newPullParser();
           HashMap<String,String> user = new HashMap<>();
           xpp.setInput( new StringReader( response ) );
           int eventType = xpp.getEventType();
           String tag = "" , text = "";
           while (eventType!= XmlPullParser.END_DOCUMENT){
               tag = xpp.getName();
               switch (eventType){
                   case XmlPullParser.START_TAG:
                       Log.i("Start",xpp.getName());
                       break;
                   case XmlPullParser.TEXT:
                       Log.i("Text",xpp.getName());
                       break;
                   case XmlPullParser.END_TAG:
                       Log.i("End",xpp.getName());
                       break;
               }
               eventType = xpp.next();
           }
           Log.i(TAG,"End document");



//           SoapObject root = (SoapObject) response.getProperty(0);
//           SoapObject s_deals = (SoapObject) root.getProperty("diffgram");
//           SoapObject s_deals_1 = (SoapObject) s_deals.getProperty("DocumentElement");


         //  getFullNameFromXml(response,"Landmark");
       }catch (Exception ex){
           Log.i(TAG, "error: " + ex.getMessage());
       }
    }


    public Document loadXMLString(String response) throws Exception
    {
        DocumentBuilderFactory dbf =DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(response));
        return db.parse(is);
    }

    public List<String> getFullNameFromXml(String response, String tagName) throws Exception {
        Document xmlDoc = loadXMLString(response);
        NodeList nodeList = xmlDoc.getElementsByTagName(tagName);
        List<String> ids = new ArrayList<String>(nodeList.getLength());
        for(int i=0;i<nodeList.getLength(); i++) {
            Node x = nodeList.item(i);
            ids.add(x.getFirstChild().getNodeValue());

        }
        return ids;
    }
}
