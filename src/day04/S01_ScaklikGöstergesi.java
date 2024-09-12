package day04;

import java.util.Scanner;

public class S01_ScaklikGöstergesi {
    public static void main(String[] args) {
        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // "e" girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);


        double maxsicaklik=Double.MIN_VALUE;
        double minsicaklik=Double.MAX_VALUE;

        System.out.println("Sicaklik degerlerini giriniz.(Veri girisini sonlandirmak icin e'ye basiniz)");

        while (true) {
            String input = scan.nextLine();
            if (input.equals("e")) {
                System.out.println("Islem sonlandi");
                break;
            }
            double sicaklik = Double.parseDouble(input);
            if(sicaklik>maxsicaklik){
                maxsicaklik=sicaklik;
            }
            if (sicaklik<minsicaklik){
                minsicaklik=sicaklik;
            }
        }
        System.out.println(" Günün en yüksek sicakligi: " +maxsicaklik);
        System.out.println(" Günün en düsük sicakligi: " +minsicaklik);
    }
}