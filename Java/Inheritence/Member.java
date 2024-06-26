import java.util.Scanner;
class Member{
    String name;
    int age;
    int phone;
    String address;
    int salary;
    Scanner sc=new Scanner(System.in);
    public Member(){
        System.out.print("Name: ");
        name=sc.nextLine();
        System.out.print("Address: ");
        address=sc.nextLine();
        System.out.print("Age: ");
        age=sc.nextInt();
        System.out.print("Phone number: ");
        phone=sc.nextInt();
        System.out.print("Salary: ");
        salary=sc.nextInt();
    }
    public int printSalary(){
        return this.salary;
    }
    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Address: "+this.address);
        System.out.println("Age: "+this.age);
        System.out.println("Phone number: "+this.phone);
    }
}

class Employee extends Member{
    String specialization;
    public Employee(){
        System.out.print("Specialization: ");
        specialization=sc.next();
    }
    public void printEmployeeDetails(){
        super.print();
        System.out.println("Specialization: "+this.specialization);
    }
}

class Manager extends Member{
    String department;
    public Manager(){
        System.out.print("Department: ");
        department=sc.next();
    }
    public void printManagerDetails(){
        super.print();
        System.out.println("Department: "+this.department);
    }
}
