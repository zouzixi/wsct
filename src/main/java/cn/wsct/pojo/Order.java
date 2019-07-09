package cn.wsct.pojo;

import java.util.Date;

public class Order {
    private Integer oId;

    private Integer smId;

    private String oTelephone;

    private Date oOrdertime;

    private String oUsername;

    private Double oMoney;

    private Integer oStatus;

    private Integer oNumber;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public String getoTelephone() {
        return oTelephone;
    }

    public void setoTelephone(String oTelephone) {
        this.oTelephone = oTelephone == null ? null : oTelephone.trim();
    }

    public Date getoOrdertime() {
        return oOrdertime;
    }

    public void setoOrdertime(Date oOrdertime) {
        this.oOrdertime = oOrdertime;
    }

    public String getoUsername() {
        return oUsername;
    }

    public void setoUsername(String oUsername) {
        this.oUsername = oUsername == null ? null : oUsername.trim();
    }

    public Double getoMoney() {
        return oMoney;
    }

    public void setoMoney(Double oMoney) {
        this.oMoney = oMoney;
    }

    public Integer getoStatus() {
        return oStatus;
    }

    public void setoStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }

    public Integer getoNumber() {
        return oNumber;
    }

    public void setoNumber(Integer oNumber) {
        this.oNumber = oNumber;
    }
}