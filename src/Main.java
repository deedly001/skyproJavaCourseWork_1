public class Main {

  public static void main(String[] args) {
    Engine employee = new Engine();
    Engine.setEmployees(new Employee("Sergey", 1, 100000));
    Engine.setEmployees(new Employee("Artem", 2, 100000));
    Engine.setEmployees(new Employee("Petr", 3, 140000));
    Engine.setEmployees(new Employee("Anna", 4, 100000));
    Engine.setEmployees(new Employee("Pavel", 1, 100000);
    Engine.setEmployees(new Employee("Lena", 1, 100000));
    Engine.setEmployees(new Employee("Anna", 4, 100000));
    Engine.setEmployees(new Employee("Bell", 3, 280000));
    Engine.setEmployees(new Employee("Yana", 1, 90000));
    Engine.setEmployees(new Employee("Alex", 5, 220000));

    Employee.getAll(employees);
    Employee.getSummSalary(employees);
    Employee.getMinSalary(employees);
    Employee.getMaxSalary(employees);
    Employee.getAverSalary(employees);
    Employee.getAllFIO(employees);
    Employee.setIncreaseSalary(2, employees);
    Employee.getDepartmentMinSalary(3, employees);
    Employee.getDepartmentMaxSalary(1, employees);
    Employee.getDepartmentSalary(1, employees);
    Employee.getDepartmentAverSalary(2, employees);
    Employee.setDepartmentSalaryIncrease(2, 3, employees);
    Employee.getAllEmployeesFromDept(2, employees);
    Employee.getEmployeesSalaryLessFilter(100000, employees);
    Employee.getEmployeesSalaryMoreFilter(200000, employees);

  }
}