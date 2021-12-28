package iwi.campus02.teiluebungen.lv5_midterm.klassenundobjekte;

public class Person {

    private String vorname;
    private String nachname;
    private int koerpergroesse;
    private byte aktivitaetslevel;

    public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.koerpergroesse = koerpergroesse;
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getKoerpergroesse() {
        return koerpergroesse;
    }

    public byte getAktivitaetslevel() {
        return aktivitaetslevel;
    }

    public void setKoerpergroesse(int koerpergroesse) {
        this.koerpergroesse = koerpergroesse;
    }

    public void setAktivitaetslevel(byte aktivitaetslevel) {
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public String rechneBMI(int gewicht){
        double bmi = (double) gewicht / (((double) this.getKoerpergroesse() / 100.0) *
                ((double) this.getKoerpergroesse() / 100.0));

        if (bmi < 18.5){
            return "Untergewicht";
        }
        else if (bmi <= 25){
            return "Normalgewicht";
        }
        else if (bmi <= 30){
            return "Übergewicht";
        }
        else{
            return "Adipositas";
        }
    }

    public void printPerson(int gewicht){
        String activity;

        switch(this.aktivitaetslevel){
            case 1:
                activity = "Couch Potato";
                break;
            case 2:
                activity = "Gelegenheitssportler";
                break;
            case 3:
                activity = "Sportler";
                break;
            case 4:
                activity = "Profisportler";
                break;
            default:
                activity = "";
        }

        System.out.println(this.vorname + " " + this.nachname +
                ", " + activity + ", " + rechneBMI(gewicht));
    }
}
