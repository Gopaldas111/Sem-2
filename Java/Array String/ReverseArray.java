import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array in Reverse Order");
        System.out.print("Enter no. of elements in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter any number(arr["+i+"]): ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int temp;
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.print("\nArray in Reverse Order: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
