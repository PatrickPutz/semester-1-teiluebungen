package iwi.campus02.teiluebungen.lv4.eventkalender;

import java.util.ArrayList;

public class EventKalender {

    private ArrayList<Event> events;

    public EventKalender() {
        this.events = new ArrayList<>();
    }

    public void add(Event event){
        events.add(event);
    }

    public Event getByTitle(String title){
        for (Event event : events) {
            if (event.getTitle().equals(title))
                return event;
        }
        return null;
    }

    public ArrayList<Event> getByOrt(String ort){
        ArrayList<Event> result = new ArrayList<>();

        for (Event event : events) {
            if(event.getOrt().equals(ort)) {
                result.add(event);
            }
        }
        return result;
    }

    public ArrayList<Event> getByEintrittsPreis(double min, double max){
        ArrayList<Event> result = new ArrayList<>();

        for (Event event : events) {
            if(event.getEintrittspreis() < max && event.getEintrittspreis() > min){
                result.add(event);
            }
        }

        return result;
    }

    public ArrayList<Event> getMostExpensiveByOrt(String ort){
        double price = 0.0;
        ArrayList<Event> mostExpensive = new ArrayList<>();
        Event result = new Event();
        result.setOrt(ort);

        for (Event event : events) {
            if (event.getOrt().equals(ort)) {
                if (event.getEintrittspreis() > price) {
                    result.setEintrittspreis(event.getEintrittspreis());
                    result.setTitle(event.getTitle());
                }
            }
        }

        mostExpensive.add(result);

        return mostExpensive;
    }

    public double getAvgPreisByOrt(String ort){
        ArrayList<Event> average = getByOrt(ort);
        double result = 0.0;
        int counter = 0;

        for (Event event : average) {
            result += event.getEintrittspreis();
            counter++;
        }

        if (counter == 0) {
            return 0.0;
        }

        return (result / (double) counter);
    }

}
