package iwi.campus02.teiluebungen.lv3.bonusberechnung;

public class MitarbeiterDemoApp {

    public static void main(String[] args) {

        Mitarbeiter max = new Mitarbeiter("Max", "Mustermann", 43_000.00 / 12.0);
        Mitarbeiter susi = new Mitarbeiter("Susi", "Sorglos", 2650.0);
        Mitarbeiter karl = new Mitarbeiter("Karl", "Corona", 2200.0);

        System.out.println(max.monatsAbrechnung());
        System.out.println(max.jahresAbrechnung());
        System.out.println("______________________________________________");
        System.out.println(susi.monatsAbrechnung());
        System.out.println(susi.jahresAbrechnung(5));
        System.out.println("______________________________________________");
        System.out.println(karl.monatsAbrechnung());
        System.out.println(karl.jahresAbrechnung(8));

    }

}
