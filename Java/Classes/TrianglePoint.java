import java.util.Scanner;

class TrianglePoint {
    int x;
    int y;
    Scanner sc=new Scanner(System.in);
    public TrianglePoint(){
        System.out.print("X-coordinate: ");
        x=sc.nextInt();
        System.out.print("Y-coordinate: ");
        y=sc.nextInt();
    }
    public void displayPoints(TrianglePoint p2,TrianglePoint p3){
        System.out.println("Points of Triangle: A("+this.x+","+this.y+"), B("+p2.x+","+p2.y+"), C("+p3.x+","+p3.y+")");
    }
    public double distanceFormula(TrianglePoint p){
        double side=Math.sqrt(((p.x-this.x)*(p.x-this.x))+((p.y-this.y)*(p.y-this.y)));
        return side;
    }
    public int isTriangle(double a,double b,double c){
        if((a<(b+c))&&(b<(a+c))&&(c<(b+a))){
            return 1;
        }
        else{
            return 0;
        }
    }
    public double areaTriangle(double a,double b,double c){
        double s=(a+b+c)/2;
        double area=Math.sqrt(Math.abs(s*(s-a)*(s-b)*(s-c)));
        area=(float)area;
        return area;
    }
}
