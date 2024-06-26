import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
class GaussSeidelCalculations extends Calculations2{}
public class GaussSeidel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GaussSeidelCalculations eq1=new GaussSeidelCalculations();
        GaussSeidelCalculations eq2=new GaussSeidelCalculations();
        GaussSeidelCalculations eq3=new GaussSeidelCalculations();
        System.out.println("Gauss-Seidel Method\n");
        System.out.println("Enter coefficients for x,y,z and constant");
        System.out.println("Equation 1: ");
        eq1.getInput();
        System.out.println("Equation 2: ");
        eq2.getInput();
        System.out.println("Equation 3: ");
        eq3.getInput();
        if(eq1.isDiagonallyDominant(eq2, eq3)==false){
            eq1.makeDiagonallyDominant(eq2, eq3);
        }
        System.out.println("Equations: ");
        eq1.displayEquation();
        eq2.displayEquation();
        eq3.displayEquation();
        double[] arrX=new double[15];
        double[] arrY=new double[15];
        double[] arrZ=new double[15];
        GaussSeidelCalculations.iterationOne();
        System.out.print("\nSolution should be correct up to how many decimal places? ");
        int n=sc.nextInt();
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
        for(int i=1;i<15;i++){
            eq1.formulaX();
            eq2.formulaY();
            eq3.formulaZ();
            double x=GaussSeidelCalculations.getX();
            double y=GaussSeidelCalculations.getY();
            double z=GaussSeidelCalculations.getZ();
            x=Double.parseDouble(df_obj.format(x));
            y=Double.parseDouble(df_obj.format(y));
            z=Double.parseDouble(df_obj.format(z));
            arrX[i]=x;
            arrY[i]=y;
            arrZ[i]=z;
        }
        int i;
        for(i=1;i<15;i++){
            if(arrX[i]==arrX[i-1] && arrY[i]==arrY[i-1] && arrZ[i]==arrZ[i-1]){
                break;
            }
        }
        System.out.println("\nSolution: x = "+arrX[i-1]+", y = "+arrY[i-1]+", z = "+arrZ[i-1]);
    }
}