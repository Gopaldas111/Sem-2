import java.util.Scanner;
class RegulaFalsiCalculations extends Calculations3{
    double xi;
    double fx;
    Scanner sc=new Scanner(System.in);

    public double regulaFalsi(){
        double[] arr=new double[15];
        arr[0]=0;
        int i=1;
        while(i<15){
            double fa=RegulaFalsiCalculations.function(a);
            double fb=RegulaFalsiCalculations.function(b);
            xi=((a*fb)-(b*fa))/(fb-fa);
            if(n<=4){
                xi=roundOff(xi,4);
                fx=function(xi);
                fx=roundOff(fx,4);
            }
            else{
                xi=roundOff(xi,n);
                xi=function(xi);
                fx=roundOff(fx,n);
            }
            arr[i]=xi;
            if(fx<0){
                b=xi;
                fb=fx;
            }
            else{
                a=xi;
                fa=fx;
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
public class RegulaFalsi {
    public static void main(String[] args) {
        RegulaFalsiCalculations eq=new RegulaFalsiCalculations();
        System.out.println("Regula-Falsi Method");
        System.out.println("Function: e^x=x^3+cos(25x)");
        eq.getInputAB();
        double ans=eq.regulaFalsi();
        ans=eq.roundOff(ans,eq.getn());
        System.out.println("Solution: "+ans);        
    }
}