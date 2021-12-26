package iwi.campus02.teiluebungen.lv4.eventkalender;

import com.sun.source.tree.LiteralTree;

import java.util.ArrayList;

public class EventDemoApp {

    public static void main(String[] args) {

        Event e1 = new Event();
        e1.setTitle("Konzert X");
        e1.setOrt("Graz");
        e1.setEintrittspreis(45.00);

        Event e2 = new Event();
        e2.setTitle("Theater Y");
        e2.setOrt("Graz");
        e2.setEintrittspreis(35.00);

        Event e3 = new Event();
        e3.setTitle("Kinovorstellung Z");
        e3.setOrt("Graz");
        e3.setEintrittspreis(12.00);

        Event e4 = new Event();
        e4.setTitle("Fußballspiel A vs. B");
        e4.setOrt("München");
        e4.setEintrittspreis(76.00);

        Event e5 = new Event();
        e5.setTitle("Tennisspiel C vs. D");
        e5.setOrt("London");
        e5.setEintrittspreis(100.00);

        EventKalender ek = new EventKalender();
        ek.add(e1);
        ek.add(e2);
        ek.add(e3);
        ek.add(e4);
        ek.add(e5);

        Event byTitle = ek.getByTitle("Kinovorstellung Z");
        System.out.println(byTitle);
        byTitle = ek.getByTitle("bla blub");
        System.out.println(byTitle);

        ArrayList<Event> byOrt = ek.getByOrt("Graz");
        System.out.println(byOrt);
        byOrt = ek.getByOrt("Wien");
        System.out.println(byOrt);

        ArrayList<Event> byPreis = ek.getByEintrittsPreis(35.00, 76.00);
        System.out.println(byPreis);

        ArrayList<Event> mostExpensiveGraz = ek.getMostExpensiveByOrt("Graz");
        for (Event event : mostExpensiveGraz) {
            System.out.println(event);
        }

        ArrayList<Event> mostExpensiveLondon = ek.getMostExpensiveByOrt("London");
        for (Event event : mostExpensiveLondon) {
            System.out.println(event);
        }

        double avgPreisGraz = ek.getAvgPreisByOrt("Graz");
        System.out.println(avgPreisGraz);

        double avgPreisMuenchen = ek.getAvgPreisByOrt("München");
        System.out.println(avgPreisMuenchen);

    }

}
