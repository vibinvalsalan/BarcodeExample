package com.honeywell.barcode.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LabelInfo {

    @SerializedName("ReportID")
    @Expose
    private Integer reportID;
    @SerializedName("ReportType")
    @Expose
    private String reportType;

    public Integer getReportID() {
        return reportID;
    }

    public void setReportID(Integer reportID) {
        this.reportID = reportID;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

}