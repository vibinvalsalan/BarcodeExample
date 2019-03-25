package com.honeywell.barcode.Helper;

import java.util.HashMap;

public class Helper {
    private HashMap<String, String> map;
 public String GetCodeType(String code) {
     return map.get(code);
 }

   public Helper(){
  map = new HashMap<>();
  map.put("E","UPCE");
  map.put("G","BC412");
  map.put("H","HAN_XIN_CODE");
  map.put("I","GS1_128");
  map.put("J","JAPAN_POST");
  map.put("K","KIX_CODE");
  map.put("L","PLANET_CODE");
  map.put("M","USPS_4_STATE, INTELLIGENT_MAIL");
  map.put("N","UPU_4_STATE, ID_TAGS");
  map.put("O","OCR");
  map.put( "P","POSTNET");
  map.put( "Q","HK25, CHINA_POST");
  map.put("R","MICROPDF");
  map.put( "S","SECURE_CODE");
  map.put("T","TLC39");
  map.put("U","ULTRACODE");
  map.put("V","CODABLOCK_A");
  map.put( "W","POSICODE");
  map.put("X","GRID_MATRIX" );
  map.put("Y","NEC25");
  map.put("Z","MESA");
  map.put("a","CODABAR");
  map.put("b","CODE39");
  map.put("c","UPCA");
  map.put("d","EAN13");
  map.put("e","I25");
  map.put("f","S25 (2BAR and 3BAR)");
  map.put("g","MSI");
  map.put("h","CODE11");
  map.put("i","CODE93");
  map.put("j","CODE128");
  map.put("k","UNUSED");
  map.put("l","CODE49");
  map.put("m","M25");
  map.put("n","PLESSEY");
  map.put("o","CODE16K");
  map.put("p","CHANNELCODE");
  map.put("q","CODABLOCK_F");
  map.put("r","PDF417");
  map.put("s","QRCODE");
  map.put("-","MICROQR_ALT");
  map.put("t","TELEPEN");
  map.put("u","CODEZ");
  map.put("v","VERICODE");
  map.put("w","DATAMATRIX");
  map.put("x","MAXICODE");
  map.put("y","RSS,GS1_DATABAR,COMPOSITE");
  map.put("{","GS1_DATABAR_LIM");
  map.put("}","GS1_DATABAR_EXP");
  map.put("z","AZTEC_CODE");
  }

 }

