interface A{
    int constant_A=0;
    public void displayA();
}
interface A1 extends A{
    int constant_A1=1;
    public void displayA1();
}
interface A2 extends A{
    int constant_A2=2;
    public void displayA2();
}
interface A12 extends A1,A2{
    int constant_A12=3;
    public void displayA12();
}
class B implements A12{
    public void displayA(){
        System.out.println("Interface A Constant: "+constant_A);
    }
    public void displayA1(){
        System.out.println("Interface A1 Constant: "+constant_A1);
    }
    public void displayA2(){
        System.out.println("Interface A2 Constant: "+constant_A2);
    }
    public void displayA12(){
        System.out.println("Interface A12 Constant: "+constant_A12);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        B b=new B();
        b.displayA();
        b.displayA1();
        b.displayA2();
        b.displayA12();
    }
}