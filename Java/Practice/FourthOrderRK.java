import java.util.Scanner;
class FourthRK{
    public static double function(double x,double y){
        double a=3*Math.pow(Math.E,x)+2*y;
        return a;
    }
}
public class FourthOrderRK {
    public static void main(String[] args) {
        System.out.println("Fourth Order RK Method");
        System.out.println("Function: dy/dx=3e^x+2y");
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
            double k1=h*FourthRK.function(x, y);
            double k2=h*FourthRK.function(x+(h/2), y+(k1/2));
            double k3=h*FourthRK.function(x+(h/2), y+(k2/2));
            x+=h;
            double k4=h*FourthRK.function(x, y+k3);
            y+=(k1+(2*k2)+(2*k3)+k4)/6;
        }
        System.out.println("Value of y("+xn+"): "+y);
        sc.close();
    }
}