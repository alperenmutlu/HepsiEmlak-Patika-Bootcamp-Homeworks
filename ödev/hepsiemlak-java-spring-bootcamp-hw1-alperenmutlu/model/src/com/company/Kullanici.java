package com.company;

import java.util.ArrayList;
import java.util.List;

public class Kullanici {
    private String email;
    private String fotograf;
    private List<DaireIlani> yayinladigiIlanlar;
    //private List<Mesaj> mesajKutusu = new ArrayList<>();

    public Kullanici(){
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFotograf() {
        return fotograf;
    }

    public void setFotograf(String fotograf) {
        this.fotograf = fotograf;
    }

    public List<DaireIlani> getYayinladigiIlanlar() {
        return yayinladigiIlanlar;
    }

    public void setYayinladigiIlanlar(List<DaireIlani> yayinladigiIlanlar) {
        this.yayinladigiIlanlar = yayinladigiIlanlar;
    }

   // public List<Mesaj> getMesajKutusu() {
   //     return mesajKutusu;
   // }

  //  public void setMesajKutusu(List<Mesaj> mesajKutusu) {
   //     this.mesajKutusu = mesajKutusu;
    //}
}
