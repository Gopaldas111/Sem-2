import java.util.Scanner;
public class Scan {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Scanner Class");
        System.out.print("Enter any value: ");
        int a=sc.nextInt();
        System.out.print("Entered Input = "+a);
        sc.close();
    }
}
