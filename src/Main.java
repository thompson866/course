import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Main {
    private static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        System.out.println("Базовая сложность");
        doEmployees(); // пока сюда не передвшь будет null, два дня с этим ебался
        printEmployeeInfo();
        System.out.println("сумма зарплат " + totalSalary());
        System.out.println("минимальная зарплата у " + minSalary());
        System.out.println("максимальная зарплата у " + maxSalary());
        System.out.println("средняя зарплата " + averageSalary());
        printName();

        System.out.println("Повышенная сложность:");

        indexSalary(15);
        printEmployeeInfo();


        System.out.println("минимальная зарплата в отделе " + minSalaryDep(3));
        System.out.println("максимальная зарплата в отделе " + maxSalaryDep(1));
        System.out.println("сумма зарплат отдела " + totalSalaryDep(3));
        System.out.println("средняя зарплата по отделу " + averageSalaryDep(3));

        indexSalaryDep(10, 5);

        printEnotherDepartament(5);

        printMinEmloyeeSalary(70000);
        printMaxEmloyeeSalary(60000);


    }
    /*private static String [] NAMES = {"Иван","Петр","Андрей","Алексей"};
    private static String [] FirstNAMES = {"Иванов","Петров","Андреев","Алексеев"};
    private static String [] SecondNAMES = {"Иванович","Петрович","Андреевич","Алексеевич"};
    private static Employee generate(){
        Random random = new Random();
        String name = NAMES[Random.nextInt(NAMES.length)]+ " "+FirstNAMES[Random.nextInt(FirstNAMES.length)]+ " "+ SecondNAMES[Random.nextInt(SecondNAMES.length)];
    } return new Employee(name, RANDOM.nextInt(), random.nextInt());*/

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

    private static void indexSalary(int percent) {
        double XPersent = 1 + percent / 100D;
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * XPersent));
        }
    }

    private static Employee minSalaryDep(int departament) {
        int min = Integer.MAX_VALUE;
        Employee employee = null; //??
        for (Employee employee1 : employees) {
            if (employee1.getSalary() < min && employee1.getDepartament() == departament) {
                min = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    } //не получилось  не null

    private static Employee maxSalaryDep(int departament) {
        int max = Integer.MIN_VALUE;
        Employee employee = null; //??
        for (Employee employee1 : employees) {
            if (employee1.getSalary() > max && employee1.getDepartament() == departament) {
                max = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }

    // не получилось не null
    private static int totalSalaryDep(int departament) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartament() == departament) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static double averageSalaryDep(int departament) {
        int count = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartament() == departament) {
                sum += employee.getSalary();
                count++;
            }
        }
        if (count != 0) {
            return sum / (double) count;
        } else {
            return 0;
        }

    }

    private static void indexSalaryDep(int percent, int departament) {
        double coeff = 1 + percent / 100D;
        for (Employee employee : employees) {
            if (employee.getDepartament() == departament) {
                employee.setSalary((int) (employee.getSalary() * coeff));
            }
        }
    }

    private static void printEnotherDepartament(int departament) {
        System.out.println("сотрудники отдела " + departament);
        for (Employee employee : employees) {
            if (employee.getDepartament() == departament) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }

    }

    private static void printMinEmloyeeSalary(int salary) {
        System.out.println("сотрудники отдела c меньшей зарплатой " + salary);
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    private static void printMaxEmloyeeSalary(int salary) {
        System.out.println("сотрудники отдела c большей зарплатой " + salary);
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }
}











