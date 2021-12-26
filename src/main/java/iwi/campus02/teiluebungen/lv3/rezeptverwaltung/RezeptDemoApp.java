package iwi.campus02.teiluebungen.lv3.rezeptverwaltung;

public class RezeptDemoApp {

    public static void main(String[] args) {

        Zutat butter = new Zutat("Butter", 250);
        Zutat zucker = new Zutat("Zucker", 250);
        Zutat omasGeheimeZutat = new Zutat("Feenstaub", 100);
        Zutat mehl = new Zutat("Mehl 480 universal", 250);

        Zutat[] zutaten = {butter, zucker, omasGeheimeZutat, mehl};

        Rezept weihnachtsKekse = new Rezept("Weihnachtskekse", 4, zutaten);

        weihnachtsKekse.printRezept();

        Rezept wk10 = weihnachtsKekse.umrechnen(10);
        wk10.printRezept();

    }

}
