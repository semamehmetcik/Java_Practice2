package day05;

import java.util.Arrays;

public class S03_Arrays_Mevsimler {
    public static void main(String[] args) {
        //Ilkbahardan baslayarak 4 mevsim array olusturun. Yazdan geriye dogru zamansal olarak mevsimleri siralayin.
        String[]mevsimler=new String[4];
        mevsimler[0]="Ilkbahar";
        mevsimler[1]="Yaz";
        mevsimler[2]="Sonbahar";
        mevsimler[3]="Kis";

        System.out.println(Arrays.toString(mevsimler));

        String boskova=mevsimler[0];
        mevsimler[0]= mevsimler[1];
        mevsimler[1]=boskova;

        String boskova2= mevsimler[2];
        mevsimler[2]= mevsimler[3];
        mevsimler[3]=boskova2;

        System.out.println("Array'in Yeni Hali: "+Arrays.toString(mevsimler));



    }
}