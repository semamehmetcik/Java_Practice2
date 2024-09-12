package day08_JavaPractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    static ArrayList<User>usersList=new ArrayList<>();
    static public void register() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi giriniz.. ");
        String name= scan.nextLine();
        /*
        System.out.println("Dogum tarihinizi giriniz (yyyy-MM-DD formatinda olmali)");
        String date=scan.nextLine();
        LocalDate birthday= LocalDate.parse(date);

         */

        LocalDate birtdate=null;
        boolean formatDate=false;

        //istenen tarih formati girilene kadar sormasi icin while kullandik
        while (!formatDate) {
            System.out.println("Dogum tarihinizi giriniz (yyyy-MM-DD formatinda olmali)");
            String date=scan.nextLine();


            if (date.matches("^\\d{4}-\\d{2}-\\d{2}$")) {

                birtdate = LocalDate.parse(date);
                if (birtdate.isAfter(LocalDate.now())) {
                    System.out.println("Gecersiz tarih, lütfen bugünden önce bir tarih giriniz");
                } else {
                    System.out.println("Dogumtarihi gecerlidir");
                    formatDate=true;
                }
            } else {
                System.out.println("Gecersiz tarih formati girdiniz, lütfen formata uygun giriniz");
            }
        }



        User user = new User(name, birtdate);
        usersList.add(user);
        System.out.println("Kullanici kayit edildi.");
    }



}