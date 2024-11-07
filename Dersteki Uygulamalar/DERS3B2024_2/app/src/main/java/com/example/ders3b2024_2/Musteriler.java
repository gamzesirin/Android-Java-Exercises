package com.example.ders3b2024_2;

import java.io.Serializable;

public class Musteriler implements Serializable {

    private String soyisim;
    private double ücret;

    public Musteriler() {
    }

    public Musteriler(String soyisim, double ücret) {
        this.soyisim = soyisim;
        this.ücret = ücret;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public double getÜcret() {
        return ücret;
    }

    public void setÜcret(double ücret) {
        this.ücret = ücret;
    }
}
