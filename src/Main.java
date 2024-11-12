import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Employee[] employees = new Employee[10];
    employees[0] = new Employee("Sergey", 1, 100000);
    employees[1] = new Employee("Artem", 2, 100000);
    employees[2] = new Employee("Petr", 3, 140000);
    employees[3] = new Employee("Anna", 4, 100000);
    employees[4] = new Employee("Pavel", 1, 100000);
    employees[5] = new Employee("Lena", 1, 100000);
    employees[6] = new Employee("Anna", 4, 100000);
    employees[7] = new Employee("Bell", 3, 280000);
    employees[8] = new Employee("Yana", 1, 90000);
    employees[9] = new Employee("Alex", 5, 220000);
    Employee.getAll(employees);
    Employee.getSummSalary(employees);
    Employee.getMinSalary(employees);
    Employee.getMaxSalary(employees);
    Employee.getAverSalary(employees);
    Employee.getAllFIO(employees);
  }
}