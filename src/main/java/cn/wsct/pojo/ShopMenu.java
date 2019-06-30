package cn.wsct.pojo;

public class ShopMenu {
    private Integer smId;

    private Integer sId;

    private String smDishname;

    private Double smPrice;

    private Integer smStock;

    private Integer smSalesvolume;

    private String smDetails;

    private String smImage;

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getSmDishname() {
        return smDishname;
    }

    public void setSmDishname(String smDishname) {
        this.smDishname = smDishname == null ? null : smDishname.trim();
    }

    public Double getSmPrice() {
        return smPrice;
    }

    public void setSmPrice(Double smPrice) {
        this.smPrice = smPrice;
    }

    public Integer getSmStock() {
        return smStock;
    }

    public void setSmStock(Integer smStock) {
        this.smStock = smStock;
    }

    public Integer getSmSalesvolume() {
        return smSalesvolume;
    }

    public void setSmSalesvolume(Integer smSalesvolume) {
        this.smSalesvolume = smSalesvolume;
    }

    public String getSmDetails() {
        return smDetails;
    }

    public void setSmDetails(String smDetails) {
        this.smDetails = smDetails == null ? null : smDetails.trim();
    }

    public String getSmImage() {
        return smImage;
    }

    public void setSmImage(String smImage) {
        this.smImage = smImage == null ? null : smImage.trim();
    }
}