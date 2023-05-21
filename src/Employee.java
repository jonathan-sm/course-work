public class Employee {

    private int id;
    private String  Fullname;
    private int Department;
    private int salary;
    private static int counter = 1;

    public Employee(String fullname, int department, int salary) {
        this.id = counter++;
        Fullname = fullname;
        Department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return Fullname;
    }

    public int getDepartment() {
        return Department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник " + id +" "+ Fullname + ' ' +
                "Отдел № " + Department +
                " Зарплата " + salary + "рублей";
    }
}
