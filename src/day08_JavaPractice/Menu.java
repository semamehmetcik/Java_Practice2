package day08_JavaPractice;

import java.util.Scanner;

public class Menu {
    static  public void giris() {
        System.out.println("Uygulamaya hosgeldiniz! Sansli kullanici sen misin? Hadi belirleyelim!!!");
        System.out.println("Seciminizi rakam olarak yaziniz:\n" +
                "1. isim ve dogumtarihi ile kayit yapin\n" +
                "2- Sansli kisi kim?\n" +
                "3- Cikis");

        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) {

            int secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    Registration.register();
                    giris();
                    break;

                }
                case 2: {
                    Listing.printHappyUsers(Registration.usersList);
                    giris();
                    break;

                }
                case 3: {
                    System.out.println("Güle güle!!!");
                    break;

                }
                default:
                    System.out.println("Gecerli sayi girmediniz, tekrar deneyiniz.");
                    giris();
                    break;
            }
        } else {
            System.out.println("Lütfen sadece sayi giriniz");
            giris();
        }
    }

}