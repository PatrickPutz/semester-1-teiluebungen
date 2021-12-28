package iwi.campus02.teiluebungen.lv6.konto;

public class KontoDemoApp {

    public static void main(String[] args) {

        Konto konto = new Konto("Pat");
        GiroKonto giroKonto = new GiroKonto("Pat", 950.00);
        JugendGiroKonto jugendGiroKonto = new JugendGiroKonto("Pat", 900.00, 500.00);
        SparKonto sparKonto = new SparKonto("Pat");

        System.out.println("Konto");
        System.out.println("Inhaber: " + konto.getInhaber() +
                ", Kontostand: " + konto.getKontostand());
        konto.einzahlen(200.0);
        konto.auszahlen(2000.00);
        System.out.println("Inhaber: " + konto.getInhaber() +
                ", Kontostand: " + konto.getKontostand());


        System.out.println("GiroKonto");
        System.out.println("Inhaber: " + giroKonto.getInhaber() +
                ", Kontostand: " + giroKonto.getKontostand() +
                ", Limit: " + giroKonto.getLimit());
        giroKonto.auszahlen(2000.00);
        giroKonto.einzahlen(500.00);
        giroKonto.auszahlen(1450.00);
        System.out.println("Inhaber: " + giroKonto.getInhaber() +
                ", Kontostand: " + giroKonto.getKontostand() +
                ", Limit: " + giroKonto.getLimit());


        System.out.println("JugendGiroKonto");
        System.out.println("Inhaber: " + jugendGiroKonto.getInhaber() +
                ", Kontostand: " + jugendGiroKonto.getKontostand() +
                ", Limit: " + jugendGiroKonto.getLimit() +
                ", Buchungslimit: " + jugendGiroKonto.getBuchungslimit());
        jugendGiroKonto.auszahlen(900.01);
        jugendGiroKonto.auszahlen(900.00);
        jugendGiroKonto.einzahlen(500.01);
        jugendGiroKonto.einzahlen(500.00);
        System.out.println("Inhaber: " + jugendGiroKonto.getInhaber() +
                ", Kontostand: " + jugendGiroKonto.getKontostand() +
                ", Limit: " + jugendGiroKonto.getLimit() +
                ", Buchungslimit: " + jugendGiroKonto.getBuchungslimit());


        System.out.println("SparKonto");
        System.out.println("Inhaber: " + sparKonto.getInhaber() +
                ", Kontostand: " + sparKonto.getKontostand());
        sparKonto.auszahlen(0.01);
        sparKonto.einzahlen(200.00);
        sparKonto.auszahlen(150.00);
        System.out.println("Inhaber: " + sparKonto.getInhaber() +
                ", Kontostand: " + sparKonto.getKontostand());

    }

}
