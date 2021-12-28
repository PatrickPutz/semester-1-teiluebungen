package iwi.campus02.teiluebungen.lv6.konto;

public class SparKonto extends Konto{

    public SparKonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void auszahlen(double wert) {
        if(super.getKontostand() - wert >= 0.0){
            super.auszahlen(wert);
        }
        else{
            System.out.println("Betrag zu hoch!");
        }
    }

    @Override
    public String toString() {
        return "SparKonto{" +
                "inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }

}
