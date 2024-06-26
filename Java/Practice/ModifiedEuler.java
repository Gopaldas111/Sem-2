import java.util.Scanner;
class MEFunction{
    public static double function(double x,double y){
        double a=Math.log(x+y);
        return a;
    }
}
public class ModifiedEuler {
    public static void main(String[] args) {
        System.out.println("Modified Euler's Method");
        System.out.println("Function: dy/dx=log(x+y)");
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
            double k1=h*MEFunction.function(x, y);
            x+=h;
            double k2=h*MEFunction.function(x, y+k1);
            y+=(k1+k2)/2;
        }
        System.out.println("Value of y("+xn+"): "+y);
        sc.close();
    }
}
