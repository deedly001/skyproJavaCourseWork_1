public class Main {

  public static void main(String[] args) {
    EmployeeBook employee = new EmployeeBook();
    EmployeeBook.setEmployees(new Employee("Sergey", 1, 100000));
    EmployeeBook.setEmployees(new Employee("Artem", 2, 100000));
    EmployeeBook.setEmployees(new Employee("Petr", 3, 140000));
    EmployeeBook.setEmployees(new Employee("Anna", 4, 100000));
    EmployeeBook.setEmployees(new Employee("Pavel", 1, 100000));
    EmployeeBook.setEmployees(new Employee("Lena", 1, 100000));
    EmployeeBook.setEmployees(new Employee("Anna", 4, 100000));
    EmployeeBook.setEmployees(new Employee("Bell", 3, 280000));
    EmployeeBook.setEmployees(new Employee("Yana", 1, 90000));
    EmployeeBook.setEmployees(new Employee("Alex", 5, 220000));
    EmployeeBook.getAllEmployees();
    EmployeeBook.getSumSalary();
    EmployeeBook.getMinSalary();
    EmployeeBook.getMaxSalary();
    EmployeeBook.getAverSalary();
    EmployeeBook.getAllFIO();
    EmployeeBook.setIncreaseSalary(2);
    EmployeeBook.getDepartmentMinSalary(3);
    EmployeeBook.getDepartmentMaxSalary(1);
    EmployeeBook.getDepartmentSalary(1);
    EmployeeBook.getDepartmentAverSalary(2);
    EmployeeBook.setDepartmentSalaryIncrease(2, 3);
    EmployeeBook.getAllEmployeesFromDept(2);
    EmployeeBook.getEmployeesSalaryLessFilter(100000);
    EmployeeBook.getEmployeesSalaryMoreFilter(200000);
    EmployeeBook.removeEmployee("Alex");
    EmployeeBook.createEmployee(new Employee("Fedor", 2, 330000));
    EmployeeBook.getEmployeeById(7);
  }
}