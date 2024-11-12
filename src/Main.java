public class Main {

  public static void main(String[] args) {
    EmployeesEngine employee = new EmployeesEngine();
    EmployeesEngine.setEmployees(new Employee("Sergey", 1, 100000));
    EmployeesEngine.setEmployees(new Employee("Artem", 2, 100000));
    EmployeesEngine.setEmployees(new Employee("Petr", 3, 140000));
    EmployeesEngine.setEmployees(new Employee("Anna", 4, 100000));
    EmployeesEngine.setEmployees(new Employee("Pavel", 1, 100000));
    EmployeesEngine.setEmployees(new Employee("Lena", 1, 100000));
    EmployeesEngine.setEmployees(new Employee("Anna", 4, 100000));
    EmployeesEngine.setEmployees(new Employee("Bell", 3, 280000));
    EmployeesEngine.setEmployees(new Employee("Yana", 1, 90000));
    EmployeesEngine.setEmployees(new Employee("Alex", 5, 220000));
    EmployeesEngine.getAllEmployees();
    EmployeesEngine.getSummSalary();
    EmployeesEngine.getMinSalary();
    EmployeesEngine.getMaxSalary();
    EmployeesEngine.getAverSalary();
    EmployeesEngine.getAllFIO();
    EmployeesEngine.setIncreaseSalary(2);
    EmployeesEngine.getDepartmentMinSalary(3);
    EmployeesEngine.getDepartmentMaxSalary(1);
    EmployeesEngine.getDepartmentSalary(1);
    EmployeesEngine.getDepartmentAverSalary(2);
    EmployeesEngine.setDepartmentSalaryIncrease(2, 3);
    EmployeesEngine.getAllEmployeesFromDept(2);
    EmployeesEngine.getEmployeesSalaryLessFilter(100000);
    EmployeesEngine.getEmployeesSalaryMoreFilter(200000);

  }
}