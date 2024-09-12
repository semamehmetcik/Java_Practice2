package day07_javaPractice;

import java.util.Scanner;


public class GirisIslemleri {
    static Scanner scan=new Scanner(System.in);
    static String kartno="123456";
    static String sifre="1234";
    static double bakiye=30000;

    public static void giris() {
        System.out.println("Kart numaranizi giriniz: ");
        String kkartno= scan.nextLine();

        System.out.println("Sifrenizi giriniz");
        String ksifre= scan.nextLine();

        kkartno=kkartno.replaceAll("//s","");

        if (kkartno.equals(kartno)&& ksifre.equals(sifre)){
            MenuIslemleri.menu();
        }else {
            System.out.println("hatali giris yaptiniz, yeniden deneyiniz");
            giris();
        }
    }





}