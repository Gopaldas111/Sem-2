import java.util.Scanner;
class MyPoint {
    double x;
    double y;

    Scanner sc=new Scanner(System.in);

    public MyPoint(){
        x=0;
        y=0;
    }

    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void getInput(){
        System.out.print("X-coordinate: ");
        this.x=sc.nextDouble();
        System.out.print("Y-coordinate: ");
        this.y=sc.nextDouble();
    }

    public double distance(MyPoint p){
        double d=Math.sqrt(((p.getX()-this.x)*(p.getX()-this.x))+((p.getY()-this.y)*(p.getY()-this.y)));
        return d;
    }

    public double distanceinCoodinates(double x,double y){
        double d=Math.sqrt(((x-this.x)*(x-this.x))+((y-this.y)*(y-this.y)));
        return d;
    }
}
