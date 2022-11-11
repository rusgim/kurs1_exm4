public class Employee {
    private final Person person;
    private int department;
    private int salary;
    private final int id;
    private static int counter;


    public Employee(Person Person, int department, int salary) {
        this.person = Person;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public int getId() {
        return id;
    }
    public int getDepartment() {
        return this.department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString() {
        return " № отдела " + this.department + " получает зарплату " + this.salary;
    }
}