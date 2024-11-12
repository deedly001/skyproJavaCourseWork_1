public class Employee {

  private  String FIO;
  private static int Counter = 1;
  private int department;
  private int salary;
  private int id;

  public Employee(String FIO, int department, int salary) {
    this.FIO = FIO;
    this.department = department;
    this.salary = salary;
    this.id = Counter++;
  }

  public static int getCounter() {
    return Counter;
  }

  @Override
  public String toString() {
    return "Сотрудник - " +
        "ФИО: " + FIO + '\'' +
        ", отдел - " + department +
        ", зарплата - " + salary +
        ", id - " + id;
  }

  public String getName() {
    return FIO;
  }

  public int getDepartment() {
    return department;
  }

  public void setDepartment(int department) {
    this.department = department;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public static void getAll(Employee[] employee) {
    for (int i = 0; i < employee.length; i++) {
      System.out.println(employee[i].toString());
    }
  }

  public static void getSummSalary(Employee[] employee) {
    int summ = 0;
    for (int i = 0; i < employee.length; i++) {
      summ += employee[i].getSalary();
    }
    System.out.println("Сумма затрат на ЗП в месяц: " + summ + " т.р.");
  }

  public static void getMinSalary(Employee[] employee) {
    String workerFIO = "";
    int workerId = 0;
    int minSalary = 999999999;
    for (int i = 0; i < employee.length; i++) {
      if (employee[i].getSalary() < minSalary) {
        minSalary = employee[i].getSalary();
        workerFIO = employee[i].getName();
        workerId = employee[i].getId();
      }
    }
    System.out.println(
        "Самая маленькая зп у сотрудника " + workerFIO + " с номером " + workerId + " и зарплатой "
            + minSalary);
  }

  public static void getMaxSalary(Employee[] employee) {
    String workerFIO = "";
    int workerId = 0;
    int maxSalary = 0;
    for (int i = 0; i < employee.length; i++) {
      if (employee[i].getSalary() > maxSalary) {
        maxSalary = employee[i].getSalary();
        workerFIO = employee[i].getName();
        workerId = employee[i].getId();
      }
    }
    System.out.println(
        "Самая большая зп у сотрудника " + workerFIO + " с номером " + workerId + " и зарплатой "
            + maxSalary);
  }

  public static void getAverSalary(Employee[] employee){
    int summ = 0;
    for (int i = 0; i < employee.length; i++) {
      summ += employee[i].getSalary() / 2;
    }
    System.out.println("Сумма затрат на ЗП в месяц: " + summ + " т.р.");
  }

  public static void getAllFIO(Employee[] employee){
    for (int i = 0; i < employee.length; i++) {
      System.out.println(employee[i].getName());
    }
  }


}