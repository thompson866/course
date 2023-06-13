import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();
   // private static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
//        System.out.println("Базовая сложность");
//       //doEmployees();
//        EmployeeBook.printEmployeeInfo();
//        System.out.println("сумма зарплат " + EmployeeBook.totalSalary());
//        System.out.println("минимальная зарплата у " + EmployeeBook.minSalary());
//        System.out.println("максимальная зарплата у " + EmployeeBook.maxSalary());
//        System.out.println("средняя зарплата " + EmployeeBook.averageSalary());
//        EmployeeBook.printName();
//
//        System.out.println("Повышенная сложность:");
//
//        EmployeeBook.indexSalary(15);
//        EmployeeBook.printEmployeeInfo();
//
//
//        System.out.println("минимальная зарплата в отделе " + EmployeeBook.minSalaryDep(3));
//        System.out.println("максимальная зарплата в отделе " + EmployeeBook.maxSalaryDep(1));
//        System.out.println("сумма зарплат отдела " + EmployeeBook.totalSalaryDep(3));
//        System.out.println("средняя зарплата по отделу " + EmployeeBook.averageSalaryDep(3));
//
//        EmployeeBook.indexSalaryDep(10, 3);
//        EmployeeBook.printEmployeeInfo();
//
//
//        EmployeeBook.printEnotherDepartament(5);
//
//        EmployeeBook.printMinEmloyeeSalary(70000);
//        EmployeeBook.printMaxEmloyeeSalary(60000);


        System.out.println("Высокая сложность");
        EmployeeBook employeeBook = new EmployeeBook();
        for (int i = 0; i < 10; i++) {
            employeeBook.addEmployee(generate());
        }
        employeeBook.deleteEmployee(4);
        employeeBook.deleteEmployee("");



        //doEmployees();
        employeeBook.printEmployeeInfo();
        System.out.println("сумма зарплат " + employeeBook.totalSalary());
        System.out.println("минимальная зарплата у " + employeeBook.minSalary());
        System.out.println("максимальная зарплата у " + employeeBook.maxSalary());
        System.out.println("средняя зарплата " + employeeBook.averageSalary());
        employeeBook.printName();

        System.out.println("Повышенная сложность:");

        employeeBook.deleteEmployee(4);
        employeeBook.deleteEmployee("");

        employeeBook.indexSalary(15);
        employeeBook.printEmployeeInfo();


        System.out.println("минимальная зарплата в отделе " + employeeBook.minSalaryDep(1));
        System.out.println("максимальная зарплата в отделе " + employeeBook.maxSalaryDep(4));
        System.out.println("сумма зарплат отдела " + employeeBook.totalSalaryDep(3));
        System.out.println("средняя зарплата по отделу " + employeeBook.averageSalaryDep(3));

        employeeBook.indexSalaryDep(10, 3);
        employeeBook.printEmployeeInfo();


        employeeBook.printEnotherDepartament(5);

        employeeBook.printMinEmloyeeSalary(70000);
        employeeBook.printMaxEmloyeeSalary(60000);


    }


//    private static Employee generate(){
//        Random random = new Random();
//        String name = NAMES[Random.nextInt(NAMES.length)]+ " "+FirstNAMES[Random.nextInt(FirstNAMES.length)]+ " "+ SecondNAMES[Random.nextInt(SecondNAMES.length)];
//    } return new Employee(name, RANDOM.nextInt(), random.nextInt());
//
//    private static Random doEmployees() {
//        Random random = new Random();
//        for (int i = 0; i < employees.length; i++) {
//
//            employees[i] = new Employee("Иванов " + (i + 1), random.nextInt(1, 6), random.nextInt(50000, 100000));
//        }
//        return random;
//    }
//
//    private static void printEmployeeInfo() {
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//    }
//
//    private static int totalSalary() {
//        int sum = 0;
//        for (Employee employee : employees) {
//            sum += employee.getSalary();
//
//
//        }
//        return sum;
//    }
//
//    private static Employee minSalary() {
//        int min = Integer.MAX_VALUE;
//        Employee employee = null; //??
//        for (Employee employee1 : employees) {
//            if (employee1.getSalary() < min) {
//                min = employee1.getSalary();
//                employee = employee1;
//            }
//        }
//        return employee;
//    }
//
//    private static Employee maxSalary() {
//        int max = Integer.MIN_VALUE;
//        Employee employee = null; //??
//        for (Employee employee1 : employees) {
//            if (employee1.getSalary() > max) {
//                max = employee1.getSalary();
//                employee = employee1;
//            }
//        }
//        return employee;
//    }
//
//    private static double averageSalary() {
//        return totalSalary() / (double) employees.length;
//    }
//
//    private static void printName() {
//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//        }
//
//    }
//
//    private static void indexSalary(int percent) {
//        double XPersent = 1 + percent / 100D;
//        for (Employee employee : employees) {
//            employee.setSalary((int) (employee.getSalary() * XPersent));
//        }
//    }
//
//    private static Employee minSalaryDep(int departament) {
//        int min = Integer.MAX_VALUE;
//        Employee employee = null; //??
//        for (Employee employee1 : employees) {
//            if (employee1.getSalary() < min && employee1.getDepartament() == departament) {
//                min = employee1.getSalary();
//                employee = employee1;
//            }
//        }
//        return employee;
//    }
//
//    private static Employee maxSalaryDep(int departament) {
//        int max = Integer.MIN_VALUE;
//        Employee employee = null; //??
//        for (Employee employee1 : employees) {
//            if (employee1.getSalary() > max && employee1.getDepartament() == departament) {
//                max = employee1.getSalary();
//                employee = employee1;
//            }
//        }
//        return employee;
//    }
//
//    // не получилось не null
//    private static int totalSalaryDep(int departament) {
//        int sum = 0;
//        for (Employee employee : employees) {
//            if (employee.getDepartament() == departament) {
//                sum += employee.getSalary();
//            }
//        }
//        return sum;
//    }
//
//    private static double averageSalaryDep(int departament) {
//        int count = 0;
//        int sum = 0;
//        for (Employee employee : employees) {
//            if (employee.getDepartament() == departament) {
//                sum += employee.getSalary();
//                count++;
//            }
//        }
//        if (count != 0) {
//            return sum / (double) count;
//        } else {
//            return 0;
//        }
//
//    }
//
//    private static void indexSalaryDep(int percent, int departament) {
//        double coeff = 1 + percent / 100D;
//        for (Employee employee : employees) {
//            if (employee.getDepartament() == departament) {
//                employee.setSalary((int) (employee.getSalary() * coeff));
//            }
//        }
//        System.out.println("Зарплата после индексации на " + percent + " %, отдела " + departament);
//    }
//
//    private static void printEnotherDepartament(int departament) {
//        System.out.println("сотрудники отдела " + departament);
//        for (Employee employee : employees) {
//            if (employee.getDepartament() == departament) {
//                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
//            }
//        }
//
//    }
//
//    private static void printMinEmloyeeSalary(int salary) {
//        System.out.println("сотрудники отдела c меньшей зарплатой " + salary);
//        for (Employee employee : employees) {
//            if (employee.getSalary() < salary) {
//                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
//            }
//        }
//    }
//
//    private static void printMaxEmloyeeSalary(int salary) {
//        System.out.println("сотрудники отдела c большей зарплатой " + salary);
//        for (Employee employee : employees) {
//            if (employee.getSalary() >= salary) {
//                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
//            }
//        }
//    }

    private static String[] NAMES = {"Иванов", "Петров", "Андреев", "Алексеев"};
    private static String[] FirstNAMES = {"Иван", "Петр", "Андрей", "Алексей"};
    private static String[] SecondNAMES = {"Иванович", "Петрович", "Андреевич", "Алексеевич"};

    private static Employee generate() {
        String name = NAMES[RANDOM.nextInt(NAMES.length)] + " " +
                FirstNAMES[RANDOM.nextInt(FirstNAMES.length)] + " " +
                SecondNAMES[RANDOM.nextInt(SecondNAMES.length)];
        return new Employee(name, RANDOM.nextInt(1, 5),
                RANDOM.nextInt(1, 100000));
    }

}












