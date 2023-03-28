public class EmployeeService {

    public static void sumExpenses(Employee[] arr) {
        float sum = 0f;
        for (Employee element : arr) {
            sum = sum + element.getSalary();
        }
               System.out.println("Сумма затрат на зарплату сотрудников: " + sum);
    }

    public static void listEmployees(Employee[] arr) {
        for (Employee t : arr) {
            System.out.println(t);
        }
    }
    public static void  minWageEmployee (Employee[] arr){
        float min = Float.MAX_VALUE;
        String Empl = null;
        for (Employee t : arr) {
            if(t.getSalary()<min){
                min = t.getSalary();
                Empl = t.getName();
            }}
            System.out.println("Минимальная зарплата: " + min+", у сотрудника "+Empl);
        }
        public static void   maxWageEmployee (Employee[] arr){
        float max = Float.MIN_VALUE;
        String Empl = null;
        for (Employee t : arr) {
            if(t.getSalary()>max){
               max = t.getSalary();
                Empl = t.getName();
            }}
            System.out.println("Максимальная зарплата: " + max+", у сотрудника "+Empl);
        }
    public static void   averageSalaryEmployee (Employee[] arr){
        float average = 0f;
        float sum = 0f;
                int i = 0;
             for (Employee t : arr) {
                   sum = (sum+ t.getSalary());
                 i = i + 1;
            }
        average = sum / i;
        System.out.println("Среднее значение зарплат: " + average);
        }

    public static void   fioEmployee (Employee[] arr){
        for (Employee t : arr) {
            System.out.println(t.getName());
        }
    }
    //________Повышенная сложность
    public static void  indexingSalary (Employee[] arr,int Procent){
        for (Employee t : arr) {
            t.setSalary(t.getSalary()+(t.getSalary()*Procent)/100);
            System.out.println(t);
        }
           }
    public static void  minSalaryDepart (Employee [] arr,int number ){
       while ()
    }
}


