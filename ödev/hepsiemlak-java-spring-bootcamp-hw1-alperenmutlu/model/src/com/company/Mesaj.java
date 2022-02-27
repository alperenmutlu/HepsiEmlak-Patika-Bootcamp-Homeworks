package com.company;

import java.util.Date;

public class Mesaj {
    private String baslik;
    private String iceriği;
    private Date gonderilmeTarihi;
    private Date okunduguTari;
    private BireyselKullanici gonderici;
    private BireyselKullanici alici;

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getIceriği() {
        return iceriği;
    }

    public void setIceriği(String iceriği) {
        this.iceriği = iceriği;
    }

    public Date getGonderilmeTarihi() {
        return gonderilmeTarihi;
    }

    public void setGonderilmeTarihi(Date gonderilmeTarihi) {
        this.gonderilmeTarihi = gonderilmeTarihi;
    }

    public Date getOkunduguTari() {
        return okunduguTari;
    }

    public void setOkunduguTari(Date okunduguTari) {
        this.okunduguTari = okunduguTari;
    }

    public Kullanici getGonderici() {
        return gonderici;
    }

    public void setGonderici(BireyselKullanici gonderici) {
        this.gonderici = gonderici;
    }

    public Kullanici getAlici() {
        return alici;
    }

    public void setAlici(BireyselKullanici alici) {
        this.alici = alici;
    }
}
