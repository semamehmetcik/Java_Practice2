package day07_5;

public class Dikdortgen extends Sekil{
    public Dikdortgen(double uzunkenar, double kisakenar) {
        super(uzunkenar, kisakenar);
    }

    @Override
    public String toString() {
        return "Dikdortgenin uzunkenar=" + uzunkenar +"-----"+
                ", Dikdortgenin  kisakenar=" + kisakenar +"-----"+
                "Dikdortgenin Alani: "+alanhesaplama(uzunkenar,kisakenar)+"-----"+
                "Dikdortgenin Cevresi : "+cevrehesaplama(uzunkenar,kisakenar);
    }
}