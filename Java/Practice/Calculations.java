public class Calculations {
    public static double calculatep(double x,double x0,double h){
        double p=(x-x0)/h;
        return p;
    }
    public static void table(double[][] arr,int a){
        for(int j=2;j<=a;j++){
            for(int i=0;i<(a-j+1);i++){
                arr[i][j]=arr[i+1][j-1]-arr[i][j-1];
            }
        }
        display(arr,a);
    }
    public static void display(double[][] arr,int a){
        System.out.println("\nInterpolation Table: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= a - i; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
