import java.util.Scanner;

public class HeronDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Heron's Formula for a Triangle");
        System.out.print("Side 1: ");
        int a=sc.nextInt();
        System.out.print("Side 2: ");
        int b=sc.nextInt();    
        System.out.print("Side 3: ");
        int c=sc.nextInt();
        Heron s1=new Heron(a);
        Heron s2=new Heron(b);
        Heron s3=new Heron(c);
        if(s1.isTriangle(s2,s3)==0){
            System.out.println("Invalid Triangle");
            sc.close();
            return;
        }
        double area=s1.areaTriangle(a,b,c);
        System.out.println("Area of Triangle: "+area);
        sc.close();
    }
}
