public class Main {

  public static void main(String[] args) {
    EmployeeBook employee = new EmployeeBook();
    employee.setEmployees(new Employee("Sergey", 1, 100000));
    employee.setEmployees(new Employee("Artem", 2, 100000));
    employee.setEmployees(new Employee("Petr", 3, 140000));
    employee.setEmployees(new Employee("Anna", 4, 100000));
    employee.setEmployees(new Employee("Pavel", 1, 100000));
    employee.setEmployees(new Employee("Lena", 1, 100000));
    employee.setEmployees(new Employee("Anna", 4, 100000));
    employee.setEmployees(new Employee("Bell", 3, 280000));
    employee.setEmployees(new Employee("Yana", 1, 90000));
    employee.setEmployees(new Employee("Alex", 5, 220000));
    employee.getAllEmployees();
    employee.getSumSalary();
    employee.getMinSalary();
    employee.getMaxSalary();
    employee.getAverSalary();
    employee.getAllFIO();
    employee.setIncreaseSalary(2);
    employee.getDepartmentMinSalary(3);
    employee.getDepartmentMaxSalary(1);
    employee.getDepartmentSalary(1);
    employee.getDepartmentAverSalary(2);
    employee.setDepartmentSalaryIncrease(2, 3);
    employee.getAllEmployeesFromDept(2);
    employee.getEmployeesSalaryLessFilter(100000);
    employee.getEmployeesSalaryMoreFilter(200000);
    employee.removeEmployee("Alex");
    employee.createEmployee(new Employee("Fedor", 2, 330000));
    employee.getEmployeeById(7);
  }
}