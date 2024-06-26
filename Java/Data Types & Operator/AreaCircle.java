import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        System.out.println("Area of Circle: "+area);
        sc.close();
    }
}
