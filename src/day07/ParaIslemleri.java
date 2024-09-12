package day07;

public class ParaIslemleri {
    public static void parayatirma(double miktar) {
        GirisIslemleri.bakiye+=miktar;
        BakiyeIslemleri.bakiyesorgulama();
    }

    public static void paracekme(double miktar) {
        if (miktar<=GirisIslemleri.bakiye){
            GirisIslemleri.bakiye-=miktar;
            BakiyeIslemleri.bakiyesorgulama();
        }else {
            System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
            paracekme(GirisIslemleri.scan.nextDouble());
        }
    }


    public static void paragonderme() {
        System.out.println("IBAN No giriniz (TR ile baslamali ve 10 karakter uzunlugunda olmalidir) ");
        String iban=GirisIslemleri.scan.nextLine().toUpperCase().replaceAll(" ","");
        System.out.println();

        if (iban.startsWith("TR")&&iban.length()==10){
            System.out.println("Göndereceginiz miktari yaziniz");
            double miktar= GirisIslemleri.scan.nextDouble();

            if (miktar<=GirisIslemleri.bakiye){
                GirisIslemleri.bakiye-=miktar;
                BakiyeIslemleri.bakiyesorgulama();
            }else {
                System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
                MenuIslemleri.menu();
            }
        }else {
            System.out.println("Gecerli bir IBAN girmelisiniz, yanlis girdiniz");
            paragonderme();
        }
    }
}