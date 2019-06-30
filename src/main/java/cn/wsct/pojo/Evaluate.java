package cn.wsct.pojo;

public class Evaluate {
    private Integer eId;

    private Integer smId;

    private String eComment;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public String geteComment() {
        return eComment;
    }

    public void seteComment(String eComment) {
        this.eComment = eComment == null ? null : eComment.trim();
    }
}