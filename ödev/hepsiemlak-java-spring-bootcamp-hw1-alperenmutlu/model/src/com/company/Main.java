package com.company;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<Mesaj> mesajKutusu = new ArrayList<>();

        Mesaj mesaj = new Mesaj();

        Mesaj mesaj2 = new Mesaj();

        List<BireyselKullanici> kullaniciMesaj = new ArrayList<>();

        Kullanici kullaniciMesajs = new BireyselKullanici();

        List<BireyselKullanici> kullanicilar = new ArrayList<>();

        BireyselKullanici alperen = kullaniciOlustur("alperen","mutlu","alperen@alperen.com");


        List<DaireIlani> favoriIlanlar = new ArrayList<>();
        BireyselKullanici ayse = kullaniciOlustur("Ayşe","Sarı","ayse.sari@gmail.com");

        kullanicilar.add(alperen);
        kullanicilar.add(ayse);

        List<DaireIlani> yayinladigiIlanlar = new ArrayList<>();

        DaireIlani ilan = DaireilanOlustur("Deniz Manzaralı Ev","İstanbul",2500, alperen,"2+1");


        mesaj.setBaslik("Son fiyat nedir?");
        mesaj.setIceriği("Son fiyat nedir?");
        mesaj.setGonderici(alperen);
        mesaj.setAlici(ayse);

        mesaj2.setBaslik("Son fiyat!");
        mesaj2.setIceriği("Son fiyat :");
        mesaj2.setGonderici(ayse);
        mesaj2.setAlici(alperen);




        mesajKutusu.add(mesaj);
        mesajKutusu.add(mesaj2);

        ayse.setMesajKutusu(mesajKutusu);
        alperen.setMesajKutusu(mesajKutusu);

        System.out.println("**************Mesaj başlıkları*************");
        for(Mesaj mesajs : mesajKutusu){
            System.out.println(mesajs.getBaslik());
        }
        System.out.println("**************Mesaj başlıkları*************");

      



        System.out.println("-----------------------");
        System.out.println("*******MESAJLARDAKİ KULLANICILAR*******");
        for(Mesaj mesajlar : mesajKutusu){
            BireyselKullanici b1 = (BireyselKullanici) mesajlar.getGonderici();
            System.out.println(b1.getAdi());
        }
        System.out.println("-----------------------");
        System.out.println("*******MESAJLARDAKİ KULLANICILAR*******");


        DaireIlani ilan2 = DaireilanOlustur("Öğrenciye Kiralık","İstanbul",2500, alperen,"3+1");
        yayinladigiIlanlar.add(ilan);
        yayinladigiIlanlar.add(ilan2);

        alperen.setYayinladigiIlanlar(yayinladigiIlanlar);



        ayse.setFavoriIlanlar(alperen.getYayinladigiIlanlar());
        System.out.println("------------------------------------");
        System.out.println("*****Ayşenin favori ilanları!*****");

        System.out.println(filterMail(kullanicilar,"ayse.sari@gmail.com"));
        System.out.println("*****Ayşenin favori ilanları!*****");
        System.out.println("------------------------------------");


        System.out.println("------------------------------------");
        System.out.println("******* FİLTERLİ İLANLAR******");
        System.out.println(filtreliIlanlar(yayinladigiIlanlar,"3+1",1200,"istanbul"));
        System.out.println("******* FİLTERLİ İLANLAR******");
        System.out.println("------------------------------------");




    }



    private static List<String> filterMail(List<BireyselKullanici> bireyselKullanicis, String mail){
        List<String> kullaniciFavoriler = new ArrayList<>();
       for(BireyselKullanici kullanicis : bireyselKullanicis){
            if(kullanicis.getEmail().equals(mail)){
               for(DaireIlani favoriler : kullanicis.getFavoriIlanlar()){
                   kullaniciFavoriler.add(favoriler.getBaslik());
                }

           }

       }
       return kullaniciFavoriler;
    }


    private static List<String> filtreliIlanlar(List<DaireIlani> ilan,String odaSalonSayisi, long fiyat,String il){
        List<DaireIlani> filtreliIlan = new ArrayList<>();
       for(DaireIlani ilans : ilan){
           if(ilans.getDaire().getOdaSalonSayisi().equals("2+1") || ilans.getDaire().getOdaSalonSayisi().equals("3+1") && ilans.getFiyat() < 3000 && ilans.getAdres().Il.equals("İstanbul")){
               filtreliIlan.add(ilans);
           }
       }
       List<String> filtreliEvler = new ArrayList<>();
       for(DaireIlani filtreli : filtreliIlan){
           filtreliEvler.add(filtreli.getBaslik());
           filtreliEvler.add(filtreli.getDaire().getOdaSalonSayisi());
           filtreliEvler.add(filtreli.getAdres().Il);


       }


       return filtreliEvler;
    }

    private static BireyselKullanici kullaniciOlustur(String adi, String soyAdi, String email){
        BireyselKullanici kullanici = new BireyselKullanici();
        kullanici.setAdi(adi);
        kullanici.setSoyAdi(soyAdi);
        kullanici.setEmail(email);

        return kullanici;
    }

    private static DaireIlani DaireilanOlustur(String baslik, String il, long fiyat, Kullanici kullanici,String odaSalonSayisi){
        //Ilan ilan = new Ilan();
        DaireIlani daireIlani = new DaireIlani();
        Daire daire = new Daire();
        daire.setOdaSalonSayisi(odaSalonSayisi);


        daireIlani.setDaire(daire);



        Adres adres = new Adres();
        adres.setIl(il);
        daireIlani.setBaslik(baslik);
        daireIlani.setAdres(adres);
        daireIlani.setFiyat(fiyat);
        daireIlani.setAktifMi(true);
        daireIlani.setKullanici(kullanici);

        return daireIlani;
    }


}
