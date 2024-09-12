package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S02_ArrayList_SicaklikGos_eGiris {
    public static void main(String[] args) {
        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // "e" girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);

        ArrayList<Double> gununSicaklilari = new ArrayList<>();

        String input;
        double girilenSicaklik;

        System.out.println("Sicaklik degerlerini giriniz.(Veri girisini sonlandirmak icin e'ye basiniz)");
        while (true) {
            input = scan.nextLine();
            if (input.equalsIgnoreCase("e")) {
                System.out.println("Islem sonlandi");
                break;
            } else if (input.matches("-?\\d++(\\.\\d+)?")) {
                girilenSicaklik = Double.parseDouble(input);
                gununSicaklilari.add(girilenSicaklik);
            } else {
                System.out.println("Gecersiz giris. Lütfen sadece e giriniz");
            }
        }
        if (!gununSicaklilari.isEmpty()) {
            Collections.sort(gununSicaklilari);
            System.out.println(gununSicaklilari);
            System.out.println("Girilen deger sayisi: " + gununSicaklilari.size());
            System.out.println("Gunun en düsük sicaklik degeri: " + gununSicaklilari.get(0));
            System.out.println("Gunun en yüksek sicaklik degeri: " + gununSicaklilari.get(gununSicaklilari.size()-1));
        }else {
            System.out.println("Hicbir deger girilmedi");
        }

    }
}