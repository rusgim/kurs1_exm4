public class Employee {
    private Person person;
    int department;
    int salary;

    public Employee(Person Person, int department, int salary) {
        this.person = Person;
        this.department = department;
        this.salary = salary;
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
        return " № номер отдела " + this.department + " получает зарплату " + this.salary;
    }
}