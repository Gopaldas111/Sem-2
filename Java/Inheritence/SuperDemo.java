class ParentClass {
    int variable=10;
    public ParentClass(){
        System.out.println("Constructor of Parent Class");
    }
    public void display(){
        System.out.println("Method of Parent Class");
    }
}
class ChildClass extends ParentClass{
    int variable=20;
    public ChildClass(){
        super();
        System.out.println("Constructor of Child Class");
    }
    public void display(){
        super.display();
        System.out.println("Method of Child Class");
        System.out.println("Parent Variable: "+super.variable);
        System.out.println("Child Variable: "+variable);
    }
}
public class SuperDemo{
    public static void main(String[] args) {
        System.out.println("Super Keyword Demo");
        ChildClass c=new ChildClass();
        c.display();
    }
}
