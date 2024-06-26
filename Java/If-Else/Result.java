import java.util.Scanner;
public class Result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[5];
        int i,total=0;
        System.out.println("Result of a Student");
        System.out.print("Enter Maximum Marks for all Subjects: ");
        int max=sc.nextInt();
        for(i=0;i<5;i++){
            System.out.print("Enter Marks for Subject "+(i+1)+": ");
            marks[i]=sc.nextInt();
            while(marks[i]>max||marks[i]<0){
                System.out.print("Enter Marks for Subject "+(i+1)+" again: ");
                marks[i]=sc.nextInt();
            }
            sc.close();
            total+=marks[i];
        }
        double percent=total*100.0/(5*max);
        System.err.println("Percentage: "+percent);
        if(percent>=60){
            System.out.println("First Division");
        }
        else if(percent>=50){
            System.out.println("Second Division");
        }
        else if(percent>=40){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail");
        }
    }
}
