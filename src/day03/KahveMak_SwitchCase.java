package day03;

import java.util.Scanner;

public class KahveMak_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz" + "\nTürk Kahvesi" + "\nFiltre kahve" + "\nEspresso");
        System.out.println("Icmek istediginiz kahvenin sadece adini yaziniz");

        String hangikahve = scan.nextLine().toLowerCase().replace('u','ü');

        switch (hangikahve){
            case "türk kahvesi":
                System.out.println("Türk kahvesi hazırlanıyor...");
                break;
            case "filtre kahve" :
                System.out.println("Filtre kahve hazırlanıyor...");
                break;
            case "espresso":
                System.out.println("Espresso hazırlanıyor...");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız.");
        }

        System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız): ");
        String sut=scan.nextLine().toLowerCase().replace('i','ı');

        switch (sut) {
            case "evet":
                System.out.println("Süt ekleniyor...");
                break;
            case "hayır":
                System.out.println("Süt eklenmiyor.");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız.");
        }

        System.out.println("Şeker ister misiniz? (Evet veya hayır cevabını veriniz): ");
        String seker = scan.nextLine().toLowerCase().replace('i','ı');

        switch (seker) {
            case "evet":
                System.out.println("Kaç şeker olsun?");
                int kacSeker = scan.nextInt();
                scan.nextLine(); // Dummy kod
                System.out.println(kacSeker + " şeker ekleniyor.");
                break;
            case "hayır":
                System.out.println("Şeker eklenmiyor.");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız.");
        }

        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.): ");
        String boyut = scan.nextLine().toLowerCase().replace('u','ü');

        switch (boyut) {
            case "büyük boy":
                System.out.println("Kahveniz büyük boy hazırlanıyor.");
                break;
            case "orta boy":
                System.out.println("Kahveniz orta boy hazırlanıyor.");
                break;
            case "küçük boy":
                System.out.println("Kahveniz küçük boy hazırlanıyor.");
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız.");
        }

        System.out.println(hangikahve.substring(0,1).toUpperCase() +hangikahve.substring(1).toLowerCase()+ "  " + boyut + " hazirdir. Afiyet olsun!!! ");







    }
}