package day07_5;

public class Kare extends Dikdortgen{
    public Kare(double uzunkenar, double kisakenar) {
        super(uzunkenar, kisakenar);
    }

    @Override
    public String toString() {
        return "Karenin kenari: " + uzunkenar +"-----"+
                "Karenin alani: " + alanhesaplama(uzunkenar,kisakenar) +"-----"+
                " Karenin cevresi: "+cevrehesaplama(uzunkenar,kisakenar);
    }
}