package cn.wsct.pojo;

public class Coupon {
    private Integer cId;

    private String cTelephne;

    private String cDetails;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcTelephne() {
        return cTelephne;
    }

    public void setcTelephne(String cTelephne) {
        this.cTelephne = cTelephne == null ? null : cTelephne.trim();
    }

    public String getcDetails() {
        return cDetails;
    }

    public void setcDetails(String cDetails) {
        this.cDetails = cDetails == null ? null : cDetails.trim();
    }
}