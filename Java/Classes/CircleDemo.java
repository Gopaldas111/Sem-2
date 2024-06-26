import java.util.Scanner;
public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Area of Circle");
        System.out.print("Enter Radius of Circle: ");
        Circle r = new Circle();
        r.rad=sc.nextDouble();
        double a=r.circle();
        System.out.print("Area of Circle = "+a);
        sc.close();
    } 
}
