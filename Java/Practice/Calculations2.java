import java.util.Scanner;
class Calculations2 {
    double a;
    double b;
    double c;
    double d;
    static double x;
    static double y;
    static double z;
    Scanner sc=new Scanner(System.in);
    
    public void getInput(){
        System.out.print("x: ");
        this.a=sc.nextDouble();
        System.out.print("y: ");
        this.b=sc.nextDouble();
        System.out.print("z: ");
        this.c=sc.nextDouble();
        System.out.print("Constant: ");
        this.d=sc.nextDouble();
        System.out.println("");
    }

    public void displayEquation(){
        if(b<0&&c>0){
            System.out.println(a+"x"+b+"y+"+c+"z="+d);
        }
        else if(b>0&&c<0){
            System.out.println(a+"x+"+b+"y"+c+"z="+d);
        }
        else if(b<0&&c<0){
            System.out.println(a+"x"+b+"y"+c+"z="+d);
        }
        else{
            System.out.println(a+"x+"+b+"y+"+c+"z="+d);
        }
    }

    public boolean isDiagonallyDominant(Calculations2 eq2,Calculations2 eq3){
        if(Math.abs(this.a)>=Math.abs(this.b)+Math.abs(this.c) && Math.abs(eq2.b)>=Math.abs(eq2.a)+Math.abs(eq2.c) && Math.abs(eq3.c)>Math.abs(eq3.a)+Math.abs(eq3.b)){
            return true;
        }
        else if(Math.abs(this.a)>Math.abs(this.b)+Math.abs(this.c) && Math.abs(eq2.b)>=Math.abs(eq2.a)+Math.abs(eq2.c) && Math.abs(eq3.c)>=Math.abs(eq3.a)+Math.abs(eq3.b)){
            return true;
        }
        else if(Math.abs(this.a)>=Math.abs(this.b)+Math.abs(this.c) && Math.abs(eq2.b)>Math.abs(eq2.a)+Math.abs(eq2.c) && Math.abs(eq3.c)>=Math.abs(eq3.a)+Math.abs(eq3.b)){
            return true;
        }
        else{
            return false;
        }
    }

    public void swapEquations(Calculations2 eq2){
        GaussJacobiCalculations temp=new GaussJacobiCalculations();
        temp.a=eq2.a;
        eq2.a=this.a;
        this.a=temp.a;
        temp.b=eq2.b;
        eq2.b=this.b;
        this.b=temp.b;
        temp.c=eq2.c;
        eq2.c=this.c;
        this.c=temp.c;
        temp.d=eq2.d;
        eq2.d=this.d;
        this.d=temp.d;
    }

    public void makeDiagonallyDominant(Calculations2 eq2,Calculations2 eq3){
        if(Math.abs(eq2.b)<Math.abs(eq2.a)+Math.abs(eq2.c) && Math.abs(eq3.c)<Math.abs(eq3.a)+Math.abs(eq3.b)){
            eq2.swapEquations(eq3);
        }
        if(Math.abs(this.a)<Math.abs(this.b)+Math.abs(this.c) && Math.abs(eq2.b)<Math.abs(eq2.a)+Math.abs(eq2.c)){
            this.swapEquations(eq2);
        }
        if(Math.abs(this.a)<Math.abs(this.b)+Math.abs(this.c) && Math.abs(eq3.c)<Math.abs(eq3.a)+Math.abs(eq3.b)){
            this.swapEquations(eq3);
        }
        if(Math.abs(this.a)==Math.abs(this.b)+Math.abs(this.c) && Math.abs(eq2.b)==Math.abs(eq2.a)+Math.abs(eq2.c) && Math.abs(eq3.c)==Math.abs(eq3.a)+Math.abs(eq3.b)){
            System.out.println("Given system of linear equations can't be converted into Diagonally Dominant!");
            System.exit(0);
        }
    }
    
    public void formulaX(){
        x=(this.d-(this.b*y)-(this.c*z))/a;
    }

    public void formulaY(){
        y=(this.d-(this.a*x)-(this.c*z))/b;
    }

    public void formulaZ(){
        z=(this.d-(this.b*y)-(this.a*x))/c;
    }

    public static void iterationOne(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Values of x,y,z for Iteration 0");
        System.out.print("x: ");
        x=sc.nextDouble();
        System.out.print("y: ");
        y=sc.nextDouble();
        System.out.print("z: ");
        z=sc.nextDouble();
    }

    public static double getX(){
        return x;
    }
    public static double getY(){
        return y;
    }
    public static double getZ(){
        return z;
    }

}
