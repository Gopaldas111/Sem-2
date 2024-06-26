class FinalClass {
    final static int a=10;
    public FinalClass(){
        // a=10;
        // Will cause a compilation error
    }
    public final static void display(){
        System.out.println("Final method in FinalClass");
    }
}
final class FinalSuperClass extends FinalClass{
    // public void display(){
    //     System.out.println("Overridden method in Subclass");
    // }
}
// class FinalSubClass extends FinalSuperClass{
//     Will cause a compilation error
// }
public class FinalDemo{
    public static void main(String[] args) {
        System.out.println("Final Keyword Demo");
        System.out.println("Final Variable(a): "+FinalClass.a);
        System.out.print("Final Method: ");
        FinalClass.display();
    }
}
