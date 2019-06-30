package cn.wsct.pojo;

public class Address {
    private Integer aId;

    private String aTelephone;

    private String aProvince;

    private String aCity;

    private String aArea;

    private String aUsername;

    private String aStreet;

    private String aPostcode;

    private String aPhone;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaTelephone() {
        return aTelephone;
    }

    public void setaTelephone(String aTelephone) {
        this.aTelephone = aTelephone == null ? null : aTelephone.trim();
    }

    public String getaProvince() {
        return aProvince;
    }

    public void setaProvince(String aProvince) {
        this.aProvince = aProvince == null ? null : aProvince.trim();
    }

    public String getaCity() {
        return aCity;
    }

    public void setaCity(String aCity) {
        this.aCity = aCity == null ? null : aCity.trim();
    }

    public String getaArea() {
        return aArea;
    }

    public void setaArea(String aArea) {
        this.aArea = aArea == null ? null : aArea.trim();
    }

    public String getaUsername() {
        return aUsername;
    }

    public void setaUsername(String aUsername) {
        this.aUsername = aUsername == null ? null : aUsername.trim();
    }

    public String getaStreet() {
        return aStreet;
    }

    public void setaStreet(String aStreet) {
        this.aStreet = aStreet == null ? null : aStreet.trim();
    }

    public String getaPostcode() {
        return aPostcode;
    }

    public void setaPostcode(String aPostcode) {
        this.aPostcode = aPostcode == null ? null : aPostcode.trim();
    }

    public String getaPhone() {
        return aPhone;
    }

    public void setaPhone(String aPhone) {
        this.aPhone = aPhone == null ? null : aPhone.trim();
    }
}