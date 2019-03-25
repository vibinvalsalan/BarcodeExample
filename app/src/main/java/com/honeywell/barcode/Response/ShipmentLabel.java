package com.honeywell.barcode.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ShipmentLabel {

    @SerializedName("LabelURL")
    @Expose
    private String labelURL;
    @SerializedName("LabelFileContents")
    @Expose
    private byte[] labelFileContents = null;

    public String getLabelURL() {
        return labelURL;
    }

    public void setLabelURL(String labelURL) {
        this.labelURL = labelURL;
    }

    public byte[] getLabelFileContents() {
        return labelFileContents;
    }

    public void setLabelFileContents(byte[] labelFileContents) {
        this.labelFileContents = labelFileContents;
    }

}