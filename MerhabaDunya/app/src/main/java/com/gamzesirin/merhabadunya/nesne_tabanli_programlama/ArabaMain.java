package com.gamzesirin.merhabadunya.nesne_tabanli_programlama;

public class ArabaMain {
    public static void main(String[] args) {
        String s_renk;
        int s_hiz;
        boolean s_calisiyorMu;
        Araba bmw =new Araba();

        bmw.renk="Mavi";
        bmw.hiz=10000;
        bmw.calisiyorMu=true;


        Araba sahin=new Araba();
        s_renk=  sahin.renk="Siyah";
        s_calisiyorMu=  sahin.calisiyorMu=false;
        s_hiz=sahin.hiz=550;

        System.out.println(s_hiz+" "+s_renk+" " + s_calisiyorMu);

        bmw.calistir();
        bmw.durdur();
    }
}
