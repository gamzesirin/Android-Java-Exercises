package com.gamzesirin.merhabadunya.nesne_tabanli_programlama;

public class Araba {
    String renk;
    int hiz;
    boolean calisiyorMu;


    public void calistir(){//side effect - YAN ETKİ
        calisiyorMu=true;
        hiz=5;
        System.out.println(calisiyorMu +" "+hiz);
    }

    public void durdur(){
        calisiyorMu=false;
        hiz=0;
        System.out.println(calisiyorMu +" "+hiz);
    }
}
