import java.util.Scanner;
public class MaxFrom3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Maximum From 3 Numbers");
        System.out.print("Enter any number: ");
        int a=sc.nextInt();
        System.out.print("Enter any number: ");
        int b=sc.nextInt();
        System.out.print("Enter any number: ");
        int c=sc.nextInt();
        sc.close();
        if(a>b){
            if(a>c){
                System.out.println("Maximum Number: "+a);
            }
            else{
                System.out.println("Maximum Number: "+c);
            }
        }
        else{
            if(b>c){
                System.out.println("Maximum Number: "+b);
            }
            else{
                System.out.println("Maximum Number: "+c);
            }
        }
    }
}
