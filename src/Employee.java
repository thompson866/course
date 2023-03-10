public class Employee {
private String name;
private int departament;
private int salary;
private int id;
private static int countId = 1;

    public Employee(String name, int departament, int salary) {
        this.id = countId++;
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){

        return  name + departament+salary+id;
    }
}
