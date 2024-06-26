import java.util.Scanner;
class GaussForwardCalculations extends Calculations{
    public static double valueofp(int n,double p){
        double ans=p;
        if(n==0){
            return 1.0;
        }
        else if(n==1){
            return ans;
        }
        else{
            int i=1,count=1;
            while(count<n){
                ans*=(p-i);
                if(i>0){
                    i=-i;
                }
                else{
                    i=Math.abs(i);
                    i++;
                }
                count++;
            }
            return ans;
        }
    }
    public static double interpolationAns(double[] arr2, int a, double p){
        int n=0;
        double ans=0;
        for(int k=0;k<a;k++){
            ans+=(arr2[k]*valueofp(n,p)/factorial(n));
            n++;
        }
        return ans;
    }
}
public class GaussForward {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Gauss's Forward Difference Method\n");
        System.out.print("Enter no. of entries: ");
        int a=sc.nextInt();
        double[][] arr=new double[a][a+1];
        System.out.println("\nEnter given values: ");
        for(int i=0;i<a;i++){
            System.out.print("x["+i+"]: ");
            arr[i][0] = sc.nextDouble();
            System.out.print("y["+i+"]: ");
            arr[i][1] = sc.nextDouble();
        }
        Calculations.table(arr,a);
        int i=0,k=0;
        System.out.print("\nEnter value of x for interpolation: ");
        double x=sc.nextDouble();
        double h=arr[1][0]-arr[0][0];
        double x0=0;
        for(i=0;i<a-1;i++){
            if(x>arr[i][0] && x<arr[i+1][0]){
                x0=arr[i][0];
                break;
            }
        }
        double[] arr2=new double[a];
        int count=0;
        for(int j=1;j<=a;j++){
            arr2[k]=arr[i][j];
            k++;
            count++;
            if(count==2){
                count=0;
                i--;
            }
        }
        double p=Calculations.calculatep(x,x0,h);
        double ans=GaussForwardCalculations.interpolationAns(arr2,a,p);
        System.out.println("\nInterpolated value at x: y("+x+")= "+ans);
        sc.close();
    }
}