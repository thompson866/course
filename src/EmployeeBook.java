import javax.naming.Name;

public class EmployeeBook {


    private static final int SIZE = 10;
    private static Employee[] employees = new Employee[10];

    public EmployeeBook() {
        this.employees = new Employee[SIZE];

    }

    public  void printEmployeeInfo() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int totalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null)
                sum += employee.getSalary();


        }
        return sum;
    }

    public  Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null; //??
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getSalary() < min) {
                min = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }

    public  Employee maxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employee = null; //??
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getSalary() > max) {
                max = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }


    public  double averageSalary() {
        return totalSalary() / (double) employees.length;
    }

    public  void printName() {
        for (Employee employee : employees) {
            if (employee != null)
                System.out.println(employee.getName());
        }

    }


    public  void indexSalary(int percent) {
        double XPersent = 1 + percent / 100D;
        for (Employee employee : employees) {
            if (employee != null)
                employee.setSalary((int) (employee.getSalary() * XPersent));
        }
    }

    public  Employee minSalaryDep(int departament) {
        int min = Integer.MAX_VALUE;
        Employee employee = null; //??
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getSalary() < min && employee1.getDepartament() == departament) {
                min = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }

    public  Employee maxSalaryDep(int departament) {
        int max = Integer.MIN_VALUE;
        Employee employee = null; //??
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getSalary() > max && employee1.getDepartament() == departament) {
                max = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }

    // не получилось не null
    public  int totalSalaryDep(int departament) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public  double averageSalaryDep(int departament) {
        int count = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
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

    public  void indexSalaryDep(int percent, int departament) {
        double coeff = 1 + percent / 100D;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                employee.setSalary((int) (employee.getSalary() * coeff));
            }
        }
        System.out.println("Зарплата после индексации на " + percent + " %, отдела " + departament);
    }

    public void printEnotherDepartament(int departament) {
        System.out.println("сотрудники отдела " + departament);
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }

    }

    public  void printMinEmloyeeSalary(int salary) {
        System.out.println("сотрудники отдела c меньшей зарплатой " + salary);
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public  void printMaxEmloyeeSalary(int salary) {
        System.out.println("сотрудники отдела c большей зарплатой " + salary);
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public  void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void deleteEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                employees[i] = null;
                break;
            }
        }

    }

    public  void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }
}

