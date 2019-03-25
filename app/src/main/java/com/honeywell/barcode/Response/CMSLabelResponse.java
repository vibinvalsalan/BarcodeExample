package com.honeywell.barcode.Response;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CMSLabelResponse {

    @SerializedName("CourierRoute")
    @Expose
    private String courierRoute;
    @SerializedName("Landmark")
    @Expose
    private String landmark;
    @SerializedName("PrefDeliveryDate")
    @Expose
    private String prefDeliveryDate;
    @SerializedName("StaffName")
    @Expose
    private String staffName;
    @SerializedName("Street")
    @Expose
    private String street;
    @SerializedName("VillaNo")
    @Expose
    private String villaNo;
    @SerializedName("WarehouseNo")
    @Expose
    private String warehouseNo;
    @SerializedName("area")
    @Expose
    private String area;
    @SerializedName("building")
    @Expose
    private String building;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("delivered")
    @Expose
    private Boolean delivered;
    @SerializedName("department")
    @Expose
    private String department;
    @SerializedName("entry_dt")
    @Expose
    private String entryDt;
    @SerializedName("floor")
    @Expose
    private String floor;
    @SerializedName("hawbs")
    @Expose
    private String hawbs;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("otherdetails")
    @Expose
    private String otherdetails;
    @SerializedName("printed")
    @Expose
    private Boolean printed;
    @SerializedName("reshedule")
    @Expose
    private Boolean reshedule;
    @SerializedName("route")
    @Expose
    private String route;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("tel1")
    @Expose
    private String tel1;
    @SerializedName("tel2")
    @Expose
    private String tel2;
    @SerializedName("timeframe")
    @Expose
    private String timeframe;

    public String getCourierRoute() {
        return courierRoute;
    }

    public void setCourierRoute(String courierRoute) {
        this.courierRoute = courierRoute;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPrefDeliveryDate() {
        return prefDeliveryDate;
    }

    public void setPrefDeliveryDate(String prefDeliveryDate) {
        this.prefDeliveryDate = prefDeliveryDate;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getVillaNo() {
        return villaNo;
    }

    public void setVillaNo(String villaNo) {
        this.villaNo = villaNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Boolean getDelivered() {
        return delivered;
    }

    public void setDelivered(Boolean delivered) {
        this.delivered = delivered;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEntryDt() {
        return entryDt;
    }

    public void setEntryDt(String entryDt) {
        this.entryDt = entryDt;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getHawbs() {
        return hawbs;
    }

    public void setHawbs(String hawbs) {
        this.hawbs = hawbs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherdetails() {
        return otherdetails;
    }

    public void setOtherdetails(String otherdetails) {
        this.otherdetails = otherdetails;
    }

    public Boolean getPrinted() {
        return printed;
    }

    public void setPrinted(Boolean printed) {
        this.printed = printed;
    }

    public Boolean getReshedule() {
        return reshedule;
    }

    public void setReshedule(Boolean reshedule) {
        this.reshedule = reshedule;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }

}