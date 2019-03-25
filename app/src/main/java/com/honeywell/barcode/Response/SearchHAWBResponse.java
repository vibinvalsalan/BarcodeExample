package com.honeywell.barcode.Response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class SearchHAWBResponse {


    @JsonProperty("id")
    private Integer id;
    @JsonProperty("awb")
    private String awb;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("destination")
    private String destination;
    //@JsonProperty("beyondOrigin")
    //private Integer beyondOrigin;
    //@JsonProperty("beyondDestination")
    //private Integer beyondDestination;
    @JsonProperty("originLocationCode")
    private String originLocationCode;
    @JsonProperty("destinationLocationCode")
    private String destinationLocationCode;
    @JsonProperty("productGroup")
    private String productGroup;
    @JsonProperty("type")
    private String type;
    @JsonProperty("services")
    private String services;
    @JsonProperty("skeleton")
    private Boolean skeleton;
    @JsonProperty("foreignHAWBNumber")
    private Object foreignHAWBNumber;
    @JsonProperty("collectionReference")
    private Object collectionReference;
    @JsonProperty("pickupDate")
    private String pickupDate;
    @JsonProperty("pickupBy")
    private String pickupBy;
    @JsonProperty("receivedAt")
    private String receivedAt;
    @JsonProperty("pcs")
    private Integer pcs;
    @JsonProperty("weight")
    private Float weight;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("chargingWeight")
    private Float chargingWeight;
    @JsonProperty("hawbDimensions")
    private String hawbDimensions;
    @JsonProperty("commodityCountryCode")
    private String commodityCountryCode;
    @JsonProperty("commodityDescription")
    private String commodityDescription;
    @JsonProperty("cmt")
    private String cmt;
    @JsonProperty("paymentType")
    private String paymentType;
    //@JsonProperty("srnNo")
    //private Object srnNo;
    @JsonProperty("customs")
    private Integer customs;
    @JsonProperty("collectAmount")
    private Integer collectAmount;
    @JsonProperty("customsCurrency")
    private String customsCurrency;
    @JsonProperty("collectCurrency")
    private String collectCurrency;
    @JsonProperty("cashValue")
    private Integer cashValue;
    @JsonProperty("cashCurrency")
    private Object cashCurrency;
    @JsonProperty("insuranceValue")
    private Integer insuranceValue;
    @JsonProperty("insuranceCurrency")
    private Object insuranceCurrency;
    @JsonProperty("codValue")
    private Integer codValue;
    @JsonProperty("codCurrency")
    private Object codCurrency;
    @JsonProperty("additionalAmtDescription")
    private Object additionalAmtDescription;
    @JsonProperty("shipperNumber")
    private String shipperNumber;
    @JsonProperty("shipperReference")
    private Object shipperReference;
    @JsonProperty("shipperReference2")
    private Object shipperReference2;
    @JsonProperty("shipperName")
    private String shipperName;
    @JsonProperty("sentBy")
    private String sentBy;
    @JsonProperty("shipperAddress")
    private String shipperAddress;
    @JsonProperty("shipperTel")
    private String shipperTel;
    @JsonProperty("shipperFax")
    private Object shipperFax;
    @JsonProperty("shipperEmail")
    private String shipperEmail;
    @JsonProperty("shipperId")
    private Integer shipperId;
    //@JsonProperty("shipperTeamId")
    //private Integer shipperTeamId;
    //@JsonProperty("prepaidRangeId")
    //private Integer prepaidRangeId;
    @JsonProperty("originCity")
    private String originCity;
    @JsonProperty("originState")
    private String originState;
    @JsonProperty("originZipCode")
    private Object originZipCode;
    @JsonProperty("originCountry")
    private String originCountry;
    @JsonProperty("consigneeNumber")
    private Object consigneeNumber;
    @JsonProperty("consigneeReference")
    private Object consigneeReference;
    @JsonProperty("consigneeReference2")
    private String consigneeReference2;
    @JsonProperty("consigneeName")
    private String consigneeName;
    @JsonProperty("attnOf")
    private String attnOf;
    @JsonProperty("consigneeAddress")
    private String consigneeAddress;
    @JsonProperty("consigneeTel")
    private String consigneeTel;
    @JsonProperty("consigneeFax")
    private Object consigneeFax;
    @JsonProperty("consigneeEmail")
    private Object consigneeEmail;
    @JsonProperty("consigneeId")
    private Integer consigneeId;
    @JsonProperty("consigneeTeamId")
    private Integer consigneeTeamId;
    @JsonProperty("destCity")
    private String destCity;
    @JsonProperty("destState")
    private String destState;
    @JsonProperty("destZipCode")
    private Object destZipCode;
    @JsonProperty("destCountry")
    private String destCountry;
    @JsonProperty("thirdParty")
    private Object thirdParty;
    @JsonProperty("thirdPartyNumber")
    private Object thirdPartyNumber;
    @JsonProperty("thirdPartyReference")
    private Object thirdPartyReference;
    @JsonProperty("thirdPartyReference2")
    private Object thirdPartyReference2;
    @JsonProperty("thirdPartyName")
    private Object thirdPartyName;
    @JsonProperty("thirdPartyAddress")
    private Object thirdPartyAddress;
    @JsonProperty("thirdPartyTel")
    private Object thirdPartyTel;
    @JsonProperty("thirdPartyCity")
    private Object thirdPartyCity;
    @JsonProperty("thirdPartyState")
    private Object thirdPartyState;
    @JsonProperty("thirdPartyZip")
    private Object thirdPartyZip;
    @JsonProperty("thirdPartyCountry")
    private Object thirdPartyCountry;
    @JsonProperty("thirdPartyId")
    private Integer thirdPartyId;
    @JsonProperty("thirdPartyTeamId")
    private Integer thirdPartyTeamId;
    @JsonProperty("reference1")
    private Object reference1;
    @JsonProperty("reference2")
    private Object reference2;
    @JsonProperty("reference3")
    private Object reference3;
    @JsonProperty("remarks")
    private Object remarks;
    @JsonProperty("alertedBy")
    private Object alertedBy;
    @JsonProperty("alertedDate")
    private String alertedDate;
    @JsonProperty("sourceId")
    private Integer sourceId;
    @JsonProperty("ts")
    private String ts;
    @JsonProperty("cube")
    private Integer cube;
    @JsonProperty("cubeUnit")
    private String cubeUnit;
    @JsonProperty("dueDate")
    private String dueDate;
    @JsonProperty("accountingInformation")
    private Object accountingInformation;
    @JsonProperty("handlingInformation")
    private Object handlingInformation;
    @JsonProperty("scheme")
    private Integer scheme;
    @JsonProperty("shipperTel2")
    private Object shipperTel2;
    @JsonProperty("shipperMobile")
    private String shipperMobile;
    @JsonProperty("consigneeTel2")
    private Object consigneeTel2;
    @JsonProperty("consigneeMobile")
    private String consigneeMobile;
    @JsonProperty("thirdPartyTel2")
    private Object thirdPartyTel2;
    @JsonProperty("thirdPartyMobile")
    private Object thirdPartyMobile;
    @JsonProperty("customsStatus")
    private Object customsStatus;
    @JsonProperty("weightSource")
    private Integer weightSource;
    @JsonProperty("dataSource")
    private Object dataSource;
    @JsonProperty("shipmentAnalysis")
    private Object shipmentAnalysis;
    @JsonProperty("shipmentHistories")
    private Object shipmentHistories;
    @JsonProperty("shipmentItems")
    private Object shipmentItems;
    @JsonProperty("shipmentContainers")
    private Object shipmentContainers;
    @JsonProperty("shipmentHolds")
    private Object shipmentHolds;
    @JsonProperty("shipmentOtherCharges")
    private Object shipmentOtherCharges;
    @JsonProperty("shipmentExtended")
    private Object shipmentExtended;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("awb")
    public String getAwb() {
        return awb;
    }

    @JsonProperty("awb")
    public void setAwb(String awb) {
        this.awb = awb;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

//    @JsonProperty("beyondOrigin")
//    public Integer getBeyondOrigin() {
//        return beyondOrigin;
//    }
//
//    @JsonProperty("beyondOrigin")
//    public void setBeyondOrigin(Integer beyondOrigin) {
//        this.beyondOrigin = beyondOrigin;
//    }

    //@JsonProperty("beyondDestination")
    //public Integer getBeyondDestination() {
    //    return beyondDestination;
    //}

    //@JsonProperty("beyondDestination")
//    public void setBeyondDestination(Integer beyondDestination) {
//        this.beyondDestination = beyondDestination;
//    }

    @JsonProperty("originLocationCode")
    public String getOriginLocationCode() {
        return originLocationCode;
    }

    @JsonProperty("originLocationCode")
    public void setOriginLocationCode(String originLocationCode) {
        this.originLocationCode = originLocationCode;
    }

    @JsonProperty("destinationLocationCode")
    public String getDestinationLocationCode() {
        return destinationLocationCode;
    }

    @JsonProperty("destinationLocationCode")
    public void setDestinationLocationCode(String destinationLocationCode) {
        this.destinationLocationCode = destinationLocationCode;
    }

    @JsonProperty("productGroup")
    public String getProductGroup() {
        return productGroup;
    }

    @JsonProperty("productGroup")
    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("services")
    public String getServices() {
        return services;
    }

    @JsonProperty("services")
    public void setServices(String services) {
        this.services = services;
    }

    @JsonProperty("skeleton")
    public Boolean getSkeleton() {
        return skeleton;
    }

    @JsonProperty("skeleton")
    public void setSkeleton(Boolean skeleton) {
        this.skeleton = skeleton;
    }

    @JsonProperty("foreignHAWBNumber")
    public Object getForeignHAWBNumber() {
        return foreignHAWBNumber;
    }

    @JsonProperty("foreignHAWBNumber")
    public void setForeignHAWBNumber(Object foreignHAWBNumber) {
        this.foreignHAWBNumber = foreignHAWBNumber;
    }

    @JsonProperty("collectionReference")
    public Object getCollectionReference() {
        return collectionReference;
    }

    @JsonProperty("collectionReference")
    public void setCollectionReference(Object collectionReference) {
        this.collectionReference = collectionReference;
    }

    @JsonProperty("pickupDate")
    public String getPickupDate() {
        return pickupDate;
    }

    @JsonProperty("pickupDate")
    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    @JsonProperty("pickupBy")
    public Object getPickupBy() {
        return pickupBy;
    }

    @JsonProperty("pickupBy")
    public void setPickupBy(String pickupBy) {
        this.pickupBy = pickupBy;
    }

    @JsonProperty("receivedAt")
    public String getReceivedAt() {
        return receivedAt;
    }

    @JsonProperty("receivedAt")
    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    @JsonProperty("pcs")
    public Integer getPcs() {
        return pcs;
    }

    @JsonProperty("pcs")
    public void setPcs(Integer pcs) {
        this.pcs = pcs;
    }

    @JsonProperty("weight")
    public Float getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("chargingWeight")
    public Float getChargingWeight() {
        return chargingWeight;
    }

    @JsonProperty("chargingWeight")
    public void setChargingWeight(Float chargingWeight) {
        this.chargingWeight = chargingWeight;
    }

    @JsonProperty("hawbDimensions")
    public String getHawbDimensions() {
        return hawbDimensions;
    }

    @JsonProperty("hawbDimensions")
    public void setHawbDimensions(String hawbDimensions) {
        this.hawbDimensions = hawbDimensions;
    }

    @JsonProperty("commodityCountryCode")
    public String getCommodityCountryCode() {
        return commodityCountryCode;
    }

    @JsonProperty("commodityCountryCode")
    public void setCommodityCountryCode(String commodityCountryCode) {
        this.commodityCountryCode = commodityCountryCode;
    }

    @JsonProperty("commodityDescription")
    public String getCommodityDescription() {
        return commodityDescription;
    }

    @JsonProperty("commodityDescription")
    public void setCommodityDescription(String commodityDescription) {
        this.commodityDescription = commodityDescription;
    }

    @JsonProperty("cmt")
    public String getCmt() {
        return cmt;
    }

    @JsonProperty("cmt")
    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    @JsonProperty("paymentType")
    public String getPaymentType() {
        return paymentType;
    }

    @JsonProperty("paymentType")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

//    @JsonProperty("srnNo")
//    public Object getSrnNo() {
//        return srnNo;
//    }
//
//    @JsonProperty("srnNo")
//    public void setSrnNo(Object srnNo) {
//        this.srnNo = srnNo;
//    }

    @JsonProperty("customs")
    public Integer getCustoms() {
        return customs;
    }

    @JsonProperty("customs")
    public void setCustoms(Integer customs) {
        this.customs = customs;
    }

    @JsonProperty("collectAmount")
    public Integer getCollectAmount() {
        return collectAmount;
    }

    @JsonProperty("collectAmount")
    public void setCollectAmount(Integer collectAmount) {
        this.collectAmount = collectAmount;
    }

    @JsonProperty("customsCurrency")
    public String getCustomsCurrency() {
        return customsCurrency;
    }

    @JsonProperty("customsCurrency")
    public void setCustomsCurrency(String customsCurrency) {
        this.customsCurrency = customsCurrency;
    }

    @JsonProperty("collectCurrency")
    public String getCollectCurrency() {
        return collectCurrency;
    }

    @JsonProperty("collectCurrency")
    public void setCollectCurrency(String collectCurrency) {
        this.collectCurrency = collectCurrency;
    }

    @JsonProperty("cashValue")
    public Integer getCashValue() {
        return cashValue;
    }

    @JsonProperty("cashValue")
    public void setCashValue(Integer cashValue) {
        this.cashValue = cashValue;
    }

    @JsonProperty("cashCurrency")
    public Object getCashCurrency() {
        return cashCurrency;
    }

    @JsonProperty("cashCurrency")
    public void setCashCurrency(Object cashCurrency) {
        this.cashCurrency = cashCurrency;
    }

    @JsonProperty("insuranceValue")
    public Integer getInsuranceValue() {
        return insuranceValue;
    }

    @JsonProperty("insuranceValue")
    public void setInsuranceValue(Integer insuranceValue) {
        this.insuranceValue = insuranceValue;
    }

    @JsonProperty("insuranceCurrency")
    public Object getInsuranceCurrency() {
        return insuranceCurrency;
    }

    @JsonProperty("insuranceCurrency")
    public void setInsuranceCurrency(Object insuranceCurrency) {
        this.insuranceCurrency = insuranceCurrency;
    }

    @JsonProperty("codValue")
    public Integer getCodValue() {
        return codValue;
    }

    @JsonProperty("codValue")
    public void setCodValue(Integer codValue) {
        this.codValue = codValue;
    }

    @JsonProperty("codCurrency")
    public Object getCodCurrency() {
        return codCurrency;
    }

    @JsonProperty("codCurrency")
    public void setCodCurrency(Object codCurrency) {
        this.codCurrency = codCurrency;
    }

    @JsonProperty("additionalAmtDescription")
    public Object getAdditionalAmtDescription() {
        return additionalAmtDescription;
    }

    @JsonProperty("additionalAmtDescription")
    public void setAdditionalAmtDescription(Object additionalAmtDescription) {
        this.additionalAmtDescription = additionalAmtDescription;
    }

    @JsonProperty("shipperNumber")
    public String getShipperNumber() {
        return shipperNumber;
    }

    @JsonProperty("shipperNumber")
    public void setShipperNumber(String shipperNumber) {
        this.shipperNumber = shipperNumber;
    }

    @JsonProperty("shipperReference")
    public Object getShipperReference() {
        return shipperReference;
    }

    @JsonProperty("shipperReference")
    public void setShipperReference(Object shipperReference) {
        this.shipperReference = shipperReference;
    }

    @JsonProperty("shipperReference2")
    public Object getShipperReference2() {
        return shipperReference2;
    }

    @JsonProperty("shipperReference2")
    public void setShipperReference2(Object shipperReference2) {
        this.shipperReference2 = shipperReference2;
    }

    @JsonProperty("shipperName")
    public String getShipperName() {
        return shipperName;
    }

    @JsonProperty("shipperName")
    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    @JsonProperty("sentBy")
    public String getSentBy() {
        return sentBy;
    }

    @JsonProperty("sentBy")
    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }

    @JsonProperty("shipperAddress")
    public String getShipperAddress() {
        return shipperAddress;
    }

    @JsonProperty("shipperAddress")
    public void setShipperAddress(String shipperAddress) {
        this.shipperAddress = shipperAddress;
    }

    @JsonProperty("shipperTel")
    public String getShipperTel() {
        return shipperTel;
    }

    @JsonProperty("shipperTel")
    public void setShipperTel(String shipperTel) {
        this.shipperTel = shipperTel;
    }

    @JsonProperty("shipperFax")
    public Object getShipperFax() {
        return shipperFax;
    }

    @JsonProperty("shipperFax")
    public void setShipperFax(Object shipperFax) {
        this.shipperFax = shipperFax;
    }

    @JsonProperty("shipperEmail")
    public String getShipperEmail() {
        return shipperEmail;
    }

    @JsonProperty("shipperEmail")
    public void setShipperEmail(String shipperEmail) {
        this.shipperEmail = shipperEmail;
    }

    @JsonProperty("shipperId")
    public Integer getShipperId() {
        return shipperId;
    }

    @JsonProperty("shipperId")
    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

//    @JsonProperty("shipperTeamId")
//    public Integer getShipperTeamId() {
//        return shipperTeamId;
//    }
//
//    @JsonProperty("shipperTeamId")
//    public void setShipperTeamId(Integer shipperTeamId) {
//        this.shipperTeamId = shipperTeamId;
//    }
//
//    @JsonProperty("prepaidRangeId")
//    public Integer getPrepaidRangeId() {
//        return prepaidRangeId;
//    }
//
//    @JsonProperty("prepaidRangeId")
//    public void setPrepaidRangeId(Integer prepaidRangeId) {
//        this.prepaidRangeId = prepaidRangeId;
//    }

    @JsonProperty("originCity")
    public String getOriginCity() {
        return originCity;
    }

    @JsonProperty("originCity")
    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    @JsonProperty("originState")
    public String getOriginState() {
        return originState;
    }

    @JsonProperty("originState")
    public void setOriginState(String originState) {
        this.originState = originState;
    }

    @JsonProperty("originZipCode")
    public Object getOriginZipCode() {
        return originZipCode;
    }

    @JsonProperty("originZipCode")
    public void setOriginZipCode(Object originZipCode) {
        this.originZipCode = originZipCode;
    }

    @JsonProperty("originCountry")
    public String getOriginCountry() {
        return originCountry;
    }

    @JsonProperty("originCountry")
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    @JsonProperty("consigneeNumber")
    public Object getConsigneeNumber() {
        return consigneeNumber;
    }

    @JsonProperty("consigneeNumber")
    public void setConsigneeNumber(Object consigneeNumber) {
        this.consigneeNumber = consigneeNumber;
    }

    @JsonProperty("consigneeReference")
    public Object getConsigneeReference() {
        return consigneeReference;
    }

    @JsonProperty("consigneeReference")
    public void setConsigneeReference(Object consigneeReference) {
        this.consigneeReference = consigneeReference;
    }

    @JsonProperty("consigneeReference2")
    public String getConsigneeReference2() {
        return consigneeReference2;
    }

    @JsonProperty("consigneeReference2")
    public void setConsigneeReference2(String consigneeReference2) {
        this.consigneeReference2 = consigneeReference2;
    }

    @JsonProperty("consigneeName")
    public String getConsigneeName() {
        return consigneeName;
    }

    @JsonProperty("consigneeName")
    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    @JsonProperty("attnOf")
    public String getAttnOf() {
        return attnOf;
    }

    @JsonProperty("attnOf")
    public void setAttnOf(String attnOf) {
        this.attnOf = attnOf;
    }

    @JsonProperty("consigneeAddress")
    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    @JsonProperty("consigneeAddress")
    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    @JsonProperty("consigneeTel")
    public String getConsigneeTel() {
        return consigneeTel;
    }

    @JsonProperty("consigneeTel")
    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    @JsonProperty("consigneeFax")
    public Object getConsigneeFax() {
        return consigneeFax;
    }

    @JsonProperty("consigneeFax")
    public void setConsigneeFax(Object consigneeFax) {
        this.consigneeFax = consigneeFax;
    }

    @JsonProperty("consigneeEmail")
    public Object getConsigneeEmail() {
        return consigneeEmail;
    }

    @JsonProperty("consigneeEmail")
    public void setConsigneeEmail(Object consigneeEmail) {
        this.consigneeEmail = consigneeEmail;
    }

    @JsonProperty("consigneeId")
    public Integer getConsigneeId() {
        return consigneeId;
    }

    @JsonProperty("consigneeId")
    public void setConsigneeId(Integer consigneeId) {
        this.consigneeId = consigneeId;
    }

    @JsonProperty("consigneeTeamId")
    public Integer getConsigneeTeamId() {
        return consigneeTeamId;
    }

    @JsonProperty("consigneeTeamId")
    public void setConsigneeTeamId(Integer consigneeTeamId) {
        this.consigneeTeamId = consigneeTeamId;
    }

    @JsonProperty("destCity")
    public String getDestCity() {
        return destCity;
    }

    @JsonProperty("destCity")
    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    @JsonProperty("destState")
    public String getDestState() {
        return destState;
    }

    @JsonProperty("destState")
    public void setDestState(String destState) {
        this.destState = destState;
    }

    @JsonProperty("destZipCode")
    public Object getDestZipCode() {
        return destZipCode;
    }

    @JsonProperty("destZipCode")
    public void setDestZipCode(Object destZipCode) {
        this.destZipCode = destZipCode;
    }

    @JsonProperty("destCountry")
    public String getDestCountry() {
        return destCountry;
    }

    @JsonProperty("destCountry")
    public void setDestCountry(String destCountry) {
        this.destCountry = destCountry;
    }

    @JsonProperty("thirdParty")
    public Object getThirdParty() {
        return thirdParty;
    }

    @JsonProperty("thirdParty")
    public void setThirdParty(Object thirdParty) {
        this.thirdParty = thirdParty;
    }

    @JsonProperty("thirdPartyNumber")
    public Object getThirdPartyNumber() {
        return thirdPartyNumber;
    }

    @JsonProperty("thirdPartyNumber")
    public void setThirdPartyNumber(Object thirdPartyNumber) {
        this.thirdPartyNumber = thirdPartyNumber;
    }

    @JsonProperty("thirdPartyReference")
    public Object getThirdPartyReference() {
        return thirdPartyReference;
    }

    @JsonProperty("thirdPartyReference")
    public void setThirdPartyReference(Object thirdPartyReference) {
        this.thirdPartyReference = thirdPartyReference;
    }

    @JsonProperty("thirdPartyReference2")
    public Object getThirdPartyReference2() {
        return thirdPartyReference2;
    }

    @JsonProperty("thirdPartyReference2")
    public void setThirdPartyReference2(Object thirdPartyReference2) {
        this.thirdPartyReference2 = thirdPartyReference2;
    }

    @JsonProperty("thirdPartyName")
    public Object getThirdPartyName() {
        return thirdPartyName;
    }

    @JsonProperty("thirdPartyName")
    public void setThirdPartyName(Object thirdPartyName) {
        this.thirdPartyName = thirdPartyName;
    }

    @JsonProperty("thirdPartyAddress")
    public Object getThirdPartyAddress() {
        return thirdPartyAddress;
    }

    @JsonProperty("thirdPartyAddress")
    public void setThirdPartyAddress(Object thirdPartyAddress) {
        this.thirdPartyAddress = thirdPartyAddress;
    }

    @JsonProperty("thirdPartyTel")
    public Object getThirdPartyTel() {
        return thirdPartyTel;
    }

    @JsonProperty("thirdPartyTel")
    public void setThirdPartyTel(Object thirdPartyTel) {
        this.thirdPartyTel = thirdPartyTel;
    }

    @JsonProperty("thirdPartyCity")
    public Object getThirdPartyCity() {
        return thirdPartyCity;
    }

    @JsonProperty("thirdPartyCity")
    public void setThirdPartyCity(Object thirdPartyCity) {
        this.thirdPartyCity = thirdPartyCity;
    }

    @JsonProperty("thirdPartyState")
    public Object getThirdPartyState() {
        return thirdPartyState;
    }

    @JsonProperty("thirdPartyState")
    public void setThirdPartyState(Object thirdPartyState) {
        this.thirdPartyState = thirdPartyState;
    }

    @JsonProperty("thirdPartyZip")
    public Object getThirdPartyZip() {
        return thirdPartyZip;
    }

    @JsonProperty("thirdPartyZip")
    public void setThirdPartyZip(Object thirdPartyZip) {
        this.thirdPartyZip = thirdPartyZip;
    }

    @JsonProperty("thirdPartyCountry")
    public Object getThirdPartyCountry() {
        return thirdPartyCountry;
    }

    @JsonProperty("thirdPartyCountry")
    public void setThirdPartyCountry(Object thirdPartyCountry) {
        this.thirdPartyCountry = thirdPartyCountry;
    }

    @JsonProperty("thirdPartyId")
    public Integer getThirdPartyId() {
        return thirdPartyId;
    }

    @JsonProperty("thirdPartyId")
    public void setThirdPartyId(Integer thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    @JsonProperty("thirdPartyTeamId")
    public Integer getThirdPartyTeamId() {
        return thirdPartyTeamId;
    }

    @JsonProperty("thirdPartyTeamId")
    public void setThirdPartyTeamId(Integer thirdPartyTeamId) {
        this.thirdPartyTeamId = thirdPartyTeamId;
    }

    @JsonProperty("reference1")
    public Object getReference1() {
        return reference1;
    }

    @JsonProperty("reference1")
    public void setReference1(Object reference1) {
        this.reference1 = reference1;
    }

    @JsonProperty("reference2")
    public Object getReference2() {
        return reference2;
    }

    @JsonProperty("reference2")
    public void setReference2(Object reference2) {
        this.reference2 = reference2;
    }

    @JsonProperty("reference3")
    public Object getReference3() {
        return reference3;
    }

    @JsonProperty("reference3")
    public void setReference3(Object reference3) {
        this.reference3 = reference3;
    }

    @JsonProperty("remarks")
    public Object getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(Object remarks) {
        this.remarks = remarks;
    }

    @JsonProperty("alertedBy")
    public Object getAlertedBy() {
        return alertedBy;
    }

    @JsonProperty("alertedBy")
    public void setAlertedBy(Object alertedBy) {
        this.alertedBy = alertedBy;
    }

    @JsonProperty("alertedDate")
    public String getAlertedDate() {
        return alertedDate;
    }

    @JsonProperty("alertedDate")
    public void setAlertedDate(String alertedDate) {
        this.alertedDate = alertedDate;
    }

    @JsonProperty("sourceId")
    public Integer getSourceId() {
        return sourceId;
    }

    @JsonProperty("sourceId")
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    @JsonProperty("ts")
    public String getTs() {
        return ts;
    }

    @JsonProperty("ts")
    public void setTs(String ts) {
        this.ts = ts;
    }

    @JsonProperty("cube")
    public Integer getCube() {
        return cube;
    }

    @JsonProperty("cube")
    public void setCube(Integer cube) {
        this.cube = cube;
    }

    @JsonProperty("cubeUnit")
    public String getCubeUnit() {
        return cubeUnit;
    }

    @JsonProperty("cubeUnit")
    public void setCubeUnit(String cubeUnit) {
        this.cubeUnit = cubeUnit;
    }

    @JsonProperty("dueDate")
    public String getDueDate() {
        return dueDate;
    }

    @JsonProperty("dueDate")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @JsonProperty("accountingInformation")
    public Object getAccountingInformation() {
        return accountingInformation;
    }

    @JsonProperty("accountingInformation")
    public void setAccountingInformation(Object accountingInformation) {
        this.accountingInformation = accountingInformation;
    }

    @JsonProperty("handlingInformation")
    public Object getHandlingInformation() {
        return handlingInformation;
    }

    @JsonProperty("handlingInformation")
    public void setHandlingInformation(Object handlingInformation) {
        this.handlingInformation = handlingInformation;
    }

    @JsonProperty("scheme")
    public Integer getScheme() {
        return scheme;
    }

    @JsonProperty("scheme")
    public void setScheme(Integer scheme) {
        this.scheme = scheme;
    }

    @JsonProperty("shipperTel2")
    public Object getShipperTel2() {
        return shipperTel2;
    }

    @JsonProperty("shipperTel2")
    public void setShipperTel2(Object shipperTel2) {
        this.shipperTel2 = shipperTel2;
    }

    @JsonProperty("shipperMobile")
    public String getShipperMobile() {
        return shipperMobile;
    }

    @JsonProperty("shipperMobile")
    public void setShipperMobile(String shipperMobile) {
        this.shipperMobile = shipperMobile;
    }

    @JsonProperty("consigneeTel2")
    public Object getConsigneeTel2() {
        return consigneeTel2;
    }

    @JsonProperty("consigneeTel2")
    public void setConsigneeTel2(Object consigneeTel2) {
        this.consigneeTel2 = consigneeTel2;
    }

    @JsonProperty("consigneeMobile")
    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    @JsonProperty("consigneeMobile")
    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    @JsonProperty("thirdPartyTel2")
    public Object getThirdPartyTel2() {
        return thirdPartyTel2;
    }

    @JsonProperty("thirdPartyTel2")
    public void setThirdPartyTel2(Object thirdPartyTel2) {
        this.thirdPartyTel2 = thirdPartyTel2;
    }

    @JsonProperty("thirdPartyMobile")
    public Object getThirdPartyMobile() {
        return thirdPartyMobile;
    }

    @JsonProperty("thirdPartyMobile")
    public void setThirdPartyMobile(Object thirdPartyMobile) {
        this.thirdPartyMobile = thirdPartyMobile;
    }

    @JsonProperty("customsStatus")
    public Object getCustomsStatus() {
        return customsStatus;
    }

    @JsonProperty("customsStatus")
    public void setCustomsStatus(Object customsStatus) {
        this.customsStatus = customsStatus;
    }

    @JsonProperty("weightSource")
    public Integer getWeightSource() {
        return weightSource;
    }

    @JsonProperty("weightSource")
    public void setWeightSource(Integer weightSource) {
        this.weightSource = weightSource;
    }

    @JsonProperty("dataSource")
    public Object getDataSource() {
        return dataSource;
    }

    @JsonProperty("dataSource")
    public void setDataSource(Object dataSource) {
        this.dataSource = dataSource;
    }

    @JsonProperty("shipmentAnalysis")
    public Object getShipmentAnalysis() {
        return shipmentAnalysis;
    }

    @JsonProperty("shipmentAnalysis")
    public void setShipmentAnalysis(Object shipmentAnalysis) {
        this.shipmentAnalysis = shipmentAnalysis;
    }

    @JsonProperty("shipmentHistories")
    public Object getShipmentHistories() {
        return shipmentHistories;
    }

    @JsonProperty("shipmentHistories")
    public void setShipmentHistories(Object shipmentHistories) {
        this.shipmentHistories = shipmentHistories;
    }

    @JsonProperty("shipmentItems")
    public Object getShipmentItems() {
        return shipmentItems;
    }

    @JsonProperty("shipmentItems")
    public void setShipmentItems(Object shipmentItems) {
        this.shipmentItems = shipmentItems;
    }

    @JsonProperty("shipmentContainers")
    public Object getShipmentContainers() {
        return shipmentContainers;
    }

    @JsonProperty("shipmentContainers")
    public void setShipmentContainers(Object shipmentContainers) {
        this.shipmentContainers = shipmentContainers;
    }

    @JsonProperty("shipmentHolds")
    public Object getShipmentHolds() {
        return shipmentHolds;
    }

    @JsonProperty("shipmentHolds")
    public void setShipmentHolds(Object shipmentHolds) {
        this.shipmentHolds = shipmentHolds;
    }

    @JsonProperty("shipmentOtherCharges")
    public Object getShipmentOtherCharges() {
        return shipmentOtherCharges;
    }

    @JsonProperty("shipmentOtherCharges")
    public void setShipmentOtherCharges(Object shipmentOtherCharges) {
        this.shipmentOtherCharges = shipmentOtherCharges;
    }

    @JsonProperty("shipmentExtended")
    public Object getShipmentExtended() {
        return shipmentExtended;
    }

    @JsonProperty("shipmentExtended")
    public void setShipmentExtended(Object shipmentExtended) {
        this.shipmentExtended = shipmentExtended;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}