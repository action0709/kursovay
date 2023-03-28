    public class Main {
        public static void main(String[] args) {

            Employee[] empl = new Employee[10];
            empl[0]=new Employee("Иванов Иван Петрович",2,50600f);
            empl[1]=new Employee("Сидоров Петр Сергеевич", 3, 40500f);
            empl[2]=new Employee("Сергеев Антон Алексеевич", 3, 70200f);
            empl[3]=new Employee("Алексеев Семен Сергеевич", 3, 65200f);
            empl[4]=new Employee("Иванов Иван Петрович", 1, 50500f);
            empl[5]=new Employee("Петров Алексей Иванович", 2, 45500f);
            empl[6]=new Employee("Сидоров Петр Сергеевич", 3, 40500f);
            empl[7]=new Employee("Сергеев Антон Алексеевич", 3, 70200f);
            empl[8]=new Employee("Алексеев Семен Сергеевич", 3, 65200f);
            empl[9]=new Employee("Антонов Сергей Сергеевич", 1, 67200f);

            EmployeeService.listEmployees(empl);//задание 1
            EmployeeService.sumExpenses(empl);//задание 2
            EmployeeService.minWageEmployee(empl);//задание 3
            EmployeeService.maxWageEmployee(empl);//задание 4
            EmployeeService.averageSalaryEmployee(empl);//задание 5
            EmployeeService.fioEmployee(empl);//задание 6
            //______Повышенная сложность
            EmployeeService.indexingSalary(empl,20);//задание 1
        }
    }
