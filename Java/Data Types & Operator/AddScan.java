import java.util.Scanner;
public class AddScan{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition of 2 Numbers using Scanner Class");
        System.out.print("Enter any number: ");
        int a=sc.nextInt();
        System.out.print("Enter any number: ");
        int b=sc.nextInt();
        System.out.println("Addition: "+a+"+"+b+"="+(a+b));
        sc.close();
    }
}
