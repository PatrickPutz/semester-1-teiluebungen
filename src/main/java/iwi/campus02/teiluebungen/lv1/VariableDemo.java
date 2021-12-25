package iwi.campus02.teiluebungen.lv1;

import java.util.Scanner;

public class VariableDemo {

    public static void main(String[] args) {

        String firstName;
        String lastName;
        Scanner getData = new Scanner(System.in);

        System.out.print("First Name: ");
        firstName = getData.next();
        System.out.print("Last Name: ");
        lastName = getData.next();

        System.out.println("Der Name lautet: " + firstName + " " + lastName);

    }

}
