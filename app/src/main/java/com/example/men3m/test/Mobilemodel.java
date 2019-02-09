package com.example.men3m.test;

public class Mobilemodel {
    private String mobilename,mobiledes;
    private int mobileImg;

    public Mobilemodel(String mobilename, String mobiledes, int mobileImg) {
        this.mobilename = mobilename;
        this.mobiledes = mobiledes;
        this.mobileImg = mobileImg;
    }

    public Mobilemodel() {

    }



    public void setMobilename(String mobilename) {
        this.mobilename = mobilename;
    }

    public void setMobiledes(String mobiledes) {
        this.mobiledes = mobiledes;
    }

    public void setMobileImg(int mobileImg) {
        this.mobileImg = mobileImg;
    }

    public String getMobilename() {
        return mobilename;
    }

    public String getMobiledes() {
        return mobiledes;
    }

    public int getMobileImg() {
        return mobileImg;
    }
}
