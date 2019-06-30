package cn.wsct.pojo;

public class Shoppingcar {
    private Integer scId;

    private String uTelephone;

    private String scDishname;

    private String scImg;

    private Double scPrice;

    private Integer scNumber;

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public String getuTelephone() {
        return uTelephone;
    }

    public void setuTelephone(String uTelephone) {
        this.uTelephone = uTelephone == null ? null : uTelephone.trim();
    }

    public String getScDishname() {
        return scDishname;
    }

    public void setScDishname(String scDishname) {
        this.scDishname = scDishname == null ? null : scDishname.trim();
    }

    public String getScImg() {
        return scImg;
    }

    public void setScImg(String scImg) {
        this.scImg = scImg == null ? null : scImg.trim();
    }

    public Double getScPrice() {
        return scPrice;
    }

    public void setScPrice(Double scPrice) {
        this.scPrice = scPrice;
    }

    public Integer getScNumber() {
        return scNumber;
    }

    public void setScNumber(Integer scNumber) {
        this.scNumber = scNumber;
    }
}