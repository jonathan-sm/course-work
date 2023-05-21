public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee employee1 = new Employee("Иванов Иван ", 5, 4000);
        Employee employee2 = new Employee("Рухлов Виталий ", 1, 50000);
        Employee employee3 = new Employee("Сидоров Антон ", 2, 300);
        Employee employee4 = new Employee("Борисов Влад", 3, 20000);
        Employee employee5 = new Employee("Смирнов Юрий", 4, 60000);
        Employee employee6 = new Employee("Воробьев Алексей ", 2, 70000);
        Employee employee7 = new Employee("Панкевич Олег ", 3, 12121);
        Employee employee8 = new Employee("Высоких Маским ", 4, 20000);
        Employee employee9 = new Employee("Власов Игорь ", 1, 925458);
        Employee employee10 = new Employee("Краснов Илья ", 5, 7575544);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;
        prinAll(employees);
        System.out.println("сумму затрат на зарплаты в месяц = " + getTotalSalary(employees));
        System.out.println("Сотрудник с минимальной зарплатой = " + getMinSalary(employees));
        System.out.println("Сотрудника с максимальной зарплатой = " + getMaxSalary(employees));
        System.out.println("Cреднее значение зарплат = " + getAverageSalary(employees));
        prinAllFullNames(employees);


    }

    public static void prinAll(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);

        }
    }

    public static int getTotalSalary(Employee[] employees) {
        int result = 0;
        for (Employee e : employees) {
            result += e.getSalary();
        }
        return result;
    }

    public static Employee getMinSalary(Employee[] employees) {
        Employee employeeMinSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = e;
            }
        }
        return employeeMinSalary;
    }

    public static Employee getMaxSalary(Employee[] employees) {
        Employee employeeMaxSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = e;
            }
        }
        return employeeMaxSalary;
    }

    public static double getAverageSalary(Employee[] employees) {
        return (double) getTotalSalary(employees) / employees.length;
    }

    public static void prinAllFullNames(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.getFullname());

        }
    }
}
