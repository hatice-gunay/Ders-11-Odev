package org.example;

public class Erkek extends Person {
    public Erkek(String ad, String soyad, String dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public String toString() {
        return "Cinsiyet: Erkek, " + super.toString();
    }

    @Override
    public int hesaplaEmeklilikYasi() {
        return 65;
    }
}
