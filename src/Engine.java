public class EmployeeBook {

  private static Employee[] employees = new Employee[10];

  public static void setEmployees(Employee employee) {
    for (int i = 0; i < employees.length; i++) {
      employees[i] = employee;
      break;
    }
  }

}
