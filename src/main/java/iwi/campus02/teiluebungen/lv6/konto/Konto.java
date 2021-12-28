package iwi.campus02.teiluebungen.lv6.konto;

public class Konto {

    protected String inhaber;
    protected double kontostand;

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

    @Override
    public String toString() {
        return "Konto{" +
                "inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }
}
