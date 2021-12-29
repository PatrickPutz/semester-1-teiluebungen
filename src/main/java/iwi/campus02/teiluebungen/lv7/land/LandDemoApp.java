package iwi.campus02.teiluebungen.lv7.land;

public class LandDemoApp {

    public static void main(String[] args) {

        Bundesstaat kalimdor = new Bundesstaat();
        Bundesland durotar = new Bundesland(75_000.00);
        Bundesland oedland = new Bundesland(45_000.00);

        kalimdor.addLand(durotar);
        kalimdor.addLand(oedland);

        System.out.println("");
        System.out.println("Durotar: " + durotar.getBruttoSozialProdukt());
        System.out.println("Oedland: " + oedland.getBruttoSozialProdukt());
        System.out.println("Kalimdor: " + kalimdor.getBruttoSozialProdukt());
        System.out.println("");

        Bundesstaat koenigreiche = new Bundesstaat();
        Bundesland geisterlande = new Bundesland(44_000.00);
        Bundesland silberwald = new Bundesland(12_000.00);

        koenigreiche.addLand(geisterlande);
        koenigreiche.addLand(silberwald);

        System.out.println("Geisterlande: " + geisterlande.getBruttoSozialProdukt());
        System.out.println("Silberwald: " + silberwald.getBruttoSozialProdukt());
        System.out.println("Östliche Königreiche: " + koenigreiche.getBruttoSozialProdukt());
        System.out.println("");

        Bundesstaat azeroth = new Bundesstaat();
        azeroth.addLand(kalimdor);
        azeroth.addLand(koenigreiche);

        System.out.println("Azeroth: " + azeroth.getBruttoSozialProdukt());

    }

}
