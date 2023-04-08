import java.util.Random;


import static java.util.stream.DoubleStream.generate;


public class MainForEmployee {
    private static  Employee[] employees = new Employee[10];
    private static  String[] NAMES = {"Иванов", "Петров", "Андреев", "Алексеев"};
    private static final String[] FIRSTNAMES = {"Иван", "Петр", "Андрей", "Алексей"};
    private static final String[] SECONDNAMES = {"Иванович", "Петрович", "Андреевич", "Алексеевич"};

    private static final Random RANDOM = new Random();


    public static void main(String[] args) {


        System.out.println("Высокая сложность");
        EmployeeBook employeeBook = new EmployeeBook();
        for (int i = 0; i < 8; i++) {
            employeeBook.addEmployee(generate());

        }

        employeeBook.deleteEmployee("Иванов Иван Иванович");
        employeeBook.printEmployeeInfo();
        employeeBook.changeSalary(employeeBook.minSalaryDep(2).getName(), 50000);
        employeeBook.changeDepartment(employeeBook.minSalaryDep(3).getName(),4);//косяк

        employeeBook.printEmployeeInfo();
        employeeBook.printEmployeeDep();



        //doEmployees();

        System.out.println("сумма зарплат " + employeeBook.totalSalary());
        System.out.println("минимальная зарплата у " + employeeBook.minSalary());
        System.out.println("максимальная зарплата у " + employeeBook.maxSalary());
        System.out.println("средняя зарплата " + employeeBook.averageSalary());
        employeeBook.printName();

        System.out.println("Повышенная сложность:");

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




        private static Employee generate() {
            String name = NAMES[RANDOM.nextInt(NAMES.length)] + " " +
                    FIRSTNAMES[RANDOM.nextInt(FIRSTNAMES.length)] + " " +
                    SECONDNAMES[RANDOM.nextInt(SECONDNAMES.length)];
            return new Employee(name,
                    RANDOM.nextInt(1,5),
                    RANDOM.nextInt(1, 100000));
        }



    }

