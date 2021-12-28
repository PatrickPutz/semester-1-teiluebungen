package iwi.campus02.teiluebungen.lv6.mitarbeiter;

public class Employee {

    protected String lastname;
    protected String firstname;
    protected String department;
    protected double baseSalary;

    public Employee(String lastname, String firstname, String department, double baseSalary) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary(){
        return this.baseSalary;
    }

}
