public class EmployeeBook {

  private static final Employee[] employees = new Employee[10];

  public void setEmployees(Employee employee) {
    for (int i = 0; i < employees.length; i++) {
      if (employees[i] == null) {
        employees[i] = employee;
        break;
      }
    }
  }

  public void getAllEmployees() {
    System.out.println("Получить список всех сотрудников:");
    for (Employee employee : employees) {
      if (employee != null) {
        System.out.println(
            employee);
      }
    }
  }


  public void getSumSalary() {
    System.out.println("Посчитать сумму затрат на ЗП:");
    int summ = 0;
    for (Employee employee : employees) {
      if (employee != null) {
        summ += employee.getSalary();
      }
    }
    System.out.println("Сумма затрат на ЗП в месяц: " + summ + " т.р.");
  }

  public int getMinNum(Employee[] employees, int dept) {
    int workerId = 0;
    int minSalary = 999999999;
    if (dept < 0) {
      for (Employee employee : employees) {
        if (employee != null) {
          if (employee.getSalary() < minSalary) {
            workerId = employee.getId();
          }
        }
      }
    } else {
      for (Employee employee : employees) {
        if (employee != null) {
          if (employee.getDepartment() == dept) {
            if (employee.getSalary() < minSalary) {
              workerId = employee.getId();
            }
          }
        }
      }
    }
    return workerId;
  }

  public int getMaxNum(Employee[] employees, int dept) {
    int workerId = 0;
    int maxSalary = 0;
    if (dept < 0) {
      for (Employee employee : employees) {
        if (employee != null) {
          if (employee.getSalary() > maxSalary) {
            maxSalary = employee.getSalary();
            workerId = employee.getId();
          }
        }
      }
    } else {
      for (Employee employee : employees) {
        if (employee != null) {
          if (employee.getDepartment() == dept) {
            if (employee.getSalary() > maxSalary) {
              maxSalary = employee.getSalary();
              workerId = employee.getId();
            }
          }
        }
      }
    }
    return workerId;
  }

  public void getMinSalary() {
    System.out.println(" Найти сотрудника с минимальной ЗП:");
    int id = getMinNum(employees, -1);
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getId() == id) {
        System.out.println(
            "Самая маленькая зп у сотрудника " + employees[i].getFullName() + " с Id "
                + employees[i].getId()
                + " и зарплатой "
                + employees[i].getSalary());
      }
    }
  }

  public void getMaxSalary() {
    System.out.println("Найти сотрудника с максимальной ЗП:");
    int id = getMaxNum(employees, -1);
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getId() == id) {
        System.out.println(
            "Самая большая зп у сотрудника " + employees[i].getFullName() + " с Id "
                + employees[i].getId() + " и зарплатой " + employees[i].getSalary());
      }
    }
  }

  public void getAverSalary() {
    System.out.println("Подсчитать среднее значение зарплат:");
    int summ = 0;
    int employeeCount = employees.length;
    for (Employee employee : employees) {
      if (employee != null) {
        summ += employee.getSalary() / employeeCount;
      }
    }
    System.out.println("Сумма затрат на ЗП в месяц: " + summ + " т.р.");
  }

  public void getAllFIO() {
    System.out.println("Получить список всех сотрудников:");
    for (Employee employee : employees) {
      System.out.println(employee.getFullName());
    }
  }

  public void setIncreaseSalary(int percent) {
    System.out.println("Увеличение зп всех сотрудников на " + percent + " %");
    for (Employee employee : employees) {
      employee.setSalary(
          employee.getSalary() + ((employee.getSalary() / 100) * percent));
    }
    getAllEmployees();
  }

  public void getEmployeeById(int id) {
    System.out.println("Поиск сотрудника по ид:");
    for (Employee employee : employees) {
      if (employee != null) {
        if (employee.getId() == id) {
          System.out.println(employee.getFullName() + " " + employee.getDepartment());
        }
      }
    }
  }

  public void getDepartmentMinSalary(int department) {
    System.out.println("Найти сотрудника с минимальной ЗП:");
    int id = getMinNum(employees, department);
    for (int i = 0; i < employees.length; i++) {
      if (employees[i] != null) {
        if (employees[i].getId() == id) {
          System.out.println(
              "Самая минимальная зп у сотрудника " + employees[i].getFullName() + " с Id "
                  + employees[i].getId()
                  + " из отдела "
                  + employees[i].getDepartment());
        }
      }
    }
  }


  public void getDepartmentMaxSalary(int department) {
    System.out.println("Найти сотрудника с наибольшей ЗП:");
    int id = getMaxNum(employees, department);
    for (int i = 0; i < employees.length; i++) {
      if (employees[i] != null) {
        if (employees[i].getId() == id) {
          System.out.println(
              "Самая большая зп у сотрудника " + employees[i].getFullName() + " с Id "
                  + employees[i].getId()
                  + " из отдела "
                  + employees[i].getDepartment());
        }
      }
    }
  }

  public void getDepartmentSalary(int department) {
    System.out.println("Найти сумму затрат на зп по отделу: ");
    int departmentSalary = 0;
    for (Employee employee : employees) {
      if (employee.getDepartment() == department) {
        departmentSalary += employee.getSalary();
      }
    }
    System.out.println(
        "Сумма затрат на зп по отделу: " + department + " = " + departmentSalary);
  }

  public void getDepartmentAverSalary(int department) {
    System.out.println("Найти среднюю зп по отделу: ");
    int averageSalary = 0;
    int employeeCount = employees.length;
    for (Employee employee : employees) {
      if (employee.getDepartment() == department) {
        averageSalary += employee.getSalary() / employeeCount;
      }
    }
    System.out.println("Средняя зп по отделу " + department + " = " + averageSalary);
  }

  public void setDepartmentSalaryIncrease(int department, int percent) {
    System.out.println(
        "Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра:");
    for (Employee employee : employees) {
      if (employee != null) {
        if (employee.getDepartment() == department) {
          employee.setSalary(
              employee.getSalary() + ((employee.getSalary() / 100) * percent));
        }
      }
    }
    getAllEmployees();
  }

  public void getAllEmployeesFromDept(int department) {
    System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела):");
    for (Employee employee : employees) {
      if (employee != null) {
        if (employee.getDepartment() == department) {
          System.out.println(
              " " + employee.getFullName() + " " + employee.getId() + " "
                  + employee.getSalary());
        }
      }
    }
  }

  public void getEmployeesSalaryLessFilter(int num) {
    System.out.println(
        "Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль):");
    for (Employee employee : employees) {
      if (employee != null) {
        if (employee.getSalary() < num) {
          System.out.println(employee.getId() +
              " " + employee.getFullName() + " " + employee.getSalary() + " ");
        }
      }
    }
  }

  public void getEmployeesSalaryMoreFilter(int num) {
    System.out.println(
        "Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль):");
    for (Employee employee : employees) {
      if (employee != null) {
        if (employee.getSalary() >= num) {
          System.out.println(employee.getId() +
              " " + employee.getFullName() + " " + employee.getSalary() + " ");
        }
      }
    }
  }

  public boolean isNull() {
    boolean result = false;
    for (Employee employee : employees) {
      if (employee == null) {
        result = true;
        break;
      }
    }
    return result;
  }

  public void createEmployee(Employee employee) {
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

  public void removeEmployee(int id) {
    System.out.println("Удалить сотрудника:");
    for (int i = 0; i < employees.length; i++) {
      if (employees[i].getId() == id) {
        System.out.println("Работник " + employees[i].getFullName() + " был удалён");
        employees[i] = null;
      }
    }
  }
}

;