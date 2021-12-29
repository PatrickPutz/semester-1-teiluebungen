package iwi.campus02.teiluebungen.lv7.konto;

public class Konto {

    private String inhaber;
    private double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0.0;
    }

    public void einzahlen(double wert){
        this.kontostand += wert;
    }

    public void auszahlen(double wert){
        this.kontostand -= wert;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void print(){
        System.out.println("Inhaber: " + this.getInhaber() +
                ", Kontostand: " + this.getKontostand());
    }

}
