//import public Main.empl

public class EmployeeService {


    public static double sumExpenses() {
        double sum = 0;
        for (Employee element : OldMain.empl) {
            sum = sum + element.getSalary();
        }
        return sum;
    }

    public static void listEmployees(Employee[] arr) {
        for (Employee t : arr) {
            System.out.println(t);
        }
    }

    public static void minWageEmployee(Employee[] arr) {
        float min = Float.MAX_VALUE;
        String Empl = null;
        for (Employee t : arr) {
            if (t.getSalary() < min) {
                min = t.getSalary();
                Empl = t.getName();
            }
        }
        System.out.println("Минимальная зарплата: " + min + ", у сотрудника " + Empl);
    }

    public static void maxWageEmployee(Employee[] arr) {
        float max = Float.MIN_VALUE;
        String Empl = null;
        for (Employee t : arr) {
            if (t.getSalary() > max) {
                max = t.getSalary();
                Empl = t.getName();
            }
        }
        System.out.println("Максимальная зарплата: " + max + ", у сотрудника " + Empl);
    }

    public static double averageSalaryEmployee() {
        return sumExpenses() / OldMain.empl.length;
    }

    public static void fioEmployee(Employee[] arr) {
        for (Employee t : arr) {
            System.out.println(t.getName());
        }
    }

    //________Повышенная сложность
    public static void indexingSalary(int Procent) {
        for (Employee t : OldMain.empl) {
            t.setSalary(t.getSalary() + (t.getSalary() * Procent) / 100);
            System.out.println(t);
        }
    }

    public static void findMin(int department) {
        Employee minEmployee = null;
        for (Employee employee : OldMain.empl) {
            if (employee.getDepartament() != department) {
                continue;
            }
            if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зп" + " " + minEmployee);

    }

    public static void findMax(int department) {
        Employee maxEmployee = null;
        for (Employee employee : OldMain.empl) {
            if (employee.getDepartament() != department) {
                continue;
            }
            if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зп" + " " + maxEmployee);

    }

    public static void sumExpensesDEep(int department) {
        float sum = 0f;
        for (Employee element : OldMain.empl) {
            if (element.getDepartament() == department) {
                sum = sum + element.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату сотрудников департамента: " + department + " - " + sum);
    }

    public static void listEmployees(int department) {
        System.out.println("Департамент: " + department);
        for (Employee t : OldMain.empl) {
            if (t.getDepartament() == department) {
                System.out.println("ID: " + t.getId() + ", ФИО сотрудника: " + t.getName() + ",Зарплата: " + t.getSalary());
            }
        }
    }

    public static double averageSalaryEmployee(int department) {
        double sum = 0.0;
        int quantity = 0;
        for (Employee employee : OldMain.empl) {
            if (employee.getDepartament() == department) {
                continue;
            }
            sum += employee.getSalary();
            quantity++;
        }
        return sum / quantity;
    }

    public static void raiseSalary(int Procent, int department) {
        System.out.println("Зарплата департамента " + department + " проиндексирована: ");
        for (Employee t : OldMain.empl) {
            if (t.getDepartament() != department) {
                continue;
            }
            t.setSalary(t.getSalary() + (t.getSalary() * Procent) / 100);
            System.out.println(t); }

    }
    public static void printAllWithSalaryLess(double salary){
        for (Employee employee : OldMain.empl) {
            if(employee.getSalary()<salary){
                System.out.println("Зарплата меньше "+ salary+" у "+employee);
            }

        }
    }
    public static void printAllWithSalaryMore(double salary){
        for (Employee employee : OldMain.empl) {
            if(employee.getSalary()>=salary){
                System.out.println("Зарплата больше или равно "+ salary+" у "+employee);
            }

        }
    }
}


