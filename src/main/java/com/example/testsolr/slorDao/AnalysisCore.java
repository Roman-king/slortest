package com.example.testsolr.slorDao;

import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;

public class AnalysisCore {
    @Field("assetsid")
    private String  AssetsID;
    @Field("assetname")
    private String  AssetName;
    @Field("categoryid")
    private String  CategoryID;
    @Field("statename")
    private String  StateName;
    @Field("stateid")
    private String  StateID;
    @Field("assetscoding")
    private String  AssetsCoding;
    @Field("categoryname")
    private String  CategoryName ;
    @Field("inbounddate")
    private String InboundDate;
    @Field("brands")
    private String Brands;
    @Field("source")
    private String Source;

    @Field("sourcename")
    private String SourceName;
    @Field("model")
    private String Model;
//    @Field("measuringunit")
//    private String MeasuringUnit;
//    @Field("channe")
//    private String Channe;
//    @Field("original")
//    private String Original;
//    @Field("buytime")
//    private String BuyTime;
//    @Field("useperiod")
//    private String useperiod;
//    @Field("snno")
//    private String SnNo;
//    @Field("purchasedate")
//    private String PurchaseDate;
//    @Field("overinsurancetime")
//    private String OverInsuranceTime;
//    @Field("imageuploadurl")
//    private String ImageUploadUrl;
//    @Field("configuration")
//    private String Configuration;
//    @Field("usename")
//    private String  UseName;
//    @Field("department")
//    private String Department;
//    @Field("useto")
//    private String USeTo;
//    @Field("recipientsdate")
//    private String RecipientsDate;
//    @Field("remark")
//    private String Remark;
//    @Field("customfield")
//    private String CustomField;
//    @Field("snconfiguration")
//    private String SNConfiguration;
//    @Field("createdate")
//    private String CreateDate;
//    @Field("tenantid")
//    private String TenantID;
//    @Field("updatedate")
//    private String UpdateDate;
//    @Field("departmentname")
//    private String DepartmentName;
//    @Field("usetoname")
//    private String USeToName;
//    @Field("suppliersname")
//    private String SuppliersName;
//    @Field("loginfoid")
//    private String LoginfoID;
//    @Field("operation")
//    private String operation;
//    @Field("content")
//    private String content;
//    @Field("userrealname")
//    private String  UserRealName;
    @Field("orderid")
    private String  OrderID;

    public String getAssetsID() {
        return AssetsID;
    }

    public void setAssetsID(String assetsID) {
        AssetsID = assetsID;
    }

    public String getAssetName() {
        return AssetName;
    }

    public void setAssetName(String assetName) {
        AssetName = assetName;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String stateName) {
        StateName = stateName;
    }

    public String getStateID() {
        return StateID;
    }

    public void setStateID(String stateID) {
        StateID = stateID;
    }

    public String getAssetsCoding() {
        return AssetsCoding;
    }

    public void setAssetsCoding(String assetsCoding) {
        AssetsCoding = assetsCoding;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getInboundDate() {
        return InboundDate;
    }

    public void setInboundDate(String inboundDate) {
        InboundDate = inboundDate;
    }

    public String getBrands() {
        return Brands;
    }

    public void setBrands(String brands) {
        Brands = brands;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getSourceName() {
        return SourceName;
    }

    public void setSourceName(String sourceName) {
        SourceName = sourceName;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

//    public String getMeasuringUnit() {
//        return MeasuringUnit;
//    }
//
//    public void setMeasuringUnit(String measuringUnit) {
//        MeasuringUnit = measuringUnit;
//    }
//
//    public String getChanne() {
//        return Channe;
//    }
//
//    public void setChanne(String channe) {
//        Channe = channe;
//    }
//
//    public String getOriginal() {
//        return Original;
//    }
//
//    public void setOriginal(String original) {
//        Original = original;
//    }
//
//    public String getBuyTime() {
//        return BuyTime;
//    }
//
//    public void setBuyTime(String buyTime) {
//        BuyTime = buyTime;
//    }
//
//    public String getUseperiod() {
//        return useperiod;
//    }
//
//    public void setUseperiod(String useperiod) {
//        this.useperiod = useperiod;
//    }
//
//    public String getSnNo() {
//        return SnNo;
//    }
//
//    public void setSnNo(String snNo) {
//        SnNo = snNo;
//    }
//
//    public String getPurchaseDate() {
//        return PurchaseDate;
//    }
//
//    public void setPurchaseDate(String purchaseDate) {
//        PurchaseDate = purchaseDate;
//    }

//    public String getOverInsuranceTime() {
//        return OverInsuranceTime;
//    }
//
//    public void setOverInsuranceTime(String overInsuranceTime) {
//        OverInsuranceTime = overInsuranceTime;
//    }
//
//    public String getImageUploadUrl() {
//        return ImageUploadUrl;
//    }
//
//    public void setImageUploadUrl(String imageUploadUrl) {
//        ImageUploadUrl = imageUploadUrl;
//    }
//
//    public String getConfiguration() {
//        return Configuration;
//    }
//
//    public void setConfiguration(String configuration) {
//        Configuration = configuration;
//    }
//
//    public String getUseName() {
//        return UseName;
//    }
//
//    public void setUseName(String useName) {
//        UseName = useName;
//    }
//
//    public String getDepartment() {
//        return Department;
//    }
//
//    public void setDepartment(String department) {
//        Department = department;
//    }
//
//    public String getUSeTo() {
//        return USeTo;
//    }
//
//    public void setUSeTo(String USeTo) {
//        this.USeTo = USeTo;
//    }
//
//    public String getRecipientsDate() {
//        return RecipientsDate;
//    }
//
//    public void setRecipientsDate(String recipientsDate) {
//        RecipientsDate = recipientsDate;
//    }
//
//    public String getRemark() {
//        return Remark;
//    }
//
//    public void setRemark(String remark) {
//        Remark = remark;
//    }
//
//    public String getCustomField() {
//        return CustomField;
//    }
//
//    public void setCustomField(String customField) {
//        CustomField = customField;
//    }
//
//    public String getSNConfiguration() {
//        return SNConfiguration;
//    }
//
//    public void setSNConfiguration(String SNConfiguration) {
//        this.SNConfiguration = SNConfiguration;
//    }
//
//    public String getCreateDate() {
//        return CreateDate;
//    }
//
//    public void setCreateDate(String createDate) {
//        CreateDate = createDate;
//    }
//
//    public String getTenantID() {
//        return TenantID;
//    }
//
//    public void setTenantID(String tenantID) {
//        TenantID = tenantID;
//    }
//
//    public String getUpdateDate() {
//        return UpdateDate;
//    }
//
//    public void setUpdateDate(String updateDate) {
//        UpdateDate = updateDate;
//    }
//
//    public String getDepartmentName() {
//        return DepartmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        DepartmentName = departmentName;
//    }
//
//    public String getUSeToName() {
//        return USeToName;
//    }
//
//    public void setUSeToName(String USeToName) {
//        this.USeToName = USeToName;
//    }
//
//    public String getSuppliersName() {
//        return SuppliersName;
//    }
//
//    public void setSuppliersName(String suppliersName) {
//        SuppliersName = suppliersName;
//    }
//
//    public String getLoginfoID() {
//        return LoginfoID;
//    }
//
//    public void setLoginfoID(String loginfoID) {
//        LoginfoID = loginfoID;
//    }
//
//    public String getOperation() {
//        return operation;
//    }
//
//    public void setOperation(String operation) {
//        this.operation = operation;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getUserRealName() {
//        return UserRealName;
//    }
//
//    public void setUserRealName(String userRealName) {
//        UserRealName = userRealName;
//    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }
}
