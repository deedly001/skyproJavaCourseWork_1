import java.util.Objects;

public class Employee {

  private static int Counter = 1;
  private String FIO;
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

  public static void getAll(Employee[] employee) {
    System.out.println("Получить список всех сотрудников:");
    for (int i = 0; i < employee.length; i++) {
      System.out.println(employee[i].toString());

    }
  }

  public static void getSummSalary(Employee[] employee) {
    System.out.println("Посчитать сумму затрат на ЗП:");
    int summ = 0;
    for (int i = 0; i < employee.length; i++) {
      summ += employee[i].getSalary();
    }
    System.out.println("Сумма затрат на ЗП в месяц: " + summ + " т.р.");
  }

  public static void getMinSalary(Employee[] employee) {
    System.out.println(" Найти сотрудника с минимальной ЗП:");
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
        "Самая маленькая зп у сотрудника " + workerFIO + " с Id " + workerId + " и зарплатой "
            + minSalary);
  }

  public static void getMaxSalary(Employee[] employee) {
    System.out.println("Найти сотрудника с максимальной ЗП:");
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
        "Самая большая зп у сотрудника " + workerFIO + " с Id " + workerId + " и зарплатой "
            + maxSalary);
  }

  public static void getAverSalary(Employee[] employee) {
    System.out.println("Подсчитать среднее значение зарплат:");
    int summ = 0;
    for (int i = 0; i < employee.length; i++) {
      summ += employee[i].getSalary() / 2;
    }
    System.out.println("Сумма затрат на ЗП в месяц: " + summ + " т.р.");
  }

  public static void getAllFIO(Employee[] employee) {
    System.out.println("Получить список всех сотрудников:");
    for (int i = 0; i < employee.length; i++) {
      System.out.println(employee[i].getName());
    }
  }

  public static void setIncreaseSalary(int percent, Employee[] employee) {
    System.out.println("Увеличение зп всех сотрудников на " + percent + " %");
    for (int i = 0; i < employee.length; i++) {
      employee[i].setSalary(employee[i].getSalary() + (employee[i].getSalary() / 100) * percent);
    }
    getAll(employee);
  }

  public static void getDepartmentMinSalary(int department, Employee[] employee) {
    System.out.println("Найти сотрудника с минимальной ЗП:");
    String workerFIO = "";
    int workerId = 0;
    int minSalary = 9999999;
    int workerDepartment = 0;
    for (int i = 0; i < employee.length; i++) {
      if (employee[i].getDepartment() == department) {
        if (employee[i].getSalary() < minSalary) {
          minSalary = employee[i].getSalary();
          workerFIO = employee[i].getName();
          workerId = employee[i].getId();
          workerDepartment = employee[i].getDepartment();
        }
      }
    }
    System.out.println(
        "Самая минимальная зп у сотрудника " + workerFIO + " с Id " + workerId + " из отдела "
            + workerDepartment + " и зарплатой "
            + minSalary);
  }

  public static void getDepartmentMaxSalary(int department, Employee[] employee) {
    System.out.println("Найти сотрудника с наибольшей ЗП:");
    String workerFIO = "";
    int workerId = 0;
    int maxSalary = 0;
    int workerDepartment = 0;
    for (int i = 0; i < employee.length; i++) {
      if (employee[i].getDepartment() == department) {
        if (employee[i].getSalary() > maxSalary) {
          maxSalary = employee[i].getSalary();
          workerFIO = employee[i].getName();
          workerId = employee[i].getId();
          workerDepartment = employee[i].getDepartment();
        }
      }
    }
    System.out.println(
        "Самая наибольшая зп у сотрудника " + workerFIO + " с Id " + workerId + " из отдела "
            + workerDepartment + " и зарплатой "
            + maxSalary);
  }

  public static void getDepartmentSalary(int department, Employee[] employee) {
    System.out.println("Найти сумму затрат на зп по отделу: ");
    int departmentSalary = 0;
    for (int i = 0; i < employee.length; i++) {
      if (employee[i].getDepartment() == department) {
        departmentSalary += employee[i].getSalary();
      }
    }
    System.out.println("Сумма затрат на зп по отделу: " + department + " = " + departmentSalary);
  }

  public static void getDepartmentAverSalary(int department, Employee[] employee) {
    System.out.println("Найти среднюю зп по отделу: ");
    int averageSalary = 0;
    for (int i = 0; i < employee.length; i++) {
      if (employee[i].getDepartment() == department) {
        averageSalary += employee[i].getSalary() / 2;
      }
    }
    System.out.println("Средняя зп по отделу " + department + " = " + averageSalary);
  }

  public static void setDepartmentSalaryIncrease(int department, int percent, Employee[] employee) {
    System.out.println(
        "Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра");
    for (int i = 0; i < employee.length; i++) {
      if (employee[i].getDepartment() == department) {
        employee[i].setSalary(employee[i].getSalary() + (employee[i].getSalary() / 100) * percent);
      }
    }
    getAll(employee);
  }

  public static void getAllEmployeesFromDept(int department, Employee[] employee) {
    System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела).");
    for (int i = 0; i < employee.length; i++) {
      if (employee[i].getDepartment() == department) {
        System.out.println(
            " " + employee[i].getName() + " " + employee[i].getId() + " "
                + employee[i].getSalary());
      }
    }
  }

  public static void getEmployeesSalaryLessFilter(int num, Employee[] employee) {
    System.out.println("Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль)");
    for (int i = 0; i < employee.length; i++) {
      if (employee[i].getSalary() < num) {
        System.out.println(
            " " + employee[i].getName() + " " + employee[i].getSalary() + " " + employee[i].getId()
                + " "
                + employee[i].getSalary());
      }
    }
  }

  public static void getEmployeesSalaryMoreFilter(int num, Employee[] employee) {
    System.out.println(
        "Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль)");
    for (int i = 0; i < employee.length; i++) {
      if (employee[i].getSalary() >= num) {
        System.out.println(
            " " + employee[i].getName() + " " + employee[i].getSalary() + " "
                + employee[i].getId());
      }
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Employee employee)) {
      return false;
    }
    return department == employee.department && salary == employee.salary && id == employee.id
        && Objects.equals(FIO, employee.FIO) && (this.hashCode() == o.hashCode());
  }

  @Override
  public int hashCode() {
    return Objects.hash(FIO, department, salary, id);
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

  public void setName(String FIO) {
    this.FIO = FIO;
  }

  public int getDepartment() {
    return this.department;
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

}

