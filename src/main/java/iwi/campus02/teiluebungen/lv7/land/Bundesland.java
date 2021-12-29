package iwi.campus02.teiluebungen.lv7.land;

public class Bundesland extends Land{

    private double bruttoSozialProdukt;

    public Bundesland(double bruttoSozialProdukt) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }

    @Override
    public double getBruttoSozialProdukt() {
        return this.bruttoSozialProdukt;
    }
}
