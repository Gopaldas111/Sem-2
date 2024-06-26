import java.util.Scanner;
public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array and Average of its Elements");
        System.out.print("Enter no. of elements in array: ");
        int n=sc.nextInt();
        double sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter any number(arr["+i+"]): ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double avg=sum/n;
        System.out.print("Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAverage of Array Elements: "+avg);
        sc.close();
    }
}
