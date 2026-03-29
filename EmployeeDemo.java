class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    void increaseSalary(double percent) {
        salary = salary + (salary * percent / 100);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Vicky", 25000);

        System.out.println("Before Salary Increase:");
        emp1.display();
        
        emp1.increaseSalary(10);

        System.out.println("\nAfter Salary Increase:");
        emp1.display();
    }
}