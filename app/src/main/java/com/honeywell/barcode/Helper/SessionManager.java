package com.honeywell.barcode.Helper;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

//import com.example.vibin.test.LoginActivity;

import java.util.HashMap;

public class SessionManager {
    SharedPreferences pref;
    // Editor for Shared preferences
    SharedPreferences.Editor editor;
    // Context
    Context _context;
    // Shared pref mode
    int PRIVATE_MODE = 0;
    // Sharedpref file name
    private static final String PREF_NAME = "Pref";
    // All Shared Preferences Keys
    private static final String IS_LOGIN = "IsLoggedIn";
    // User name (make variable public to access from outside)
    public static final String KEY_NAME = "name";
    // Email address (make variable public to access from outside)
    public static final String KEY_EMAIL = "email";
    // Token
    public static final String KEY_TOKEN = "token";
    // Token Type
    public static final String KEY_TOKEN_TYPE = "type";
    public static final String KEY_PRINTER_NAME = "printer_name";
    public static final String KEY_PRINTER_MAC ="printer_mac";
    public static final String KEY_LOGIN_TYPE = "logintype";
    public static final String KEY_OFFLINE ="OFFLINE";
    public static final String KEY_ONLINE ="ONLINE";
    // Constructor
    public SessionManager(Context context){
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }
    /**
     * Create login session
     * */
    public void createLoginSession(String name, String email, String token, String tokentype){
        editor.putBoolean(IS_LOGIN, true);// Storing login value as TRUE
        editor.putString(KEY_NAME, name);// Storing name in pref
        editor.putString(KEY_EMAIL, email);// Storing email in pref
        editor.putString(KEY_TOKEN, token);// Storing token in pref
        editor.putString(KEY_TOKEN_TYPE, tokentype);// Storing token type in pref
        editor.putString(KEY_LOGIN_TYPE, KEY_ONLINE);// Storing Login Type in pref
        editor.commit();// commit changes
    }

    public void createLoginSession(String name, String email){
        editor.putBoolean(IS_LOGIN, true);// Storing login value as TRUE
        editor.putString(KEY_NAME, name);// Storing name in pref
        editor.putString(KEY_EMAIL, email);// Storing email in pref
        editor.putString(KEY_LOGIN_TYPE, KEY_OFFLINE);// Storing Login Type in pref
        editor.commit();// commit changes
    }

    public void addPrinter(String pname,String pmac){
        editor.putString(KEY_PRINTER_NAME,pname);
        editor.putString(KEY_PRINTER_MAC,pmac);
        editor.commit();
    }

    public String getPrinterName(){
        return pref.getString(KEY_PRINTER_NAME,null);
    }

    public String getPrinterMac(){
        return pref.getString(KEY_PRINTER_MAC,null);
    }
    /**
     * Check login method wil check user login status
     * If false it will redirect user to login page
     * Else won't do anything
     * */
    public void checkLogin(){
        // Check login status
        if(!this.isLoggedIn()){
            // user is not logged in redirect him to Login Activity
            //Intent i = new Intent(_context, LoginActivity.class);
            // Closing all the Activities
            //i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            // Add new Flag to start new Activity
            //i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            // Staring Login Activity
            //_context.startActivity(i);
        }

    }



    /**
     * Get stored session data
     * */
    public HashMap<String, String> getUserDetails(){
        HashMap<String, String> user = new HashMap<String, String>();
        user.put(KEY_NAME, pref.getString(KEY_NAME, null));// user name
        user.put(KEY_EMAIL, pref.getString(KEY_EMAIL, null));// user email id
        user.put(KEY_TOKEN, pref.getString(KEY_TOKEN, null));// user token
        user.put(KEY_TOKEN_TYPE, pref.getString(KEY_TOKEN_TYPE, null));// user token type
        user.put(KEY_LOGIN_TYPE, pref.getString(KEY_LOGIN_TYPE, null));// user login type
        // return user
        return user;
    }

    /**
     * Clear session details
     * */
    public void logoutUser(){
        // Clearing all data from Shared Preferences
        editor.clear();
        editor.commit();
        // After logout redirect user to Loing Activity
        //Intent i = new Intent(_context, LoginActivity.class);
        // Closing all the Activities
        //i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        // Add new Flag to start new Activity
        //i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        // Staring Login Activity
        //_context.startActivity(i);
    }

    /**
     * Quick check for login
     * **/
    // Get Login State
    public boolean isLoggedIn(){
        return pref.getBoolean(IS_LOGIN, false);
    }
}
