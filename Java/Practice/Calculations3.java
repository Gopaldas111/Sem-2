import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Calculations3 {
    double a;
    double b;
    int n;
    double x;
    Scanner sc=new Scanner(System.in);
    public void getInputAB(){
        System.out.println("Enter values of a and b for which f(a)*f(b)<0");
        System.out.print("a: ");
        a=sc.nextDouble();
        System.out.print("b: ");
        b=sc.nextDouble();
        System.out.print("Solution should be correct up to how many decimal places? ");
        n=sc.nextInt();
        if(function(a)*function(b)>=0){
            System.out.println("Incorrect assumption for a and b");
            System.exit(0);
        }
        if(function(a)<0){
            double temp=a;
            a=b;
            b=temp;
        }
    }
    public static double function(double x){
        double value=Math.pow(x,3)-(4*x)-9;
        // double value=Math.cos(x)-(x*Math.pow(Math.E,x));
        // double value=x*Math.log10(x)-1.2;
        // double value=Math.pow(x,3)+x-1;
        // double value=x*Math.tan(x)+1;
        // double value=Math.pow(x,3)-(7*x)+3;
        // double value=Math.pow(Math.E,x)-Math.pow(x,3)-Math.cos(25*x);
        // double value=Math.sin(x)-(1/x);
        // double value=x-Math.pow(Math.E,(-x));
        return value;
    }
    public int getn(){
        return n;
    }
    public double roundOff(double x,int n){
        DecimalFormat df_obj;
        if(n==2){
            df_obj = new DecimalFormat("#.##");
        }
        else if(n==3){
            df_obj = new DecimalFormat("#.###");
        }
        else if(n==5){
            df_obj = new DecimalFormat("#.#####");
        }
        else if(n==6){
            df_obj = new DecimalFormat("#.######");
        }
        else{
            df_obj = new DecimalFormat("#.####");
        }
        df_obj.setRoundingMode(RoundingMode.FLOOR);
        x=Double.parseDouble(df_obj.format(x));
        return x;
    }
}
