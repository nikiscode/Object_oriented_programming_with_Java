class EMP {
    protected String Phno = 786543213455;
}
class Employee extends EMP {
    private double age;
    public String name;
    public Employee(String name, double age) {
        this.name = name;
        this.age = age;
    }
    public double getage() {
        return age;
    }
    public void setage(double newage) {
        if (newage > 0) {
            this.age = newage;
        } else {
            System.out.println("Error: Age cannot be negative!");
        }
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("Medical Data (Protected): " + Phno);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50);
        emp.name = "John Smith";
        emp.setnew(51);
        System.out.println("Updated new via Getter: " + emp.getnew());
        System.out.println("\n--- Full Employee Report ---");
        emp.showInfo();
    }
}
