    public class Main {
                  public static void main(String[] args) {
                      EmployeeBook employeebook = new EmployeeBook();
                      employeebook.add(new Employee("Иванов Иван Федорович", 1, 40000));//4a (сложный уровень)
                      employeebook.listEmployees();
                      employeebook.remove(1);
                      employeebook.changeSalary("алексеев семен сергеевич",200000);
                      employeebook.changeDepartment("Сидоров ПЕТР СЕРГЕЕВИЧ", 5);
                      employeebook.add(new Employee("Мамонтов Петр Иванович",1,50000));
                      employeebook.listEmployees();
                      employeebook.printGrouped();

        }
    }
