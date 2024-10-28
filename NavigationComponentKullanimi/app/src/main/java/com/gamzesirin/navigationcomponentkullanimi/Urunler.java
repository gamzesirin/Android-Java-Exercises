package com.gamzesirin.navigationcomponentkullanimi;

import java.io.Serializable;

public class Urunler implements Serializable {
    private int id;
    private String name;
    public Urunler(){

    }

    public Urunler(int id,String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
