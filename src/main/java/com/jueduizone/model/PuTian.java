package com.jueduizone.model;

import java.sql.Timestamp;

/**
 * Bean
 * Created by JamieXu on 16/5/11.
 */
public class PuTian {
    //id
    private int id;
    //名称
    private String ptName;
    //地址
    private String ptAddress;
    //联系电话
    private String ptPhone;
    //网站
    private String ptWebUrl;
    //备注
    private String ptComment;
    //数据状态
    private String ptState;
    //创建时间
    private Timestamp ptCreateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
    }

    public String getPtAddress() {
        return ptAddress;
    }

    public void setPtAddress(String ptAddress) {
        this.ptAddress = ptAddress;
    }

    public String getPtPhone() {
        return ptPhone;
    }

    public void setPtPhone(String ptPhone) {
        this.ptPhone = ptPhone;
    }

    public String getPtWebUrl() {
        return ptWebUrl;
    }

    public void setPtWebUrl(String ptWebUrl) {
        this.ptWebUrl = ptWebUrl;
    }

    public String getPtComment() {
        return ptComment;
    }

    public void setPtComment(String ptComment) {
        this.ptComment = ptComment;
    }

    public String getPtState() {
        return ptState;
    }

    public void setPtState(String ptState) {
        this.ptState = ptState;
    }

    public Timestamp getPtCreateTime() {
        return ptCreateTime;
    }

    public void setPtCreateTime(Timestamp ptCreateTime) {
        this.ptCreateTime = ptCreateTime;
    }

    @Override
    public String toString() {
        return "PuTian{" +
                "id=" + id +
                ", ptName='" + ptName + '\'' +
                ", ptAddress='" + ptAddress + '\'' +
                ", ptPhone='" + ptPhone + '\'' +
                ", ptWebUrl='" + ptWebUrl + '\'' +
                ", ptComment='" + ptComment + '\'' +
                ", ptState='" + ptState + '\'' +
                ", ptCreateTime=" + ptCreateTime +
                '}';
    }
}
