package day07_javaPractice;

public class MenuIslemleri {

    public static void menu() {

        System.out.println("Yapmak istediginiz islemin numarasini tuslayiniz: \n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "Seciminiz:");

        //int secim=GirisIslemleri.scan.nextInt();
        char secim=GirisIslemleri.scan.next().charAt(0);
        switch (secim){
            case '1':
                BakiyeIslemleri.bakiyesorgulama();
                break;
            case '2':
                System.out.println("Yatiracaginiz para miktarini giriniz");
                double miktar=GirisIslemleri.scan.nextDouble();
                ParaIslemleri.parayatirma(miktar);
                break;
            case '3':
                System.out.println("Cekeceginiz para miktarini giriniz");
                miktar= GirisIslemleri.scan.nextDouble();
                ParaIslemleri.paracekme(miktar);
                break;
            case '4':
                ParaIslemleri.paragonderme();
                break;
            case '5':
                SifreIslemleri.sifredegistirme();
                break;
            case '6':
                System.out.println("Bankamizi tercih ettiginiz icin tesekkür ederiz");
                System.exit(0);
            default:
                System.out.println("Menüde olmayan bir islem secemezsiniz, tekrar deneyiz");
                menu();

        }


    }
}