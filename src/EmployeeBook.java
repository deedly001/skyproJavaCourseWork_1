public class EmployeeBook {

  private static final Employee[] employees = new Employee[10];

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
    for (Employee employee : employees) {
      System.out.println(
          employee);
    }
  }

  public static void getSumSalary() {
    System.out.println("Посчитать сумму затрат на ЗП:");
    int summ = 0;
    for (Employee employee : employees) {
      summ += employee.getSalary();
    }
    System.out.println("Сумма затрат на ЗП в месяц: " + summ + " т.р.");
  }

  public static void getMinSalary() {
    System.out.println(" Найти сотрудника с минимальной ЗП:");
    String workerFIO = "";
    int workerId = 0;
    int minSalary = 999999999;
    for (Employee employee : employees) {
      if (employee.getSalary() < minSalary) {
        minSalary = employee.getSalary();
        workerFIO = employee.getFullName();
        workerId = employee.getId();
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
    for (Employee employee : employees) {
      if (employee.getSalary() > maxSalary) {
        maxSalary = employee.getSalary();
        workerFIO = employee.getFullName();
        workerId = employee.getId();
      }
    }
    System.out.println(
        "Самая большая зп у сотрудника " + workerFIO + " с Id " + workerId + " и зарплатой "
            + maxSalary);
  }

  public static void getAverSalary() {
    System.out.println("Подсчитать среднее значение зарплат:");
    int summ = 0;
    for (Employee employee : employees) {
      summ += employee.getSalary() / 2;
    }
    System.out.println("Сумма затрат на ЗП в месяц: " + summ + " т.р.");
  }

  public static void getAllFIO() {
    System.out.println("Получить список всех сотрудников:");
    for (Employee employee : employees) {
      System.out.println(employee.getFullName());
    }
  }

  public static void setIncreaseSalary(int percent) {
    System.out.println("Увеличение зп всех сотрудников на " + percent + " %");
    for (Employee employee : employees) {
      employee.setSalary(
          employee.getSalary() + ((employee.getSalary() / 100) * percent));
    }
    getAllEmployees();
  }

  public static void getEmployeeById(int id) {
    System.out.println("Поиск сотрудника по ид:");
    for (Employee employee : employees) {
      if (employee.getId() == id) {
        System.out.println(employee.getFullName() + " " + employee.getDepartment());
      }
    }
  }

  public static void getDepartmentMinSalary(int department) {
    System.out.println("Найти сотрудника с минимальной ЗП:");
    String workerFIO = "";
    int workerId = 0;
    int minSalary = 9999999;
    int workerDepartment = 0;
    for (Employee employee : employees) {
      if (employee.getDepartment() == department) {
        if (employee.getSalary() < minSalary) {
          minSalary = employee.getSalary();
          workerFIO = employee.getFullName();
          workerId = employee.getId();
          workerDepartment = employee.getDepartment();
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
    for (Employee employee : employees) {
      if (employee.getDepartment() == department) {
        if (employee.getSalary() > maxSalary) {
          maxSalary = employee.getSalary();
          workerFIO = employee.getFullName();
          workerId = employee.getId();
          workerDepartment = employee.getDepartment();
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
    for (Employee employee : employees) {
      if (employee.getDepartment() == department) {
        departmentSalary += employee.getSalary();
      }
    }
    System.out.println("Сумма затрат на зп по отделу: " + department + " = " + departmentSalary);
  }

  public static void getDepartmentAverSalary(int department) {
    System.out.println("Найти среднюю зп по отделу: ");
    int averageSalary = 0;
    for (Employee employee : employees) {
      if (employee.getDepartment() == department) {
        averageSalary += employee.getSalary() / 2;
      }
    }
    System.out.println("Средняя зп по отделу " + department + " = " + averageSalary);
  }

  public static void setDepartmentSalaryIncrease(int department, int percent) {
    System.out.println(
        "Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра:");
    for (Employee employee : employees) {
      if (employee.getDepartment() == department) {
        employee.setSalary(
            employee.getSalary() + ((employee.getSalary() / 100) * percent));
      }
    }
    getAllEmployees();
  }

  public static void getAllEmployeesFromDept(int department) {
    System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела):");
    for (Employee employee : employees) {
      if (employee.getDepartment() == department) {
        System.out.println(
            " " + employee.getFullName() + " " + employee.getId() + " "
                + employee.getSalary());
      }
    }
  }

  public static void getEmployeesSalaryLessFilter(int num) {
    System.out.println("Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль):");
    for (Employee employee : employees) {
      if (employee.getSalary() < num) {
        System.out.println(employee.getId() +
            " " + employee.getFullName() + " " + employee.getSalary() + " ");
      }
    }
  }

  public static void getEmployeesSalaryMoreFilter(int num) {
    System.out.println(
        "Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль):");
    for (Employee employee : employees) {
      if (employee.getSalary() >= num) {
        System.out.println(employee.getId() +
            " " + employee.getFullName() + " " + employee.getSalary() + " ");
      }
    }
  }


  public static boolean isNull() {
    boolean result = false;
    for (Employee employee : employees) {
      if (employee == null) {
        result = true;
        break;
      }
    }
    return result;
  }

  public static void createEmployee(Employee employee) {
    System.out.println("Создать сотрудника:");
    if (isNull()) {
      for (int i = 0; i < employees.length; i++) {
        if (employees[i] == null) {
          employees[i] = employee;
          System.out.println("Добавлен сотрудник " + employees[i].getFullName());
        }
      }
    }
  }

  public static void removeEmployee(String FullName) {
    System.out.println("Удалить сотрудника:");
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getFullName().equals(FullName)) {
        System.out.println("Работник " + employees[i].getFullName() + " был удалён");
        employees[i] = null;
      }
    }
  }

}
