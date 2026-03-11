class Person {
    protected String bloodGroup = "O+";
}
class Employee extends Person {
    private double salary;
    public String name;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Error: Salary cannot be negative!");
        }
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Medical Data (Protected): " + bloodGroup);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50000);
        emp.name = "John Smith";
        emp.setSalary(55000);
        System.out.println("Updated Salary via Getter: " + emp.getSalary());
        System.out.println("\n--- Full Employee Report ---");
        emp.showInfo();
    }
}
