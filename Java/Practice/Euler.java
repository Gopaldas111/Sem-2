import java.util.Scanner;
public class Euler {
    public static void main(String[] args) {
        System.out.println("Euler's Method");
        System.out.println("Function: dy/dx=x-(y*y)");
        System.out.println("Enter following values");
        Scanner sc=new Scanner(System.in);
        System.out.print("x0: ");
        double x=sc.nextDouble();
        System.out.print("y0: ");
        double y=sc.nextDouble();
        System.out.print("h: ");
        double h=sc.nextDouble();
        System.out.print("xn: ");
        double xn=sc.nextDouble();
        double m=(xn-x)/h;
        m=Math.round(m);
        for(int i=1;i<=m;i++){
            double a=x-(y*y);
            x+=h;
            y+=h*a;
        }
        System.out.println("Value of y("+xn+"): "+y);
        sc.close();
    }
}