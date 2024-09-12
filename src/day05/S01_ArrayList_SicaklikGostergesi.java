package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S01_ArrayList_SicaklikGostergesi {
    public static void main(String[] args) {
        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // 100 girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

        Scanner scan=new Scanner(System.in);

        ArrayList<Double>gununSicaklilari=new ArrayList<>();

        double girilenSicaklik;
        int sonlandirmaSayisi=100;
        int sayac=0;

        System.out.println("Sicaklik degerlerini giriniz. Veri girisini sonlandirmak icin 100 yaziniz");

        do {
            girilenSicaklik=scan.nextDouble();

            if (girilenSicaklik!=100) {
                gununSicaklilari.add(girilenSicaklik);
                sayac++;
            }

        }while (girilenSicaklik!=100);{
            System.out.println("Veri girisi sonlandi");
        }

        if (!gununSicaklilari.isEmpty()) {
            Collections.sort(gununSicaklilari);
            System.out.println(gununSicaklilari);
            System.out.println("Girilen deger sayisi: " + gununSicaklilari.size());
            System.out.println("Gunun en düsük sicaklik degeri: " + gununSicaklilari.get(0));
            System.out.println("Gunun en yüksek sicaklik degeri: " + gununSicaklilari.get(sayac - 1));
        }else {
            System.out.println("Hicbir deger girilmedi");
        }








    }
}