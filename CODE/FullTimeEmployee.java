public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void displaySalaryInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Monthly Salary: PHP " + monthlySalary);
    }
}
