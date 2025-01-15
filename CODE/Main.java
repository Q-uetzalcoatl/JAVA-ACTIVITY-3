import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Press F for Full-Time or P for Part-Time: ");
        char type = scanner.next().toUpperCase().charAt(0);

        Employee employee;

        if (type == 'F') {
            System.out.print("Enter monthly salary: ");
            double salary = scanner.nextDouble();
            employee = new FullTimeEmployee(name, salary);
        } else if (type == 'P') {
            System.out.print("Enter rate per hour and number of hours worked separated by spaces: ");
            double rate = scanner.nextDouble();
            int hours = scanner.nextInt();
            employee = new PartTimeEmployee(name, rate, hours);
        } else {
            System.out.println("Invalid input. Please restart the program.");
            scanner.close();
            return;
        }

        employee.displaySalaryInfo();

        scanner.close();
    }
}
