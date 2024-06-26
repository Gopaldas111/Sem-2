import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pattern: Half Diamond");
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        System.out.println("");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
