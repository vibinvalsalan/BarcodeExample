package com.honeywell.barcode.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LabelGenerationResponse {

    @SerializedName("Transaction")
    @Expose
    private Transaction transaction;
    @SerializedName("Notifications")
    @Expose
    private List<Notifications> notifications = null;
    @SerializedName("HasErrors")
    @Expose
    private Boolean hasErrors;
    @SerializedName("ShipmentNumber")
    @Expose
    private String shipmentNumber;
    @SerializedName("ShipmentLabel")
    @Expose
    private ShipmentLabel shipmentLabel;

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public List<Notifications> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notifications> notifications) {
        this.notifications = notifications;
    }

    public Boolean getHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public ShipmentLabel getShipmentLabel() {
        return shipmentLabel;
    }

    public void setShipmentLabel(ShipmentLabel shipmentLabel) {
        this.shipmentLabel = shipmentLabel;
    }

}