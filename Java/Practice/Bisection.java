import java.util.Scanner;
class BisectionCalculations extends Calculations3{
    double mid;
    Scanner sc=new Scanner(System.in);
    public double bisectionMethod(){
        double[] arr=new double[15];
        arr[0]=0;
        double x;
        int i=1;
        while(i<15){
            mid=(a+b)/2;
            if(n<=4){
                mid=roundOff(mid,4);
                x=function(mid);
                x=roundOff(x,4);
            }
            else{
                mid=roundOff(mid,n);
                x=function(mid);
                x=roundOff(x,n);
            }
            arr[i]=mid;
            if(x<0){
                b=mid;
            }
            else{
                a=mid;
            }
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
public class Bisection {
    public static void main(String[] args) {
        BisectionCalculations eq=new BisectionCalculations();
        System.out.println("Bisection Method");
        System.out.println("Function: x^3-4x-9=0");
        // System.out.println("Function: cos(x)=x*e^x");
        // System.out.println("Function: x*log(10)x=1.2");
        // System.out.println("Function: x^3+x-1=0");
        // System.out.println("Function: xtan(x)+1=0");
        // System.out.println("Function: x^3-7x+3=0");
        // System.out.println("Function: e^x=x^3+cos(25x)");
        // System.out.println("Function: sin(x)=1/x");
        // System.out.println("Function: x=e^(-x)");
        eq.getInputAB();
        double ans=eq.bisectionMethod();
        ans=eq.roundOff(ans,eq.getn());
        System.out.println("Solution: "+ans);        
    }
}