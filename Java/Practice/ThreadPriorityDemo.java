class Table{
	synchronized public void print(int n){
		for(int i=0;i<10;i++){
			System.out.println("Table: "+n);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class Thread1 extends Thread{
	Table t;
	public Thread1(Table t){
		this.t=t;
	}
	public void run(){
		for(int i=0;i<10;i++){
			try{
				sleep(500);
				System.out.println("Thread 1: "+i);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		t.print(1);
	}
}
class Thread2 extends Thread{
	Table t;
	public Thread2(Table t){
		this.t=t;
	}
	public void run(){
		for(int i=0;i<10;i++){
			try{
				sleep(500);
				System.out.println("Thread 2: "+i);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		t.print(2);
	}
}
public class ThreadPriorityDemo{
	public static void main(String[] args){
		Table t=new Table();
		Thread1 p1=new Thread1(t);
		Thread2 p2=new Thread2(t);
		p1.start();
		p2.start();
	}
}