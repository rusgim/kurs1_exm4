public class Main {
    public static void printTotalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary = totalSalary + employees[i].getSalary();
        }
        System.out.println("Сумма трат за месяц составит - " + totalSalary);
    }
    public static void main(String[] args) {
        DepartmentServise departmentServise = new DepartmentServise();
        Person[] person = new Person[10];
        person[0] = new Person("Самоволкин", "Солдат", "Разгуляевич");
        person[1] = new Person("Овальный", "Борис", "Петрович");
        person[2] = new Person("Диванов", "Андрейка", "Ленивич");
        person[3] = new Person("Валяев", "Николай", "Валуивич");
        person[4] = new Person("Умер", "Живчик", "Переживчик");
        person[5] = new Person("Николаев","Коля","Николаевич");
        person[6] =new Person("Иванов","Ванёк", "Ванович");
        person[7] = new Person("Олегов", "Олег", "Олегович");
        person[8] = new Person("Петров", "Петр", "Петрович");
        person[9] = new Person("Камасутра", "Ойо", "Додович");
        Employee[] employees = new Employee[10];
        employees[0] = new Employee(person[0], 5, 11025);
        employees[1] = new Employee(person[1], 1, 70500);
        employees[2] = new Employee(person[2], 2, 100500);
        employees[3] = new Employee(person[3], 3, 16450);
        employees[4] = new Employee(person[4], 4, 14563);
        employees[5] = new Employee(person[5], 5, 48936);
        employees[6] = new Employee(person[6], 1, 78596);
        employees[7] = new Employee(person[7], 2, 49678);
        employees[8] = new Employee(person[8], 3,79625);
        employees[9] = new Employee(person[9], 4, 99999);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (departmentServise.isAdult(employees[i])) {
                    System.out.println("Введите правильный отдел сотрудника  - от 1 до 5");
                }
                System.out.println(person[i].toString() + employees[i].toString());
            } else {
                System.out.println("");
            }
        }
    }
}