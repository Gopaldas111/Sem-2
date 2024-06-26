import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Temperature Conversion: Fahrenheit -> Celsius");
        System.out.print("Enter Temperature in Fahrenheit: ");
        double f=sc.nextDouble();
        double c=(f-32)*5/9;
        System.out.println("Temperature in Celsius: "+c);
        sc.close();
    }
}
