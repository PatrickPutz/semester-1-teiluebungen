package iwi.campus02.teiluebungen.lv3.bonusberechnung;

public class Mitarbeiter {

    private String vorname;
    private String nachname;
    private int mitarbeiternummer;
    private double gehalt;
    private int alter;
    private static int s_nummer = 0;

    public Mitarbeiter(String vorname, String nachname, double gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gehalt = gehalt;
        this.mitarbeiternummer = ++s_nummer;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getMitarbeiternummer() {
        return mitarbeiternummer;
    }

    public double getGehalt() {
        return gehalt;
    }

    public int getAlter() {
        return alter;
    }

    public static int getS_nummer() {
        return s_nummer;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public double monatsAbrechnung(){
        double jahresGehalt = gehalt * 12;
        double jahresGehaltOhneSV = jahresGehalt * 0.8;
        double steuer = 0.0;

        if (jahresGehaltOhneSV <= 10_000.00)
            steuer = jahresGehaltOhneSV * 0.1;
        else if (jahresGehaltOhneSV <= 20_000.00)
            steuer = jahresGehaltOhneSV * 0.2;
        else if (jahresGehaltOhneSV <= 30_000.00)
            steuer = jahresGehaltOhneSV * 0.32;
        else if (jahresGehaltOhneSV <= 50_000.00)
            steuer = jahresGehaltOhneSV * 0.45;
        else
            steuer = jahresGehaltOhneSV * 0.6;

        return (jahresGehaltOhneSV - steuer) / 12;
    }

    public double jahresAbrechnung(){
        return monatsAbrechnung() * 12;
    }

    public double jahresAbrechnung(int monate){
        return monatsAbrechnung() * monate;
    }
}
