public class EmployeesEngine {

  private static Employee[] employees = new Employee[10];

  public static void setEmployees(Employee employee) {
    for (int i = 0; i < employees.length; i++) {
      if (employees[i] == null) {
        employees[i] = employee;
        break;
      }
    }
  }

  public static void getAllEmployees() {
    System.out.println("Получить список всех сотрудников:");
    for (int i = 0; i < employees.length; i++) {
      System.out.println(
          employees[i]);
    }
  }

  public static void getSummSalary() {
    System.out.println("Посчитать сумму затрат на ЗП:");
    int summ = 0;
    for (int i = 0; i < employees.length; i++) {
      summ += employees[i].getSalary();
    }
    System.out.println("Сумма затрат на ЗП в месяц: " + summ + " т.р.");
  }

  public static void getMinSalary() {
    System.out.println(" Найти сотрудника с минимальной ЗП:");
    String workerFIO = "";
    int workerId = 0;
    int minSalary = 999999999;
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getSalary() < minSalary) {
        minSalary = employees[i].getSalary();
        workerFIO = employees[i].getName();
        workerId = employees[i].getId();
      }
    }

    System.out.println(
        "Самая маленькая зп у сотрудника " + workerFIO + " с Id " + workerId + " и зарплатой "
            + minSalary);
  }

  public static void getMaxSalary() {
    System.out.println("Найти сотрудника с максимальной ЗП:");
    String workerFIO = "";
    int workerId = 0;
    int maxSalary = 0;
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getSalary() > maxSalary) {
        maxSalary = employees[i].getSalary();
        workerFIO = employees[i].getName();
        workerId = employees[i].getId();
      }
    }
    System.out.println(
        "Самая большая зп у сотрудника " + workerFIO + " с Id " + workerId + " и зарплатой "
            + maxSalary);
  }

  public static void getAverSalary() {
    System.out.println("Подсчитать среднее значение зарплат:");
    int summ = 0;
    for (int i = 0; i < employees.length; i++) {
      summ += employees[i].getSalary() / 2;
    }
    System.out.println("Сумма затрат на ЗП в месяц: " + summ + " т.р.");
  }

  public static void getAllFIO() {
    System.out.println("Получить список всех сотрудников:");
    for (int i = 0; i < employees.length; i++) {
      System.out.println(employees[i].getName());
    }
  }

  public static void setIncreaseSalary(int percent) {
    System.out.println("Увеличение зп всех сотрудников на " + percent + " %");
    for (int i = 0; i < employees.length; i++) {
      employees[i].setSalary(
          employees[i].getSalary() + ((employees[i].getSalary() / 100) * percent));
    }
    getAllEmployees();
  }

  public static void getDepartmentMinSalary(int department) {
    System.out.println("Найти сотрудника с минимальной ЗП:");
    String workerFIO = "";
    int workerId = 0;
    int minSalary = 9999999;
    int workerDepartment = 0;
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getDepartment() == department) {
        if (employees[i].getSalary() < minSalary) {
          minSalary = employees[i].getSalary();
          workerFIO = employees[i].getName();
          workerId = employees[i].getId();
          workerDepartment = employees[i].getDepartment();
        }
      }
    }
    System.out.println(
        "Самая минимальная зп у сотрудника " + workerFIO + " с Id " + workerId + " из отдела "
            + workerDepartment + " и зарплатой "
            + minSalary);
  }

  public static void getDepartmentMaxSalary(int department) {
    System.out.println("Найти сотрудника с наибольшей ЗП:");
    String workerFIO = "";
    int workerId = 0;
    int maxSalary = 0;
    int workerDepartment = 0;
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getDepartment() == department) {
        if (employees[i].getSalary() > maxSalary) {
          maxSalary = employees[i].getSalary();
          workerFIO = employees[i].getName();
          workerId = employees[i].getId();
          workerDepartment = employees[i].getDepartment();
        }
      }
    }
    System.out.println(
        "Самая наибольшая зп у сотрудника " + workerFIO + " с Id " + workerId + " из отдела "
            + workerDepartment + " и зарплатой "
            + maxSalary);
  }

  public static void getDepartmentSalary(int department) {
    System.out.println("Найти сумму затрат на зп по отделу: ");
    int departmentSalary = 0;
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getDepartment() == department) {
        departmentSalary += employees[i].getSalary();
      }
    }
    System.out.println("Сумма затрат на зп по отделу: " + department + " = " + departmentSalary);
  }

  public static void getDepartmentAverSalary(int department) {
    System.out.println("Найти среднюю зп по отделу: ");
    int averageSalary = 0;
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getDepartment() == department) {
        averageSalary += employees[i].getSalary() / 2;
      }
    }
    System.out.println("Средняя зп по отделу " + department + " = " + averageSalary);
  }

  public static void setDepartmentSalaryIncrease(int department, int percent) {
    System.out.println(
        "Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра");
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getDepartment() == department) {
        employees[i].setSalary(
            employees[i].getSalary() + ((employees[i].getSalary() / 100) * percent));
      }
    }
    getAllEmployees();
  }

  public static void getAllEmployeesFromDept(int department) {
    System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела).");
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getDepartment() == department) {
        System.out.println(
            " " + employees[i].getName() + " " + employees[i].getId() + " "
                + employees[i].getSalary());
      }
    }
  }

  public static void getEmployeesSalaryLessFilter(int num) {
    System.out.println("Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль)");
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getSalary() < num) {
        System.out.println(
            " " + employees[i].getName() + " " + employees[i].getSalary() + " "
                + employees[i].getId() + " " + employees[i].getSalary());
      }
    }
  }

  public static void getEmployeesSalaryMoreFilter(int num) {
    System.out.println(
        "Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль)");
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getSalary() >= num) {
        System.out.println(
            " " + employees[i].getName() + " " + employees[i].getSalary() + " "
                + employees[i].getId());
      }
    }
  }
}
