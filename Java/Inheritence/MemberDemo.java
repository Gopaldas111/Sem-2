public class MemberDemo {
    public static void main(String[] args) {
        System.out.println("Enter Employee details as follows: ");
        Employee e=new Employee();
        System.out.println("\nEnter Manager details as follows: ");
        Manager m=new Manager();
        System.out.println("\nEmployee Details");
        e.printEmployeeDetails();
        System.out.println("Salary: "+e.printSalary());
        System.out.println("\nManager Details");
        m.printManagerDetails();
        System.out.println("Salary: "+m.printSalary());
    }
}