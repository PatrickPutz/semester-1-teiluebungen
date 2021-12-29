package iwi.campus02.teiluebungen.lv7.konto;

public class GiroKonto extends Konto{

    private double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public void auszahlen(double wert) {
        if((this.getKontostand() - wert) >= (0 - limit)) {
            super.auszahlen(wert);
        }
        else{
            System.out.println("Betrag von " + wert + " würde das Limit überschreiten!");
        }
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public void print() {
        System.out.println("Inhaber: " + this.getInhaber() +
                ", Kontostand: " + this.getKontostand() +
                ", Limit: " + this.getLimit());
    }
}
