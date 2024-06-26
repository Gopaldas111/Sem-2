import java.util.Scanner;
class Time {
    int hour;
    int minute;
    int second;
    Scanner sc=new Scanner(System.in);
    public Time(){
        System.out.print("Hours: ");
        hour = sc.nextInt();
        System.out.print("Minutes: ");
        minute = sc.nextInt();
        System.out.print("Seconds: ");
        second = sc.nextInt();
    }
    public void addTime(Time t1){
        this.hour+=t1.hour;
        this.minute+=t1.minute;
        this.second+=t1.second;
        while(this.second>=60){
            this.minute+=1;
            this.second-=60;
        }
        while(this.minute>=60){
            this.hour+=1;
            this.minute-=60;
        }
    }
}
