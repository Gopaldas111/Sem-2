class Morning implements Runnable{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("1: Good Morning");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Interrupted Exception");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Afternoon implements Runnable{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("2: Good Afternoon");
                Thread.sleep(3000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Interrupted Exception");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class MorningAfternoon {
    public static void main(String[] args) {
        Morning m=new Morning();
        Thread t=new Thread(m);
        t.start();   
        Afternoon a=new Afternoon();
        Thread t2=new Thread(a);
        t2.start(); 
    }
}
