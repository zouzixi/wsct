package cn.wsct.pojo;

import java.util.Date;

public class User {
    private Integer uId;

    private String uUsername;

    private String uPassword;

    private String uTelephone;

    private String uEmail;

    private String uPortrait;

    private Date uLasttime;

    private Integer uCoin;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuTelephone() {
        return uTelephone;
    }

    public void setuTelephone(String uTelephone) {
        this.uTelephone = uTelephone == null ? null : uTelephone.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuPortrait() {
        return uPortrait;
    }

    public void setuPortrait(String uPortrait) {
        this.uPortrait = uPortrait == null ? null : uPortrait.trim();
    }

    public Date getuLasttime() {
        return uLasttime;
    }

    public void setuLasttime(Date uLasttime) {
        this.uLasttime = uLasttime;
    }

    public Integer getuCoin() {
        return uCoin;
    }

    public void setuCoin(Integer uCoin) {
        this.uCoin = uCoin;
    }
}