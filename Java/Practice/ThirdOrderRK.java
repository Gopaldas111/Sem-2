import java.util.Scanner;
class ThirdRK{
    public static double function(double x,double y){
        double a=(x-y)/(x*y);
        return a;
    }
}
public class ThirdOrderRK {
    public static void main(String[] args) {
        System.out.println("Third Order RK Method");
        System.out.println("Function: dy/dx=(x-y)/xy");
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
            double k1=h*ThirdRK.function(x, y);
            double k2=h*ThirdRK.function(x+(h/2), y+(k1/2));
            x+=h;
            double k3=h*ThirdRK.function(x, y-k1+(2*k2));
            y+=(k1+(4*k2)+k3)/6;
        }
        System.out.println("Value of y("+xn+"): "+y);
        sc.close();
    }
}

