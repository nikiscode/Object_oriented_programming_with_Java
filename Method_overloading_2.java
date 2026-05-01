class SalaryCalculator {

    // Method 1: Basic salary only
    void calculateSalary(double basic) {
        double salary = basic;
        System.out.println("Total Salary: " + salary);
    }

    // Method 2: Basic salary + bonus
    void calculateSalary(double basic, double bonus) {
        double salary = basic + bonus;
        System.out.println("Total Salary (with Bonus): " + salary);
    }

    // Method 3: Basic salary + bonus + allowance
    void calculateSalary(double basic, double bonus, double allowance) {
        double salary = basic + bonus + allowance;
        System.out.println("Total Salary (with Bonus and Allowance): " + salary);
    }
}

public class employeeMain {
    public static void main(String[] args) {
        SalaryCalculator emp = new SalaryCalculator();

        emp.calculateSalary(30000);                  // Basic salary
        emp.calculateSalary(30000, 5000);            // Salary + Bonus
        emp.calculateSalary(30000, 5000, 2000);      // Salary + Bonus + Allowance
    }
}
