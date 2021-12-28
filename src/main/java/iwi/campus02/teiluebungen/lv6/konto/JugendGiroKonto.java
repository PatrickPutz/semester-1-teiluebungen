package iwi.campus02.teiluebungen.lv6.konto;

public class JugendGiroKonto extends GiroKonto{

    private double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wert) {
        if (wert <= this.buchungslimit) {
            super.einzahlen(wert);
        }
        else{
            System.out.println("Wert größer als Buchungslimit!");
        }
    }

    @Override
    public void auszahlen(double wert) {
        super.auszahlen(wert);
    }

    @Override
    public String toString() {
        return "JugendGiroKonto{" +
                "limit=" + limit +
                ", buchungslimit=" + buchungslimit +
                ", inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }

    public double getBuchungslimit() {
        return buchungslimit;
    }
}
