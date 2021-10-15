package Scenarios;

import java.util.*;

/**
 * Sort the employees based on Name(ASC or DSC) - Using JAVA8
 *
 * @since 10/15/2021
 */
public class Employee {
    String name;
    int id;
    int age;

    public Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Total Number of Employee's");
        int total = scan.nextInt();
        List<Employee> employeeArrayList = new ArrayList<>();
        while(total>0){
            System.out.println("Enter Employee Name :");
            String name = scan.next();
            System.out.println("Enter Employee ID :");
            int id = scan.nextInt();
            System.out.println("Enter Employee age :");
            int age = scan.nextInt();
            Employee eboj = new Employee(name,id,age);
            employeeArrayList.add(eboj);
            total--;
        }
        System.out.println("Want the List In ASC or DSC ? \n Press \n 1.ASC \n 2.DSC");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                sortByAsc(employeeArrayList);
                break;
            case 2:
                sortByDsc(employeeArrayList);
                break;
            default:
                System.out.println("Enter Valid Choice");
        }
    }

    private static void sortByDsc(List<Employee> employeeArrayList) {
        employeeArrayList.sort(Comparator.comparing(
                Employee::getName, Comparator.reverseOrder()));
        for (Employee eobj : employeeArrayList) {
            System.out.println("NAME:" + eobj.name + " AGE:" + eobj.age + " ID:" + eobj.id);
        }
    }

    private static void sortByAsc(List<Employee> employeeArrayList) {
        employeeArrayList.sort(Comparator.comparing(Employee::getName));
        employeeArrayList.stream().forEach(eobj->System.out.println("NAME:"+eobj.name+" AGE:"+eobj.age+" ID:"+eobj.id));
    }

}
