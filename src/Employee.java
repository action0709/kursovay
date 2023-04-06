public class Employee {
    private String name;
    private int departament;
    private float salary;
    private static int counter=1;
    private int id;
    private float sum = 0f;

        public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getDepartament() {
        return this.departament;
    }

    public float getSalary() {
        return this.salary;
    }

    public Employee(String name, int departament, float salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        this.id = counter;
        counter++;
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


}

