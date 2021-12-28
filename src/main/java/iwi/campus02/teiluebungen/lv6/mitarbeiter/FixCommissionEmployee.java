package iwi.campus02.teiluebungen.lv6.mitarbeiter;

public class FixCommissionEmployee extends Employee {

    private double additionalCommission;

    public FixCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double additionalCommission) {
        super(lastname, firstname, department, baseSalary);
        this.additionalCommission = additionalCommission;
    }

    @Override
    public double getFullSalary() {
        return (super.baseSalary + additionalCommission);
    }
}
