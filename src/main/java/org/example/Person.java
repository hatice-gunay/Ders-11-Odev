package org.example;

public class Person
{
    String ad;
    String soyad;
    String dogumTarihi;

    public Person(String ad, String soyad, String dogumTarihi)
    {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "Ad: " + ad + ", Soyad: " + soyad + ", Doğum Tarihi: " + dogumTarihi;
    }

    public int hesaplaEmeklilikYasi() {
        return 0;
    }
}
