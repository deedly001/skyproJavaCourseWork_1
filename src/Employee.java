import java.util.Objects;

public class Employee {

  private static int Counter = 1;
  private String FullName;
  private int department;
  private int salary;
  private int id;

  public Employee(String FIO, int department, int salary) {
    this.FullName = FIO;
    this.department = department;
    this.salary = salary;
    this.id = Counter++;
  }

  public static int getCounter() {
    return Counter;
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
        && Objects.equals(FullName, employee.FullName) && (this.hashCode() == o.hashCode());
  }

  @Override
  public int hashCode() {
    return Objects.hash(FullName, department, salary, id);
  }

  @Override
  public String toString() {
    return "Сотрудник - " +
        "ФИО: " + FullName + '\'' +
        ", отдел - " + department +
        ", зарплата - " + salary +
        ", id - " + id;
  }

  public String getName() {
    return FullName;
  }

  public void setName(String FIO) {
    this.FullName = FIO;
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

  public void setId(int id) {
    this.id = id;
  }


}

