class ThisClass {
    static int a;
    public void print(int a){
        this.a=a;
    }
    // public static void print(int x){
    //     this.a=x;
    // }
    //The above method if executed would show an error as this keyword can't be used with a static method.
}
public class ThisDemo {
    public static void main(String[] args) {
        ThisClass c1=new ThisClass();
        c1.print(10);
        System.out.println("Object 1: "+c1.a);
        ThisClass c2=new ThisClass();
        c2.print(5);
        System.out.println("Object 2: "+c2.a);
    }
}
