package iwi.campus02.teiluebungen.lv1;

import java.util.Scanner;

public class ZinsDemo {

    public static void main(String[] args) {

        double kontostand = 1000.00;
        double zinsen = 2.25;

        System.out.println("Zinsen = " + zinsen + "% von " + kontostand + " = " + (kontostand / 100 * zinsen));

        Scanner getData = new Scanner(System.in);
        System.out.print("Kontostand: ");
        kontostand = getData.nextDouble();
        System.out.print("Zinsen: ");
        zinsen = getData.nextDouble();

        System.out.println("Zinsen = " + zinsen + "% von " +
                kontostand + " = " + zinsBerechnung(kontostand, zinsen));

    }

    public static double zinsBerechnung(double kontostand, double zinsen){
        return ((kontostand / 100) * zinsen);
    }

}
