import java.util.*;
import java.util.stream.Collectors;

public class Testclass {

    public static List<Employee> getEmployeeList() {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(10, 56, 20010);//5   yes  3
        Employee e2 = new Employee(80, 46, 200080);//2  no
        Employee e3 = new Employee(50, 46, 20050);//3  yes  1
        Employee e4 = new Employee(90, 36, 200090);//1  no
        Employee e5 = new Employee(30, 76, 20030);//4  yes  2

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        return list;
    }

}


class Employee{
    int id;
    int age;
    int salary;
    public Employee(int id, int age, int salary) {
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

}
