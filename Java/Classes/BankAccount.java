import java.util.Scanner;
public class BankAccount {
    int accountNo;
    String userName;
    String email;
    String accountType;
    double accountBalance;
    public void getAccountDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter User Name: ");
        userName=sc.nextLine();
        System.out.print("Enter Email Id: ");
        email=sc.nextLine();
        System.out.print("Enter Account Type: ");
        accountType=sc.nextLine();
        System.out.print("Enter Account Number: ");
        accountNo=sc.nextInt();
        System.out.print("Enter Account Balance: ");
        accountBalance=sc.nextDouble();
        sc.close();
    }
    public void displayAccountDetails(){
        System.out.println("Bank Account Details are as follows: ");
        System.out.println("Account Number: "+accountNo);
        System.out.println("User Name: "+userName);
        System.out.println("Email Id: "+email);
        System.out.println("Account Type: "+accountType);
        System.out.println("Account Balance: "+accountBalance);
    }
}