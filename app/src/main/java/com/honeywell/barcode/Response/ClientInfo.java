package com.honeywell.barcode.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientInfo {

    @SerializedName("Source")
    @Expose
    private Integer source;
    @SerializedName("AccountCountryCode")
    private String accountCountryCode;
    @SerializedName("AccountEntity")
    @Expose
    private String accountEntity;
    @SerializedName("AccountPin")
    @Expose
    private String accountPin;
    @SerializedName("AccountNumber")
    @Expose
    private String accountNumber;
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("Password")
    @Expose
    private String password;
    @SerializedName("Version")
    @Expose
    private String version;

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getAccountCountryCode() {
        return accountCountryCode;
    }

    public void setAccountCountryCode(String accountCountryCode) {
        this.accountCountryCode = accountCountryCode;
    }

    public String getAccountEntity() {
        return accountEntity;
    }

    public void setAccountEntity(String accountEntity) {
        this.accountEntity = accountEntity;
    }

    public String getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(String accountPin) {
        this.accountPin = accountPin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}