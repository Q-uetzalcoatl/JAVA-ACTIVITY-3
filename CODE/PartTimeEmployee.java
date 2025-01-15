public class PartTimeEmployee extends Employee {
    private double ratePerHour;
    private int hoursWorked;

    public PartTimeEmployee(String name, double ratePerHour, int hoursWorked) {
        super(name);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    public double calculateWage() {
        return ratePerHour * hoursWorked;
    }

    @Override
    public void displaySalaryInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Wage: PHP " + String.format("%.2f", calculateWage()));
    }
}
