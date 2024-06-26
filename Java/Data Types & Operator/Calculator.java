import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculator");
        System.out.print("Enter any number: ");
        int a=sc.nextInt();
        System.out.print("Enter any number: ");
        int b=sc.nextInt();
        System.out.print("Enter Operator Sign: ");
        char c=sc.next().charAt(0);
        while(c!='+'&&c!='-'&&c!='*'&&c!='/'&&c!='%'){
            System.out.print("Enter Operator Sign again: ");
            c=sc.next().charAt(0);
        }
        if(c=='+'){
            System.out.println("Result: "+a+"+"+b+"="+(a+b));
        }
        else if(c=='-'){
            System.out.println("Result: "+a+"-"+b+"="+(a-b));
        }
        else if(c=='*'){
            System.out.println("Result: "+a+"*"+b+"="+(a*b));
        }
        else if(c=='%'){
            System.out.println("Result: "+a+"%"+b+"="+(a%b));
        }
        else if(c=='/'){
            while(b==0){
                System.out.print("Enter Second Number again: ");
                b=sc.nextInt();
            }
            System.out.println("Result: "+a+"/"+b+"="+(a/b));
        }
        sc.close();
    }
}
