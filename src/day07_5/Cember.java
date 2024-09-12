package day07_5;

public class Cember extends Sekil {
    public Cember(double yaricap) {
        super(yaricap);
    }

    @Override
    public String toString() {
        return "Cemberin yaricap= " + yaricap +"-----"+ "Cemberin alani: "+ alanhesaplama(yaricap)+ "---------"+
                "Cemberin cevresi: "+ cevrehesaplama(yaricap);
    }
}