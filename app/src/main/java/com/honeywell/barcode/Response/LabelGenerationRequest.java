package com.honeywell.barcode.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LabelGenerationRequest {

    @SerializedName("ClientInfo")
    private ClientInfo clientInfo;
    @SerializedName("LabelInfo")
    @Expose
    private LabelInfo labelInfo;
    @SerializedName("OriginEntity")
    @Expose
    private String originEntity;
    @SerializedName("ProductGroup")
    @Expose
    private String productGroup;
    @SerializedName("ShipmentNumber")
    @Expose
    private String shipmentNumber;
    @SerializedName("Transaction")
    @Expose
    private Transaction transaction;

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public LabelInfo getLabelInfo() {
        return labelInfo;
    }

    public void setLabelInfo(LabelInfo labelInfo) {
        this.labelInfo = labelInfo;
    }

    public String getOriginEntity() {
        return originEntity;
    }

    public void setOriginEntity(String originEntity) {
        this.originEntity = originEntity;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

}