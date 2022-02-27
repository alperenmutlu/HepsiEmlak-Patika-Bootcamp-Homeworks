package com.company;


public class Adres {
    String Il;
    String ilce;
    String mahalle;
    String sokak;

    public Adres(){

    }

    public Adres(String il)
    {
        this.Il = il;
    }

    public String getIl() {
        return Il;
    }

    public void setIl(String il) {
        Il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }
}
