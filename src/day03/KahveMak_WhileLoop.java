package day03;

import java.util.Scanner;

public class KahveMak_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz"+"\nTürk Kahvesi"+"\nFiltre kahve"+"\nEspresso");

        String hangikahve;

        while (true){
            System.out.println("Icmek istediginiz kahvenin sadece adini yaziniz");
            hangikahve= scan.nextLine();

            if (hangikahve.equalsIgnoreCase("Türk Kahvesi") || hangikahve.equalsIgnoreCase("Turk Kahvesi")) {
                System.out.println(hangikahve + " hazirlaniyor.");
                break;
            } else if (hangikahve.equalsIgnoreCase("Filtre kahve")) {
                System.out.println(hangikahve + " hazirlaniyor.");
                break;
            } else if (hangikahve.equalsIgnoreCase("Espresso")) {
                System.out.println(hangikahve + " hazirlaniyor.");
                break;
            } else {
                System.out.println("Hatali giris yaptiniz, kahve adini tekrar yaziniz ");
            }
        }
        while (true) {
            System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız)");
            String sut = scan.nextLine().replace('i','ı');
            if (sut.equalsIgnoreCase("Evet")) {
                System.out.println("Sut ekleniyor.");
                break;
            } else if (sut.equalsIgnoreCase("hayır")) {
                System.out.println("Sut eklenmiyor");
                break;
            } else {
                System.out.println("Hatali giris yaptiniz, evet ya da hayir disinda cevap vermeyiniz");
            }
        }
        while (true) {
            System.out.println("Seker ister misiniz? Evet veya Hayır olarak cevaplayınız");
            String seker = scan.nextLine().replace('i','ı');
            if (seker.equalsIgnoreCase("Evet")) {
                System.out.println("Kaç şeker olsun?");
                int kacseker = scan.nextInt();
                System.out.println(kacseker + " seker ekleniyor");
                break;
            } else if (seker.equalsIgnoreCase("Hayır")) {
                System.out.println("Seker eklenmiyor, Entera basiniz");
                break;
            } else {
                System.out.println("Hatali giris yaptiniz, evet ya da hayir disinda cevap vermeyiniz");
            }
        }

        String boyut;
        while (true) {
            String boskod = scan.nextLine(); //dummy code

            System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :");
            boyut = scan.nextLine();

            if (boyut.equalsIgnoreCase("buyuk boy") || boyut.equalsIgnoreCase("büyük boy")) {
                System.out.println(boyut + " kahveniz hazirlaniyor");
                break;
            } else if (boyut.equalsIgnoreCase("orta boy")) {
                System.out.println(boyut + " kahveniz hazirlaniyor");
                break;
            } else if (boyut.equalsIgnoreCase("kucuk boy") || boyut.equalsIgnoreCase("kücük boy")) {
                System.out.println(boyut + " kahveniz hazirlaniyor");
                break;
            } else {
                System.out.println("Hatali giris yaptiniz, devam etmek icin entera basiniz");
            }
        }


        System.out.println(hangikahve.substring(0, 1).toUpperCase() + hangikahve.substring(1) + " " + boyut + " hazırdır. Afiyet olsun !!!");




    }

}