package cn.wsct.pojo;

public class Shop {
    private Integer sId;

    private String sShopname;

    private String sAddress;

    private String sTelephone;

    private String sCharacteristic;

    private String sActivity;

    private String sParking;

    private String sBusinesshours;

    private String sWifi;

    private String sPrice;

    private Double sScore;

    private String sIntroduce;

    private String sImage;

    private String sClassification;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsShopname() {
        return sShopname;
    }

    public void setsShopname(String sShopname) {
        this.sShopname = sShopname == null ? null : sShopname.trim();
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public String getsTelephone() {
        return sTelephone;
    }

    public void setsTelephone(String sTelephone) {
        this.sTelephone = sTelephone == null ? null : sTelephone.trim();
    }

    public String getsCharacteristic() {
        return sCharacteristic;
    }

    public void setsCharacteristic(String sCharacteristic) {
        this.sCharacteristic = sCharacteristic == null ? null : sCharacteristic.trim();
    }

    public String getsActivity() {
        return sActivity;
    }

    public void setsActivity(String sActivity) {
        this.sActivity = sActivity == null ? null : sActivity.trim();
    }

    public String getsParking() {
        return sParking;
    }

    public void setsParking(String sParking) {
        this.sParking = sParking == null ? null : sParking.trim();
    }

    public String getsBusinesshours() {
        return sBusinesshours;
    }

    public void setsBusinesshours(String sBusinesshours) {
        this.sBusinesshours = sBusinesshours == null ? null : sBusinesshours.trim();
    }

    public String getsWifi() {
        return sWifi;
    }

    public void setsWifi(String sWifi) {
        this.sWifi = sWifi == null ? null : sWifi.trim();
    }

    public String getsPrice() {
        return sPrice;
    }

    public void setsPrice(String sPrice) {
        this.sPrice = sPrice == null ? null : sPrice.trim();
    }

    public Double getsScore() {
        return sScore;
    }

    public void setsScore(Double sScore) {
        this.sScore = sScore;
    }

    public String getsIntroduce() {
        return sIntroduce;
    }

    public void setsIntroduce(String sIntroduce) {
        this.sIntroduce = sIntroduce == null ? null : sIntroduce.trim();
    }

    public String getsImage() {
        return sImage;
    }

    public void setsImage(String sImage) {
        this.sImage = sImage == null ? null : sImage.trim();
    }

    public String getsClassification() {
        return sClassification;
    }

    public void setsClassification(String sClassification) {
        this.sClassification = sClassification == null ? null : sClassification.trim();
    }
}