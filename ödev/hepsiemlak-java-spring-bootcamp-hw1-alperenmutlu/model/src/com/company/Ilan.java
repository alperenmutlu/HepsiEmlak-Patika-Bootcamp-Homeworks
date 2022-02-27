package com.company;

import java.math.BigDecimal;
import java.util.Date;

public class Ilan {
    private Gayrimenkul gayrimenkul;
    private Kullanici kullanici;
    private String[] resimList = new String[5];
    private String baslik;
    private Date ilanTarihi;
    private long fiyat;
    private boolean aktifMi;
    private boolean incelendiMi;
    private boolean oneCikarilsinMi;
    private Adres adres;

    public Ilan(){

    }

    public Ilan(Kullanici kullanici, String baslik, long fiyat, boolean aktifMi) {
        this.kullanici = kullanici;
        this.baslik = baslik;
        this.fiyat = fiyat;
        this.aktifMi = aktifMi;
    }

    public Gayrimenkul getGayrimenkul() {
        return gayrimenkul;
    }

    public void setGayrimenkul(Gayrimenkul gayrimenkul) {
        this.gayrimenkul = gayrimenkul;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public String[] getResimList() {
        return resimList;
    }

    public void setResimList(String[] resimList) {
        this.resimList = resimList;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public Date getIlanTarihi() {
        return ilanTarihi;
    }

    public void setIlanTarihi(Date ilanTarihi) {
        this.ilanTarihi = ilanTarihi;
    }

    public long getFiyat() {
        return fiyat;
    }

    public void setFiyat(long fiyat) {
        this.fiyat = fiyat;
    }

    public boolean isAktifMi() {
        return aktifMi;
    }

    public void setAktifMi(boolean aktifMi) {
        this.aktifMi = aktifMi;
    }

    public boolean isIncelendiMi() {
        return incelendiMi;
    }

    public void setIncelendiMi(boolean incelendiMi) {
        this.incelendiMi = incelendiMi;
    }

    public boolean isOneCikarilsinMi() {
        return oneCikarilsinMi;
    }

    public void setOneCikarilsinMi(boolean oneCikarilsinMi) {
        this.oneCikarilsinMi = oneCikarilsinMi;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }



}
