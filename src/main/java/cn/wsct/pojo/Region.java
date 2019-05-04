package cn.wsct.pojo;

public class Region {
    private Integer rId;

    private String rCity;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrCity() {
        return rCity;
    }

    public void setrCity(String rCity) {
        this.rCity = rCity == null ? null : rCity.trim();
    }
}