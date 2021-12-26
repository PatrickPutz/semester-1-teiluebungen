package iwi.campus02.teiluebungen.lv4.pegelverwaltung;

import java.util.ArrayList;

public class WasserstandManager {

    private ArrayList<Wasserstand> wasserstaende;

    public WasserstandManager() {
        this.wasserstaende = new ArrayList<>();
    }

    public void add(Wasserstand w){
        wasserstaende.add(w);
    }

    public Wasserstand findById(int id){
        for (Wasserstand wasserstand : wasserstaende) {
            if (wasserstand.getId() == id){
                return wasserstand;
            }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName){
        ArrayList<Wasserstand> result = new ArrayList<>();

        for (Wasserstand wasserstand : wasserstaende) {
            if(wasserstand.getGewaessername().equals(gewaesserName)){
                result.add(wasserstand);
            }
        }

        return result;
    }

    public Wasserstand findLastWasserstand(String gewaesserName){
        ArrayList<Wasserstand> sorted = findAllByGewaesser(gewaesserName);
        Wasserstand result = new Wasserstand();

        for (Wasserstand wasserstand : sorted) {
            if (wasserstand.getZeitpunkt() < result.getZeitpunkt()){
                result = wasserstand;
            }
        }

        return result;
    }

    public ArrayList<Wasserstand> findForAlarmierung(){
        ArrayList<Wasserstand> result = new ArrayList<>();

        for (Wasserstand wasserstand : wasserstaende) {
            if (wasserstand.getMesswertfueralarmierung() >= wasserstand.getMesswert()){
                result.add(wasserstand);
            }
        }

        return result;
    }

    public double calcMittlererWasserstand(String gewaessername, String ort){
        double result = 0.0;
        int counter = 0;

        for (Wasserstand wasserstand : wasserstaende) {
            if (wasserstand.getGewaessername().equals(gewaessername)){
                result += wasserstand.getMesswert();
                counter++;
            }
        }

        return (result / (double) counter);
    }

    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String gewaesserName){
        ArrayList<Wasserstand> result = new ArrayList<>();

        for (Wasserstand wasserstand : wasserstaende) {
            if(wasserstand.getZeitpunkt() >= von && wasserstand.getZeitpunkt() <= bis){
                if(wasserstand.getGewaessername().equals(gewaesserName)){
                    result.add(wasserstand);
                }
            }
        }

        return result;
    }

}
