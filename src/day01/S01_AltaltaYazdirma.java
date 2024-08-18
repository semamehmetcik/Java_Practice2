package day01;

public class S01_AltaltaYazdirma {
    public static void main(String[] args) {

        /*
    12345 sayisinin herbir basamagini konsolda altalta yazdirin.
    input: 12345
    output: 1
            2
            3
            4
            5
     */
        int sayi=12345;
        int birlerbasamagi=sayi%10;//5
        int onlarbasamagi=(sayi/10)%10;//1234 un modulus ini aldik
        int yuzlerbasamagi=(sayi/100)%10;//123 ---->%10---->3
        int binlerbasamagi=(sayi/1000)%10;
        int onbinlerbasamagi=(sayi/10000)%10;

        System.out.println(onbinlerbasamagi+"\n"+binlerbasamagi+"\n"+yuzlerbasamagi+"\n"+onlarbasamagi+"\n"+birlerbasamagi);

    }
}
