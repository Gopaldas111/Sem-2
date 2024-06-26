import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
class GaussJacobiCalculations extends Calculations2{
    double x0;
    double y0;
    double z0;
    Scanner sc=new Scanner(System.in);

    public void setInitialX(double[] arrX){
        x0=x;
        arrX[0]=x;
    }
    public void setInitialY(double[] arrY){
        y0=y;
        arrY[0]=y0;
    }
    public void setInitialZ(double[] arrZ){
        z0=z;
        arrZ[0]=z0;
    }

    public void setXYZ(double x, double y,double z){
        x0=x;
        y0=y;
        z0=z;
    }
}
public class GaussJacobi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Gauss-Jacobi Method\n");
        GaussJacobiCalculations eq1=new GaussJacobiCalculations();
        GaussJacobiCalculations eq2=new GaussJacobiCalculations();
        GaussJacobiCalculations eq3=new GaussJacobiCalculations();
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
        GaussJacobiCalculations.iterationOne();
        eq1.setInitialX(arrX);
        eq2.setInitialY(arrY);
        eq3.setInitialZ(arrZ);
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
            double x0=GaussJacobiCalculations.getX();
            double y0=GaussJacobiCalculations.getY();
            double z0=GaussJacobiCalculations.getZ();
            x0=Double.parseDouble(df_obj.format(x0));
            y0=Double.parseDouble(df_obj.format(y0));
            z0=Double.parseDouble(df_obj.format(z0));
            arrX[i]=x0;
            arrY[i]=y0;
            arrZ[i]=z0;
            eq1.setXYZ(x0,y0,z0);
            eq2.setXYZ(x0,y0,z0);
            eq3.setXYZ(x0,y0,z0);
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