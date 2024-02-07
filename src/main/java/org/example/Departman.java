package org.example;

import java.util.ArrayList;

public class Departman {
    Erkek teamLead;
    ArrayList<Person> personelListesi;
    ArrayList<String> gorevListesi;

    public Departman(Erkek teamLead) {
        this.teamLead = teamLead;
        this.personelListesi = new ArrayList<>();
        this.gorevListesi = new ArrayList<>();
    }

    public void teamLeadDegistir(Erkek yeniTeamLead) {
        this.teamLead = yeniTeamLead;
    }

    public void personelEkle(Person person) {
        this.personelListesi.add(person);
    }

    public void personelCikar(Person person) {
        this.personelListesi.remove(person);
    }

    public void personelDegistir(Person eskiPerson, Person yeniPerson) {
        int index = this.personelListesi.indexOf(eskiPerson);
        if (index != -1) {
            this.personelListesi.set(index, yeniPerson);
        }
    }

    public void gorevEkle(String gorev) {
        this.gorevListesi.add(gorev);
    }

    public void goreviTamamlandiOlarakIsaretle(String tamamlananGorev) {
        this.gorevListesi.remove(tamamlananGorev);
    }

    public boolean isEmekli(Person person) {
        int yas = 2024 - Integer.parseInt(person.dogumTarihi.split("/")[2]);
        int emeklilikYasi = (person instanceof Erkek) ? ((Erkek) person).hesaplaEmeklilikYasi() : ((Kadin) person).hesaplaEmeklilikYasi();
        return yas >= emeklilikYasi;
    }

    public void departmanBilgileriniGoster() {
        System.out.println("Departman Team Lead: " + teamLead.ad);
        System.out.println("Personel Listesi: ");
        for (Person person : personelListesi) {
            System.out.println("- Ad:" + person.ad + " Soyad:" + person.soyad + " Doğum Tarihi:" + person.dogumTarihi + " (Emeklilik Durumu: " + (isEmekli(person) ? "Emekli Olabilir" : "Emekli Olamaz") + ")");
        }
        System.out.println("Görev Listesi: " + gorevListesi);
    }


}
