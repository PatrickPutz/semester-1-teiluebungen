package iwi.campus02.teiluebungen.lv3.abschreibung;

public class AnlageDemoApp {

    public static void main(String[] args) {

        Anlage a = new Anlage("Tisch", 500, 8);

        System.out.println(a.toString());
        a.abschreiben();
        System.out.println(a.toString());

        System.out.println("______________________________________________");

        a.simulate(5, 300);

        Anlage neu = a.renew(400, 5);
        System.out.println(neu.toString());

    }

}
