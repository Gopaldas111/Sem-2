import java.util.Scanner;
public class ComplexDemo {
    public static void main(String[] args) {
        System.out.println("Addition of 2 Complex Numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Complex Number 1: ");
        System.out.print("Enter Real Part: ");
        int r=sc.nextInt();
        System.out.print("Enter Imaginary Part: ");
        int i=sc.nextInt();
        Complex c1=new Complex(r,i);
        Complex c2=new Complex();
        System.out.println("Complex Number 1(Input from User): "+r+"+"+i+"i");
        System.out.println("Complex Number 2(Default Constructor): "+c2.real+"+"+c2.imaginary+"i");
        Complex c3=c2.addComplex(c1);
        System.out.print("Addition of 2 Complex Numbers: "+c3.real+"+"+c3.imaginary+"i");
        sc.close();
    }
}
