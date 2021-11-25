import java.util.*;

public class Employe {
    int employee_id;
    String empFirstName;
    String empLastName;
    int age;
    int salary;
    String address;
    List<String> skillList;

    public Employe(int emplyid, String eName, String eLastName, int age, int salary, String address,List<String> skillList) {
        this.employee_id = emplyid;
        this.empFirstName = eName;
        this.empLastName = eLastName;
        this.age = age;
        this.salary = salary;
        this.address = address;
        this.skillList = skillList;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEmp = scanner.nextInt();
        List<Employe> employeeList = new ArrayList<>(totalEmp);
        while(totalEmp>0){
            System.out.println("Enter Employee's id");
            int eid = scanner.nextInt();
            System.out.println("Enter Employee's First Name");
            String eFName = scanner.next();
            System.out.println("Enter Employee's Last Name");
            String eLName = scanner.next();
            System.out.println("Enter Employee's Age");
            int age = scanner.nextInt();
            System.out.println("Enter Employee's Salary");
            int salary = scanner.nextInt();
            System.out.println("Enter Employee's Address(Just State)");
            String address = scanner.next();
            System.out.println("Total Number of Skill");
            int totalSkills = scanner.nextInt();
            System.out.println("Enter series of skills");
            List<String> skillList = new ArrayList<>(totalSkills);
            while(totalSkills>0){
                String skill = scanner.next();
                skillList.add(skill);
                totalSkills--;
            }
            employeeList.add(new Employe(eid,eFName,eLName,age,salary,address,skillList));
            totalEmp--;
        }
        /**
         * filtering Employee List
         */
        System.out.println("Filter employee based on Skills");
        String filterSkill = scanner.next();
        List<Employe> filteredList = new ArrayList<>();
        employeeList.forEach(employe -> {
            employe.skillList.forEach(str->{
                if(Objects.equals(str, filterSkill)){
                    filteredList.add(employe);
                }
            });
        });
        System.out.println("Filtered employee's based on Skills");
        filteredList.forEach(employe -> {
            System.out.println(employe.getEmpFirstName()+" "+ employe.getEmpLastName());
        });
        /**
         * Converting Employee List to Map Based on Id
         */
        HashMap<Integer,Employe> employeMap = new HashMap<>();
        employeeList.forEach(emp->{
            employeMap.put(emp.getEmployee_id(),emp);
        });
    }

}
