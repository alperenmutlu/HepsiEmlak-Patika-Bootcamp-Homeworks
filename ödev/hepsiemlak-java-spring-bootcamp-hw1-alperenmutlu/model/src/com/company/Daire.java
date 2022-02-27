package com.company;

public class Daire extends Gayrimenkul{
   private String ısınmaTipi;
   private int binaYaşı;
   private int katSayisi;
   private String odaSalonSayisi;

    public String getIsınmaTipi() {
        return ısınmaTipi;
    }

    public void setIsınmaTipi(String ısınmaTipi) {
        this.ısınmaTipi = ısınmaTipi;
    }

    public int getBinaYaşı() {
        return binaYaşı;
    }

    public void setBinaYaşı(int binaYaşı) {
        this.binaYaşı = binaYaşı;
    }

    public int getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }

    public String getOdaSalonSayisi() {
        return odaSalonSayisi;
    }

    public void setOdaSalonSayisi(String odaSalonSayisi) {
        this.odaSalonSayisi = odaSalonSayisi;
    }
}
