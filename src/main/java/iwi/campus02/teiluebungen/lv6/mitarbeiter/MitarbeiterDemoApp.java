package iwi.campus02.teiluebungen.lv6.mitarbeiter;

public class MitarbeiterDemoApp {

    public static void main(String[] args) {

        Employee max = new Employee("Mustermann", "Max", "R&D", 2800.00);
        FixCommissionEmployee susi = new FixCommissionEmployee("Sorglos", "Susi",
                "Finance", 2900.00, 150.00);
        PercentCommissionEmployee karl = new PercentCommissionEmployee("Corona", "Karl",
                "HR", 2650.00, 0.2);

        System.out.println("Max: " + max.getFullSalary());
        System.out.println("Susi: " + susi.getFullSalary());
        System.out.println("Karl: " + karl.getFullSalary());

    }

}
