package iwi.campus02.teiluebungen.lv1;

import java.util.Scanner;

public class RechteckDemo {

    public static void main(String[] args) {

        int breite = 0;
        int laenge = 0;
        int umfang = 0;
        int flaeche = 0;
        Scanner getData = new Scanner(System.in);

        System.out.print("Breite des Rechtecks: ");
        breite = getData.nextInt();
        System.out.print("Länge des Rechtecks: ");
        laenge = getData.nextInt();

        umfang = umfangBerechnen(breite, laenge);
        System.out.println("Umfang: " + umfang);

        flaeche = flaecheBerechnen(breite, laenge);
        System.out.println("Fläche: " + flaeche);

    }

    public static int umfangBerechnen(int breite, int laenge){
        return ((2 * breite) + (2 * laenge));
    }

    public static int flaecheBerechnen(int breite, int laenge){
        return (breite * laenge);
    }

}
