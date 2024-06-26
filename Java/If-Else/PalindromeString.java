import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palindrome Or Not");
        System.out.print("Enter a String: ");
        String str = sc.next();
        sc.close();
        for (int i = 0; i < str.length()/ 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("Given String is Not Palindrome");
                return;
            }
        }

        System.out.println("Given String is Palindrome");
    }
}