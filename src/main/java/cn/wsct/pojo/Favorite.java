package cn.wsct.pojo;

public class Favorite {
    private Integer fId;

    private String fTelephone;

    private String fDetail;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfTelephone() {
        return fTelephone;
    }

    public void setfTelephone(String fTelephone) {
        this.fTelephone = fTelephone == null ? null : fTelephone.trim();
    }

    public String getfDetail() {
        return fDetail;
    }

    public void setfDetail(String fDetail) {
        this.fDetail = fDetail == null ? null : fDetail.trim();
    }
}