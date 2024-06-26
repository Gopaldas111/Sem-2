import java.util.Scanner;
class Vowel {
    int totalA=0,totalE=0,totalI=0,totalO=0,totalU=0;
    public void getData(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter a String (or 'quit' to exit): ");
            String s=sc.nextLine();
            s=s.trim().toLowerCase();
            if(s.equals("quit")){
                System.out.println("You entered 'quit'!");
                break;
            }
            countVowels(s);
        }
        sc.close();
    }
    public void countVowels(String s) {
        int  a= 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
                switch (c) {
                    case 'a':a++;
                            break;
                    case 'e':e++;
                            break;
                    case 'i':i++;
                            break;
                    case 'o':o++;
                            break;
                    case 'u':u++;
                            break;
                }
        }
        totalA+=a;
        totalE+=e;
        totalI+=i;
        totalO+=o;
        totalU+=u;
        System.out.println("Vowel Count: ");
            System.out.println("a: "+a);
            System.out.println("e: "+e);
            System.out.println("i: "+i);
            System.out.println("O: "+o);
            System.out.println("u: "+u);
    }
    public void totalVowel(){
        System.out.println("Total Vowel Count: ");
            System.out.println("a: "+totalA);
            System.out.println("e: "+totalE);
            System.out.println("i: "+totalI);
            System.out.println("O: "+totalO);
            System.out.println("u: "+totalU);
    }
}

