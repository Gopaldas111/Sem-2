import java.util.Scanner;
public class SecondHalfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of String and its Second Half");
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        int l=0;
        System.out.print("String: ");
        for (char c : s.toCharArray()) {
            l++;
            System.out.print(c);
        }
        System.out.println("\nLength of String: "+l);
        System.out.print("Second-Half of String: ");
        for(int i=l/2;i<l;i++){
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}
