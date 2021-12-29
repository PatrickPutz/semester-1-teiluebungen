package iwi.campus02.teiluebungen.lv7.land;

import java.util.ArrayList;

public class Bundesstaat extends Land{

    private ArrayList<Land> laender;

    public Bundesstaat() {
        this.laender = new ArrayList<>();
    }

    public void addLand(Land l){
        this.laender.add(l);
    }

    @Override
    public double getBruttoSozialProdukt() {
        double result = 0.0;

        for (Land land : laender) {
            result += land.getBruttoSozialProdukt();
        }

        return result;
    }
}
