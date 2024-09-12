package day03;

import java.util.Random;
import java.util.Scanner;

public class S01_TasKagitMakas {
    public static void main(String[] args) {
       /*
        Bilgisayar ile "tas kagit makas oyunu" oynayiniz.
                Kullanici secimini; Tas icin 1, Kagit icin 2, Makas icin 3 yazarak belirtin.
        Kullanici tahminini yazar, sonra bilgisayarin tahminine göre o elin kazanani belli olur.
        5 kez oynadiktan sonra, asagidaki kurallara göre en fazla kazanan, oyunun galibi olur.

        Kâğıt taşı sarar
        Taş makası kırar
        Makas kağıdı keser
                */

        Scanner scan=new Scanner(System.in);
        Random random= new Random();

        System.out.println("Lütfen seciminizi sayi olarak belirtiniz: Tas icin 1, Kagit icin 2, Makas icin 3 tuslayiniz ");
        int kullanicisecimi= scan.nextInt();
        int bilgisayarinsecimi= random.nextInt(3)+1;

        int bilgisayar=0;
        int kullanici=0;

        if (kullanicisecimi==1 && bilgisayarinsecimi==2){
            System.out.println("Kâğıt taşı sarar, bilgisayar +1");
            bilgisayar++;
            System.out.println("Kullanici: "+kullanici +" "+ "bilgisayar"+bilgisayar);
        } else if (kullanicisecimi==1 && bilgisayarinsecimi==3) {
            System.out.println("Taş makası kırar, kullanici +1");
            kullanici++;
            System.out.println("Kullanici: "+kullanici +" "+ "bilgisayar"+bilgisayar);




        }


    }
}