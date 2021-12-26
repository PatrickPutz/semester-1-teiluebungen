package iwi.campus02.teiluebungen.lv3.abschreibung;

public class Anlage {

    private String bezeichnung;
    private double initialwert;
    private int nutzungsdauer;
    private double restwert;
    private int alter;

    public Anlage(String bezeichnung, double initialwert, int nutzungsdauer) {
        this.bezeichnung = bezeichnung;
        this.initialwert = initialwert;
        this.nutzungsdauer = nutzungsdauer;
        this.restwert = initialwert;
        this.alter = 0;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getInitialwert() {
        return initialwert;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }

    public double getRestwert() {
        return restwert;
    }

    public int getAlter() {
        return alter;
    }

    @Override
    public String toString() {
        return "Anlage [" +
                "Bezeichnung='" + bezeichnung + '\'' +
                ", Initialwert=" + initialwert +
                ", Nutzungsdauer=" + nutzungsdauer +
                ", Restwert=" + restwert +
                ", Alter=" + alter +
                ']';
    }

    public void abschreiben(){
        this.alter++;
        if (this.alter <= this.restwert){
            this.restwert = Math.floor(this.initialwert / this.nutzungsdauer *
                    (this.nutzungsdauer - this.alter));
        }
    }

    public void simulate(int maxJahre, int minWert){
        int counter = 1;
        while (counter <= maxJahre && restwert > minWert){
            System.out.println("Vorher > Jahr " + counter + " " + toString());
            abschreiben();
            System.out.println("Nachher > Jahr " + counter + " " + toString());
            counter++;
        }
    }

    public Anlage renew (int zusatzWert, int zusatzJahre){
        Anlage renewal = new Anlage(this.bezeichnung, this.restwert + zusatzWert,
                (this.nutzungsdauer - alter) + zusatzJahre);
        return renewal;
    }

}
