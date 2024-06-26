class StaticClass {
    static int count=0;
    public StaticClass(){
        count+=1;
    }
    public static int getCount(){
        return count;
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        StaticClass s1=new StaticClass();
        StaticClass s2=new StaticClass();
        StaticClass s3=new StaticClass();
        StaticClass s4=new StaticClass();
        System.out.println("Number of Objects Created: "+StaticClass.getCount());
    }
}
