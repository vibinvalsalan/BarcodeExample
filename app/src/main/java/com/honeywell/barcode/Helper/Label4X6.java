package com.honeywell.barcode.Helper;

import com.honeywell.barcode.Response.CMSLabelResponse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Label4X6 {
    public static String GetLabel4X6(CMSLabelResponse response){
        String BILL;
        BILL="SIZE 99.1 mm, 152.4 mm\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"DIRECTION 0,0\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"REFERENCE 0,0\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"OFFSET 0 mm\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"SET PEEL OFF\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"SET CUTTER OFF\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"SET PARTIAL_CUTTER OFF\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"SET TEAR ON\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"CLS\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BOX 10,27,790,1200,3\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"CODEPAGE 1254\r\nOUT \"ENDLINE\"\n";
        //BILL=BILL +"TEXT 740,1163,\"0\",180,12,12,\"Origin\"\r\nOUT \"ENDLINE\"\n";
        //BILL=BILL +"BARCODE 609,1190,\"128\",61,0,180,4,8,\""+response.getHawbs()+"\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 780,35,\"0\",90,12,12,\"HAWB:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 780,300,\"0\",90,12,12,\""+response.getHawbs()+"\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 780,500,\"0\",90,12,12,\"Status:"+response.getStatus()+"\"\r\nOUT \"ENDLINE\"\n";
        //BILL=BILL +"TEXT 60,300,\"0\",90,12,12,\"\"\r\nOUT \"ENDLINE\"\n";

        //BILL=BILL +"BAR 70,100, 10, 1\r\nOUT \"ENDLINE\"\n";


        BILL=BILL +"TEXT 720,35,\"0\",90,12,12,\"Pref Delivery Date:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 720,300,\"0\",90,12,12,\""+response.getPrefDeliveryDate()+"\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 720,700,\"0\",90,12,12,\"Time Frame:   "+response.getTimeframe()+"\"\r\nOUT \"ENDLINE\"\n";

        BILL=BILL +"TEXT 660,35,\"0\",90,12,12,\"Name:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 660,300,\"0\",90,12,12,\""+response.getName()+"\"\r\nOUT \"ENDLINE\"\n";

        BILL=BILL +"TEXT 600,35,\"0\",90,12,12,\"Company:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 600,300,\"0\",90,12,12,\""+response.getCompany()+"\"\r\nOUT \"ENDLINE\"\n";

        BILL=BILL +"TEXT 540,35,\"0\",90,12,12,\"Phone:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 540,300,\"0\",90,12,12,\""+response.getMobile()+"\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 540,700,\"0\",90,12,12,\"Other Tel:"+response.getTel1()+response.getTel2()+"\"\r\nOUT \"ENDLINE\"\n";

        BILL=BILL +"TEXT 480,35,\"0\",90,12,12,\"City:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 480,300,\"0\",90,12,12,\""+response.getCity()+"\"\r\nOUT \"ENDLINE\"\n";

        BILL=BILL +"TEXT 420,35,\"0\",90,11,11,\"Neighborhood:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 420,300,\"0\",90,12,12,\""+response.getCity()+"\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 420,700,\"0\",90,12,12,\"Courier Route:"+response.getCourierRoute()+"\"\r\nOUT \"ENDLINE\"\n";

        BILL=BILL +"TEXT 360,35,\"0\",90,12,12,\"Building:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 360,300,\"0\",90,12,12,\""+response.getBuilding()+"\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 360,700,\"0\",90,10,10,\"Floor :"+response.getFloor()+"\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 360,900,\"0\",90,10,10,\"Dept:"+response.getDepartment()+"\"\r\nOUT \"ENDLINE\"\n";

        BILL=BILL +"TEXT 300,35,\"0\",90,12,12,\"Building/Lot No:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 300,300,\"0\",90,12,12,\""+response.getWarehouseNo()+"\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 300,700,\"0\",90,10,10,\"Flat:"+response.getVillaNo()+"\"\r\nOUT \"ENDLINE\"\n";

        BILL=BILL +"TEXT 240,35,\"0\",90,12,12,\"Add Descript:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 240,300,\"0\",90,12,12,\""+response.getLandmark()+"\"\r\nOUT \"ENDLINE\"\n";

        BILL=BILL +"TEXT 180,35,\"0\",90,12,12,\"Street:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 180,300,\"0\",90,12,12,\""+response.getStreet()+"\"\r\nOUT \"ENDLINE\"\n";

        BILL=BILL +"TEXT 120,35,\"0\",90,12,12,\"Other Details:\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 120,300,\"0\",90,12,12,\""+response.getOtherdetails()+"\"\r\nOUT \"ENDLINE\"\n";


        BILL=BILL +"BAR 10,280, 790, 3\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 65,28, 3, 1170\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 125,28, 3, 1170\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 185,28, 3, 1170\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 245,28, 3, 1170\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 305,28, 3, 1170\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 365,28, 3, 1170\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 425,28, 3, 1170\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 485,28, 3, 1170\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 545,28, 3, 1170\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 605,28, 3, 1170\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 665,28, 3, 1170\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"BAR 725,28, 3, 1170\r\nOUT \"ENDLINE\"\n";

        //BILL=BILL +"BAR 11,240, 748, 3\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 60,35,\"0\",90,12,12,\"Waybill Entry :\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 60,300,\"0\",90,12,12,\""+response.getStaffName()+"\"\r\nOUT \"ENDLINE\"\n";
        BILL=BILL +"TEXT 60,700,\"0\",90,12,12,\"Entry Dt/tm :"+response.getEntryDt()+"\"\r\nOUT \"ENDLINE\"\n";

        //BILL=BILL +"BAR 11,1080, 748, 3\r\nOUT \"ENDLINE\"\n";

//        BILL=BILL +"BAR 11,1020, 748, 3\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,1010,\"0\",90,12,12,\"Pref Delivery Date\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 536,1010,\"0\",180,12,12,\""+response.getPrefDeliveryDate()+"\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"BAR 11,960, 748, 3\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 733,950,\"0\",90,12,12,\"Time Frame:"+response.getTimeframe()+"\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"BAR 11,900, 748, 3\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 734,890,\"0\",180,12,12,\"Name:"+response.getName()+"\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"BAR 11,840, 748, 3\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,830,\"0\",180,12,12,\"Company:"+response.getCompany()+"\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"BAR 11,780, 748, 3\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,770,\"0\",180,12,12,\"Phone:"+response.getMobile()+"\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 301,770,\"0\",180,12,12,\"Other Tel:"+response.getTel1()+"\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"BAR 11,720, 748, 3\r\nOUT \"ENDLINE\"\n";
//
//        BILL=BILL +"BAR 11,660, 748, 3\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,650,\"0\",180,11,11,\"Neighborhood :"+response.getRoute()+"\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 350,650,\"0\",180,12,12,\"Courier Route :"+response.getCourierRoute()+"\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"BAR 11,600, 748, 3\r\nOUT \"ENDLINE\"\n";
//
//        BILL=BILL +"BAR 11,540, 748, 3\r\nOUT \"ENDLINE\"\n";

//        BILL=BILL +"BAR 11,480, 748, 3\r\nOUT \"ENDLINE\"\n";
//
//        BILL=BILL +"BAR 11,420, 748, 3\r\nOUT \"ENDLINE\"\n";
//
//        BILL=BILL +"BAR 11,360, 748, 3\r\nOUT \"ENDLINE\"\n";
//
//        BILL=BILL +"BAR 11,300, 748, 3\r\nOUT \"ENDLINE\"\n";
//

        //BILL=BILL +"TEXT 440,1034,\"0\",180,10,10,\"Pick Up Date\"\r\nOUT \"ENDLINE\"\n";
        //BILL=BILL +"TEXT 252,1034,\"0\",180,10,10,\""+getTime(response.getPrefDeliveryDate())+"\"\r\nOUT \"ENDLINE\"\n";


        //BILL=BILL +"BAR 537,861, 3, 102\r\nOUT \"ENDLINE\"\n";
        //BILL=BILL +"BAR 309,861, 3, 102\r\nOUT \"ENDLINE\"\n";
        //BILL=BILL +"TEXT 707,905,\"0\",180,14,14,\""+response.getFloor()+"\"\r\nOUT \"ENDLINE\"\n";

        //BILL=BILL +"TEXT 462,905,\"0\",180,14,14,\""+response.getTimeframe()+"\"\r\nOUT \"ENDLINE\"\n";
        //BILL=BILL +"TEXT 452,950,\"0\",180,10,10,\"\"+response.getTimeframe()+\"\\\"\r\nOUT \"ENDLINE\"\n";
        //BILL=BILL +"TEXT 300,948,\"0\",180,10,10,\"Payment\"\r\nOUT \"ENDLINE\"\n";
        //BILL=BILL +"TEXT 192,901,\"0\",180,12,12,\""+response.getName()+"\"\r\nOUT \"ENDLINE\"\n";
        //BILL=BILL +"BAR 11,658, 748, 3\r\nOUT \"ENDLINE\"\n";

        //BILL=BILL +"TEXT 300,841,\"0\",180,10,10,\"Chargeable:"+response.getTimeframe()+"\"\r\nOUT \"ENDLINE\"\n";
















//        BILL=BILL +"TEXT 740,646,\"0\",180,10,10,\"From\"\r\nOUT \"ENDLINE\"\n";
//
//
//        BILL=BILL +"TEXT 301,705,\"0\",180,10,10,\"Pieces:"+response.getCompany()+"\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,646,\"0\",180,10,10,\"From\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,605,\"0\",180,10,10,\"Account:"+response.getCourierRoute()+"\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,573,\"0\",180,10,10,\"Aramex - DLC IT\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,540,\"0\",180,10,10,\"Gardiya Premachandra\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,507,\"0\",180,10,10,\"Aramex DLC IT Department\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,475,\"0\",180,10,10,\"Dubai\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 491,475,\"0\",180,10,10,\"United Arab Emirates\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"BAR 166,28, 3, 631\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"BARCODE 153,119,\"128\",41,0,90,4,8,\"44267452504\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 107,250,\"0\",90,12,12,\"*44267452504*\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,428,\"0\",180,10,10,\"Tel:97148707773\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"BAR 166,396, 593, 3\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"BAR 166,100, 593, 3\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,92,\"0\",180,10,10,\":Shpr Ref\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 536,92,\"0\",180,10,10,\"Con Ref: NewAramexDotCom\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,389,\"0\",180,10,10,\"To:\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 670,389,\"0\",180,10,10,\"Aramex Sharjah Call Center\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,357,\"0\",180,10,10,\"Sylvester David\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,324,\"0\",180,10,10,\"Aramex Sharjah Call Center\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,277,\"0\",180,10,10,\"Dubai-\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,244,\"0\",180,10,10,\"United Arab Emirates\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,212,\"0\",180,10,10,\"Tel:971554027086\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 746,179,\"0\",180,10,10,\":Fax\"\r\nOUT \"ENDLINE\"\n";
//        BILL=BILL +"TEXT 740,147,\"0\",180,10,10,\"Mob:971554027086\"\r\nOUT \"ENDLINE\"\n";
        return BILL;
    }
    public static String getTime(String dateString){
        try{
            Date date  = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(dateString);
            return date.toString();
        }catch (Exception e){
            return null;
        }
        //Date date  = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(dateString);
        //return date.toString();
    }
}
