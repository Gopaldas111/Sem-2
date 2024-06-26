import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of Vowels and Consonants");
        System.out.print("Enter any String: ");
        String s=sc.nextLine();
        int i,v=0,c=0;
        sc.close();
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                v++;
            }
            else{
                if((s.charAt(i)>=65&&s.charAt(i)<=90) || (s.charAt(i)>=97&&s.charAt(i)<=122)){
                    c++;
                }
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
    }
}
