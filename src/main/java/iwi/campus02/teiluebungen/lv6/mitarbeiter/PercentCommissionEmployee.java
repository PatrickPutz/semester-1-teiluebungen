package iwi.campus02.teiluebungen.lv6.mitarbeiter;

public class PercentCommissionEmployee extends Employee {

    private double percentCommission;

    public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double percentCommission) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    @Override
    public double getFullSalary() {
        return (super.getFullSalary() + (super.baseSalary * this.percentCommission));
    }
}
