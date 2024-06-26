class ThreadOdd extends Thread{
    public void run(){
        for(int i=1;i<21;i++){
            if(i%2!=0){
                System.out.println("Odd: "+i);
            }
        }
    }
}
class ThreadEven extends Thread{
    public void run(){
        for(int i=1;i<21;i++){
            if(i%2==0){
                System.out.println("Even: "+i);
            }
        }
    }
}
public class OddEven{
    public static void main(String[] args) {
        ThreadOdd t1=new ThreadOdd();
        t1.start();
        ThreadEven t2=new ThreadEven();
        t2.start();
    }
}