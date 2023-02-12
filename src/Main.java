import java.util.Random;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        printEmployeeInfo();


    }

    private static Random doEmployees() {
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {

            employees[i] = new Employee("Сотрудник" + (i + 1), random.nextInt(1, 6), random.nextInt(50000, 100000));
        }return random;



    }


    private static void printEmployeeInfo(){
        for (Employee employee: employees) {
            System.out.println(employee);}
    }
}