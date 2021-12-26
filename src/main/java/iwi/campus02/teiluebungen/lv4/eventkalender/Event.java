package iwi.campus02.teiluebungen.lv4.eventkalender;

public class Event {

    private String title;
    private String ort;
    private double eintrittspreis;

    public String getTitle() {
        return title;
    }

    public String getOrt() {
        return ort;
    }

    public double getEintrittspreis() {
        return eintrittspreis;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setEintrittspreis(double eintrittspreis) {
        this.eintrittspreis = eintrittspreis;
    }



}
