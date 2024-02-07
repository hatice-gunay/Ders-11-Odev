package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Erkek teamLead = new Erkek("Ahmet", "Ay", "01/05/1988");
        Departman departman = new Departman(teamLead);

        while (true) {
            System.out.println("");
            System.out.println("----- MENÜ -----");
            System.out.println("1. Team Lead Değiştir");
            System.out.println("2. Personel Ekle");
            System.out.println("3. Personel Çıkar");
            System.out.println("4. Görev Ekle");
            System.out.println("5. Görevi Tamamlandı Olarak İşaretle");
            System.out.println("6. Departman Bilgilerini Göster");
            System.out.println("0. Çıkış");
            System.out.println("");

            System.out.print("Yapmak istediğiniz işlemi seçiniz (1-6): ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    // Team Lead Değiştirme İşlemi
                    System.out.println("");
                    System.out.print("Yeni Team Lead adını giriniz: ");
                    String yeniAd = scanner.next();
                    System.out.print("Yeni Team Lead'ın soyadını giriniz: ");
                    String yeniSoyad = scanner.next();
                    System.out.print("Yeni Team Lead doğum tarihini giriniz(Gün/Ay/Yıl): ");
                    String yeniDogumTarihi = scanner.next();

                    Erkek yeniTeamLead = new Erkek(yeniAd, yeniSoyad, yeniDogumTarihi);
                    departman.teamLeadDegistir(yeniTeamLead);
                    break;

                case 2:
                    // Personel Ekleme İşlemi
                    System.out.println("");
                    System.out.print("Personel adını giriniz: ");
                    String ad = scanner.next();
                    System.out.print("Personel soyadını giriniz: ");
                    String soyad = scanner.next();
                    System.out.print("Personel doğum tarihini giriniz(Gün/Ay/Yıl): ");
                    String dogumTarihi = scanner.next();

                    System.out.print("Personel cinsiyetini giriniz (Erkek/Kadın): ");
                    String cinsiyet = scanner.next();

                    Person yeniPersonel;
                    if (cinsiyet.equalsIgnoreCase("Erkek")) {
                        yeniPersonel = new Erkek(ad, soyad, dogumTarihi);
                    } else if (cinsiyet.equalsIgnoreCase("Kadın")) {
                        yeniPersonel = new Kadin(ad, soyad, dogumTarihi);
                    } else {
                        System.out.println("Geçersiz cinsiyet bilgisi.");
                        continue;
                    }

                    departman.personelEkle(yeniPersonel);
                    break;

                case 3:
                    // Personel Çıkarma İşlemi
                    System.out.println("");
                    System.out.print("Çıkarılacak personelin adını giriniz: ");
                    String cikarilacakAd = scanner.next();
                    System.out.print("Çıkarılacak personelin soyadını giriniz: ");
                    String cikarilacakSoyad = scanner.next();

                    for (Person person : departman.personelListesi) {
                        if (person.ad.equalsIgnoreCase(cikarilacakAd) && person.soyad.equalsIgnoreCase(cikarilacakSoyad)) {
                            departman.personelCikar(person);
                            System.out.println("Personel çıkarıldı.");
                            break;
                        }
                    }
                    break;

                case 4:
                    // Görev Ekleme İşlemi
                    System.out.println("");
                    System.out.print("Eklemek istediğiniz görevi giriniz: ");
                    String yeniGorev = scanner.next();
                    departman.gorevEkle(yeniGorev);
                    break;

                case 5:
                    // Görevi Tamamlandı Olarak İşaretleme İşlemi
                    System.out.println("");
                    System.out.print("Tamamlandı olarak işaretlemek istediğiniz görevi giriniz: ");
                    String tamamlananGorev = scanner.next();
                    departman.goreviTamamlandiOlarakIsaretle(tamamlananGorev);
                    break;

                case 6:
                    // Departman Bilgilerini Göster
                    System.out.println("");
                    departman.departmanBilgileriniGoster();
                    System.out.println("");
                    break;

                case 0:
                    // Çıkış
                    System.out.println("");
                    System.out.println("İşlemler Tamamlandı!!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("");
                    System.out.println("Lütfen tekrar deneyiniz.");
            }
        }
    }
}

