package iwi.campus02.teiluebungen.lv7.konto;

public class JugendGiroKonto extends GiroKonto{

    private double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wert) {
        if(wert <= this.buchungslimit) {
            super.einzahlen(wert);
        }
        else{
            System.out.println("Betrag von " + wert + " überschreitet das Buchungslimit!");
        }
    }

    public double getBuchungslimit() {
        return buchungslimit;
    }

    @Override
    public void print() {
        System.out.println("Inhaber: " + this.getInhaber() +
                ", Kontostand: " + this.getKontostand() +
                ", Limit: " + this.getLimit() +
                ", Buchungslimit: " + this.getBuchungslimit());
    }
}
