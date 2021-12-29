package iwi.campus02.teiluebungen.lv7.konto;

public class SparKonto extends Konto{

    public SparKonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void auszahlen(double wert) {
        if((this.getKontostand() - wert) >= 0.0) {
            super.auszahlen(wert);
        }
        else {
            System.out.println("Gewünschter Betrag ist nicht vorhanden!");
        }
    }
}
