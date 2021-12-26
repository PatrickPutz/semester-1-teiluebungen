package iwi.campus02.teiluebungen.lv3.bestellverwaltung;

public class BestellungDemoApp {

    public static void main(String[] args) {

        Bestellzeile bz1 = new Bestellzeile("Acer Monitor", 1, 199);
        Bestellzeile bz2 = new Bestellzeile("USB Stick 8GB", 2, 19);
        Bestellzeile bz3 = new Bestellzeile("Bleistift", 7, 1);

        System.out.println("Bestellzeile 1 (Kosten): " + bz1.getKosten());
        System.out.println("Bestellzeile 2 (Kosten): " + bz2.getKosten());
        System.out.println("Bestellzeile 3 (Kosten): " + bz3.getKosten());

        System.out.println("______________________________________________");

        Bestellzeile[] bzArray = new Bestellzeile[3];
        bzArray[0] = bz1;
        bzArray[1] = bz2;
        bzArray[2] = bz3;

        Bestellung einkauf2612 = new Bestellung("Einkauf-26-12", bzArray);
        einkauf2612.printBestellung();
    }

}
