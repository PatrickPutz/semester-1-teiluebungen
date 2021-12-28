package iwi.campus02.teiluebungen.lv5_midterm.klassenundobjekte;

public class BMIDemoApp {

    public static void main(String[] args) {

        Person max = new Person("Max", "Mustermann", 185, (byte) 1);
        Person susi = new Person("Susi", "Sorglos", 160, (byte) 3);

        max.printPerson(120);
        susi.printPerson(40);

    }
}
