public class EmployeeBook {
    private String name;
    private int departament;
    private float salary;
    private static int counter = 1;
    private int id;
    private float sum = 0f;

    private final Employee employees[] = new Employee[10];

    public EmployeeBook() {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 15000);
        employees[1] = new Employee("Сидоров Петр Сергеевич", 3, 40500f);
        employees[2] = new Employee("Сергеев Антон Алексеевич", 3, 70200f);
        employees[3] = new Employee("Алексеев Семен Сергеевич", 3, 65200f);
        employees[4] = new Employee("Петров Алексей Иванович", 2, 45500f);
        employees[5] = new Employee("Петров Алексей Иванович", 2, 45500f);
        employees[6] = new Employee("Сидоров Петр Сергеевич", 3, 40500f);
        employees[7] = new Employee("Петров Алексей Иванович", 2, 45500f);
        employees[8] = new Employee("Петров Алексей Иванович", 2, 45500f);
//        employees[9]=new Employee("Антонов Сергей Сергеевич", 1, 67200f);
    }


    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + this.id + " Ф.И.О. сотрудника: " + this.name + ", Департамент: " + this.departament + ", Зарплата: " + this.salary;
    }

    public double sumExpenses() {
        double sum = 0;
        for (Employee element : employees) {
            sum = sum + element.getSalary();
        }
        return sum;
    }

    public void listEmployees() {
        for (Employee t : employees) {
            System.out.println(t);
        }
    }

    public void minWageEmployee() {
        float min = Float.MAX_VALUE;
        String Empl = null;
        for (Employee t : employees) {
            if (t.getSalary() < min) {
                min = t.getSalary();
                Empl = t.getName();
            }
        }
        System.out.println("Минимальная зарплата: " + min + ", у сотрудника " + Empl);
    }

    public void maxWageEmployee() {
        float max = Float.MIN_VALUE;
        String Empl = null;
        for (Employee t : employees) {
            if (t.getSalary() > max) {
                max = t.getSalary();
                Empl = t.getName();
            }
        }
        System.out.println("Максимальная зарплата: " + max + ", у сотрудника " + Empl);
    }

    public double averageSalaryEmployee() {
        return sumExpenses() / employees.length;
    }

    public void fioEmployee() {
        for (Employee t : employees) {
            System.out.println(t.getName());
        }
    }

    //________Повышенная сложность
    public void indexingSalary(int Procent) {
        for (Employee t : employees) {
            t.setSalary(t.getSalary() + (t.getSalary() * Procent) / 100);
            System.out.println(t);
        }
    }

    public void findMin(int department) {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartament() != department) {
                continue;
            }
            if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зп" + " " + minEmployee);

    }

    public void findMax(int department) {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartament() != department) {
                continue;
            }
            if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зп" + " " + maxEmployee);

    }

    public void sumExpensesDEep(int department) {
        float sum = 0f;
        for (Employee element : employees) {
            if (element.getDepartament() == department) {
                sum = sum + element.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату сотрудников департамента: " + department + " - " + sum);
    }

    public void listEmployees(int department) {
        System.out.println("Департамент: " + department);
        for (Employee t : employees) {
            if(employees==null){continue;}
            if (t.getDepartament() == department) {
                System.out.println("ID: " + t.getId() + ", ФИО сотрудника: " + t.getName() + ",Зарплата: " + t.getSalary());
            }
        }
    }

    public double averageSalaryEmployee(int department) {
        double sum = 0.0;
        int quantity = 0;
        for (Employee employee : employees) {
            if (employee.getDepartament() == department) {
                continue;
            }
            sum += employee.getSalary();
            quantity++;
        }
        return sum / quantity;
    }

    public void raiseSalary(int Procent, int department) {
        System.out.println("Зарплата департамента " + department + " проиндексирована: ");
        for (Employee t : employees) {
            if (t.getDepartament() != department) {
                continue;
            }
            t.setSalary(t.getSalary() + (t.getSalary() * Procent) / 100);
            System.out.println(t);
        }

    }

    public void printAllWithSalaryLess(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println("Зарплата меньше " + salary + " у " + employee);
            }

        }
    }

    public void printAllWithSalaryMore(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println("Зарплата больше или равно " + salary + " у " + employee);
            }

        }
    }

    public void add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }

        }
    }

    public void remove(long id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    private Employee findByFullName(String fullName) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getName().equalsIgnoreCase(fullName)) {
                return employee;
            }
        }
        return null;
    }

    public void changeSalary(String fullName, double newSalary) {
        Employee employee = findByFullName(fullName);
        if (employee != null) {
            employee.setSalary((float) newSalary);
        }
    }

    public void changeDepartment(String fullName, int departament) {
        Employee employee = findByFullName(fullName);
        if (employee != null) {
            employee.setDepartament(departament);
        }
    }

    public void printGrouped() {
        for (int i = 1; i <= 5; i++) {

                listEmployees(i);
                    }

    }
}




