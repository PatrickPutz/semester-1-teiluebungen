package iwi.campus02.teiluebungen.lv3.bestellverwaltung;

public class Bestellung {

    private String nummer;
    private Bestellzeile[] zeilen;

    public Bestellung(String nummer, Bestellzeile[] zeilen) {
        this.nummer = nummer;
        this.zeilen = zeilen;
    }

    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getZeilen() {
        return zeilen;
    }

    public void printBestellung(){
        System.out.println("Nummer: " + this.nummer);
        for (int i = 0; i < zeilen.length; i++){
            System.out.println("Name: " + zeilen[i].getName() +
                    ", Menge: " + zeilen[i].getMenge() +
                    ", Einzelpreis: " + zeilen[i].getPreis() +
                    ", Gesamtpreis: " + zeilen[i].getKosten());
        }
    }

    public double getKosten(){
        double result = 0.0;

        for(int i = 0; i < zeilen.length; i++){
            result += zeilen[i].getKosten();
        }

        return result;
    }

}
