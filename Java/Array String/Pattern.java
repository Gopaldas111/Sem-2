import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pattern: String in a Pyramid Form");
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
