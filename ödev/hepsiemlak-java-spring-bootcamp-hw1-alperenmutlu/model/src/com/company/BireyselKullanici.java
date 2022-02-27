package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BireyselKullanici extends Kullanici{
    private String adi;
    private String soyAdi;
    private List<DaireIlani> favoriIlanlar = new ArrayList<>();
    private List<Mesaj> mesajKutusu;

    public BireyselKullanici(){
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyAdi() {
        return soyAdi;
    }

    public void setSoyAdi(String soyAdi) {
        this.soyAdi = soyAdi;
    }

    public List<DaireIlani> getFavoriIlanlar() {
        return favoriIlanlar;
    }

    public void setFavoriIlanlar(List<DaireIlani> favoriIlanlar) {
        this.favoriIlanlar = favoriIlanlar;
    }

    public List<Mesaj> getMesajKutusu() {
        return mesajKutusu;
    }

    public void setMesajKutusu(List<Mesaj> mesajKutusu) {
        this.mesajKutusu = mesajKutusu;
    }
}
