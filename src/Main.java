import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Main {
    private static Employee[] employees = new Employee[10];



    public static void main(String[] args) {
        doEmployees(); // пока сюда не передвшь будет null, два дня с этим ебался
        printEmployeeInfo();
        System.out.println("сумма зарплат " + totalSalary());
        System.out.println("минимальная зарплата у " + minSalary());
        System.out.println("максимальная зарплата у " + maxSalary());
        System.out.println("средняя зарплата " + averageSalary());
        printName();


    }

    private static Random doEmployees() {
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {

            employees[i] = new Employee("Иванов " + (i + 1), random.nextInt(1, 6), random.nextInt(50000, 100000));
        }
        return random;
    }


    private static void printEmployeeInfo() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int totalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();


        }
        return sum;
    }

    private static Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null; //??
        for (Employee employee1 : employees) {
            if (employee1.getSalary() < min) {
                min = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }

    private static Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employee = null; //??
        for (Employee employee1 : employees) {
            if (employee1.getSalary() > max) {
                max = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }

    private static double averageSalary() {
        return totalSalary() / (double) employees.length;
    }

    private static void printName() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

    }



}


