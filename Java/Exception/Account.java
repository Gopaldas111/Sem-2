import java.util.Scanner;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String s){
        super(s);
    }
}
class Bank{
    private double balance;
    public Bank(double balance){
        this.balance=balance;
    }
    public void deposit(double d){
        balance+=d;
    }
    public void withdraw(double w) throws InsufficientFundsException{
        if(w<=balance){
            balance-=w;
        }
        else{
            throw new InsufficientFundsException("Insufficient funds!");
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class Account {
    public static void main(String[] args) {
        System.out.println("Bank Account");
        Scanner sc=new Scanner(System.in);
        System.out.println("Bank Balance: 10000");
        Bank a=new Bank(10000);
        System.out.print("Enter 1 for deposit and 0 for withdraw: ");
        int n=sc.nextInt();
        try{
            if(n==1){
                System.out.print("Enter amount to deposit: ");
                double d=sc.nextInt();
                a.deposit(d);
            }
            else if(n==0){
                System.out.print("Enter amount to withdraw: ");
                double w=sc.nextInt();
                a.withdraw(w);
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        catch(InsufficientFundsException ie){
            System.out.println("Exception: "+ie.getMessage());
        }
        System.out.println("Current Balance: "+a.getBalance());
        sc.close();
    }
}
