package iwi.campus02.teiluebungen.lv7.konto;

public class KontoDemoApp {

    public static void main(String[] args) {

        Konto konto = new Konto("Putzi");
        GiroKonto giroKonto = new GiroKonto("Putzi", 1000.00);
        JugendGiroKonto jugendGiroKonto = new JugendGiroKonto("Putzi", 500.00, 1000.00);
        SparKonto sparKonto = new SparKonto("Putzi");
        JugendGiroKonto castingKonto = new JugendGiroKonto("Putzi", 400.00, 600.00);

        System.out.println("");
        System.out.println("<<< Konto >>>");
        konto.print();
        konto.einzahlen(2.99);
        konto.print();
        konto.auszahlen(400.0);
        konto.print();

        System.out.println("");
        System.out.println("<<< GiroKonto >>>");
        giroKonto.print();
        giroKonto.auszahlen(1000.01);
        giroKonto.einzahlen(10.00);
        giroKonto.auszahlen(0.75);
        giroKonto.print();

        System.out.println("");
        System.out.println("<<< JugendGiroKonto >>>");
        jugendGiroKonto.print();
        jugendGiroKonto.einzahlen(1501.00);
        jugendGiroKonto.auszahlen(601.00);
        jugendGiroKonto.auszahlen(20.00);
        jugendGiroKonto.einzahlen(10.00);
        jugendGiroKonto.print();

        System.out.println("");
        System.out.println("<<< SparKonto >>>");
        sparKonto.print();
        sparKonto.auszahlen(0.01);
        sparKonto.einzahlen(500.00);
        sparKonto.auszahlen(50.00);
        sparKonto.print();


        System.out.println("");
        System.out.println("<<< Use Case: Casting >>>");
        castingKonto.print();

        System.out.println("");
        System.out.println("<<< Cast to Konto >>>");
        Konto castKonto = castingKonto;
        castKonto.print();
        castKonto.einzahlen(700.00);
        castKonto.print();
        castKonto.auszahlen(700.00);
        castKonto.print();

        System.out.println("");
        System.out.println("<<< Cast to GiroKonto >>>");
        GiroKonto castGiroKonto = castingKonto;
        castGiroKonto.print();
        castGiroKonto.auszahlen(500.00);
        castGiroKonto.einzahlen(700.00);
        castGiroKonto.print();

    }

}
