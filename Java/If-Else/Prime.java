import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Prime Number or Not");
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        int i,flag=0;
        sc.close();
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("Not a Prime Number");
                return;
            }
        }
        if(n==0||n==1){
            System.out.println("Neither Prime nor Composite Number");
        }
        else if(flag==0){
            System.out.println("Prime Number");
        }
    }
}
