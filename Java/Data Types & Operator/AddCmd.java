public class AddCmd{
    public static void main(String[] args) {
        System.out.println("Addition of 2 Numbers using Command Line Argument");
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("Addition: "+a+"+"+b+"="+(a+b));
    }
}
