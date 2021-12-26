package iwi.campus02.teiluebungen.lv4.pegelverwaltung;

public class Wasserstand {

    private int id;
    private String gewaessername;
    private double messwert;
    private double messwertfueralarmierung;
    private int zeitpunkt;

    public Wasserstand() {

    }

    public Wasserstand(int id, String gewaessername, double messwert, double messwertfueralarmierung, int zeitpunkt) {
        this.id = id;
        this.gewaessername = gewaessername;
        this.messwert = messwert;
        this.messwertfueralarmierung = messwertfueralarmierung;
        this.zeitpunkt = zeitpunkt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewaessername() {
        return gewaessername;
    }

    public void setGewaessername(String gewaessername) {
        this.gewaessername = gewaessername;
    }

    public double getMesswert() {
        return messwert;
    }

    public void setMesswert(double messwert) {
        this.messwert = messwert;
    }

    public double getMesswertfueralarmierung() {
        return messwertfueralarmierung;
    }

    public void setMesswertfueralarmierung(double messwertfueralarmierung) {
        this.messwertfueralarmierung = messwertfueralarmierung;
    }

    public int getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", gewaessername='" + gewaessername + '\'' +
                ", messwert=" + messwert +
                ", messwertfueralarmierung=" + messwertfueralarmierung +
                ", zeitpunkt=" + zeitpunkt +
                '}';
    }
}
