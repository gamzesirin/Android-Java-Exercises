package com.gamzesirin.snflardaveriaktarma;

import java.io.Serializable;

public class Ogrenciler implements Serializable {
    private int OgrenciId;
    private String OgrenciName;
    private int OgrenciNo;

    public Ogrenciler(){

    }
    public Ogrenciler(int OgrenciId,String OgrenciName , int OgrenciNo) {
        this.OgrenciId = OgrenciId;
        this.OgrenciName = OgrenciName;
        this.OgrenciNo = OgrenciNo;
    }

    public void setOgrenciId(int OgrenciId) {
        OgrenciId = OgrenciId;
    }

    public void setOgrenciName(String OgrenciName) {
        OgrenciName = OgrenciName;
    }

    public void setOgrenciNo(int OgrenciNo) {
        OgrenciNo = OgrenciNo;
    }

    public int getOgrenciId(){
        return OgrenciId;
    }

    public int getOgrenciNo() {
        return OgrenciNo;
    }

    public String getOgrenciName() {
        return OgrenciName;
    }
}
