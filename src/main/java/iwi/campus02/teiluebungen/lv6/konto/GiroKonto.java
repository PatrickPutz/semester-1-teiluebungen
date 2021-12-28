package iwi.campus02.teiluebungen.lv6.konto;

public class GiroKonto extends Konto{

    protected double limit;

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
        if((super.getKontostand() - wert) >= (0 - this.limit)){
            super.auszahlen(wert);
        }
        else{
            System.out.println("Dieser Betrag würde das Limit überschreiten!");
        }

    }

    @Override
    public String toString() {
        return "GiroKonto{" +
                "limit=" + limit +
                ", inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }

    public double getLimit() {
        return limit;
    }
}
