    public class Main {
                  public static void main(String[] args) {
                      EmployeeBook employeebook = new EmployeeBook();
                      employeebook.add(new Employee("Иванов Иван Федорович", 1, 40000));//4a (сложный уровень)
                      employeebook.add(new Employee("Сидоров Петр Сергеевич", 3, 40500f));
                      employeebook.add(new Employee("Сергеев Антон Алексеевич", 3, 70200f));
                      employeebook.add(new Employee("Алексеев Семен Сергеевич", 3, 65200f));
                      employeebook.add(new Employee("Петров Алексей Иванович", 2, 45500f));
                      employeebook.add(new Employee("Петров Алексей Иванович", 2, 45500f));
                      employeebook.add(new Employee("Сидоров Петр Сергеевич", 3, 40500f));
                      employeebook.add(new Employee("Петров Алексей Иванович", 2, 45500f));
                      employeebook.add(new Employee("Петров Алексей Иванович", 2, 45500f));
                      employeebook.add(new Employee("Антонов Сергей Сергеевич", 1, 67200f));
                      employeebook.listEmployees();
                      employeebook.remove(1);
                      employeebook.changeSalary("алексеев семен сергеевич",200000);
                      employeebook.changeDepartment("Сидоров ПЕТР СЕРГЕЕВИЧ", 5);
                      employeebook.add(new Employee("Мамонтов Петр Иванович",1,50000));
                      employeebook.listEmployees();
                      employeebook.printGrouped();

        }
    }
