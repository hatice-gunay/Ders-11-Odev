package org.example;

public class Kadin extends Person {
    public Kadin(String ad, String soyad, String dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public String toString() {
        return "Cinsiyet: Kadın, " + super.toString();
    }

    @Override
    public int hesaplaEmeklilikYasi() {
        return 60;
    }
}
