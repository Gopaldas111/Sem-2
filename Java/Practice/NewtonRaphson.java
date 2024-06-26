import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
class NewtonRaphsonCalculations{
    int n;
    double x;
    Scanner sc=new Scanner(System.in);
    public void getInputn(){
        System.out.print("Solution should be correct up to how many decimal places? ");
        n=sc.nextInt();
    }
    public static double function(double x){
        //double value=Math.pow(x,3)-(4*x)-9;
        //double value=Math.cos(x)-(x*Math.pow(Math.E,x));
        double value=Math.pow(x,3)+x-1;
        //double value=Math.sin(x)-Math.pow(Math.E,(-x));
        return value;
    }
    public static double functiondiff(double x){
        //double valuediff=3*Math.pow(x,2)-4;
        //double valuediff=-Math.sin(x)-(x*Math.pow(Math.E,x))-Math.pow(Math.E,x);
        double valuediff=3*Math.pow(x,2)+1;
        //double valuediff=Math.cos(x)+Math.pow(Math.E,(-x));
        return valuediff;
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
    public double newtonraphson(){
        double[] arr=new double[15];
        arr[0]=0;
        int i=1;
        while(i<15){
            double fx=NewtonRaphsonCalculations.function(x);
            double fxdiff=NewtonRaphsonCalculations.functiondiff(x);
            if(n<=4){
                fx=roundOff(fx,4);
                fxdiff=roundOff(fxdiff,4);
            }
            else{
                fx=roundOff(fx,n);
                fxdiff=roundOff(fxdiff, n);
            }
            x=x-(fx/fxdiff);
            x=roundOff(x,4);
            arr[i]=x;
            i++;
        }
        for(i=1;i<15;i++){
            if(roundOff(arr[i],n)==roundOff(arr[i-1],n)){
                return arr[i];
            }
        }
        return arr[i-1];
    }
}
public class NewtonRaphson {
    public static void main(String[] args) {
        NewtonRaphsonCalculations eq=new NewtonRaphsonCalculations();
        System.out.println("Newton-Raphson Method");
        eq.getInputn();
        double ans=eq.newtonraphson();
        ans=eq.roundOff(ans,eq.getn());
        System.out.println("Solution: "+ans);           
    }
}
