public class TrianglePointDemo {
    public static void main(String[] args) {
        System.out.println("To check if a point lies inside a triangle");
        System.out.println("Point 1: ");
        TrianglePoint p1=new TrianglePoint();
        System.out.println("Point 2: ");
        TrianglePoint p2=new TrianglePoint();
        System.out.println("Point 3: ");
        TrianglePoint p3=new TrianglePoint();
        p1.displayPoints(p2, p3);
        double a=p1.distanceFormula(p2);
        double b=p2.distanceFormula(p3);
        double c=p3.distanceFormula(p1);
        if(p1.isTriangle(a,b,c)==0){
            System.out.println("Invalid Triangle");
            return;
        }
        double area=p1.areaTriangle(a,b,c);
        System.out.println("Enter a random point: ");
        TrianglePoint p4=new TrianglePoint();
        double d=p4.distanceFormula(p1);
        double e=p4.distanceFormula(p2);
        double f=p4.distanceFormula(p3);
        double area1=p4.areaTriangle(a,d,e);
        double area2=p4.areaTriangle(b,e,f);
        double area3=p4.areaTriangle(c,f,d);
        if(area1+area2+area3==area){
            System.out.println("Point P("+p4.x+","+p4.y+") lies in the triangle ABC");
        }
        else{
            System.out.println("Point P("+p4.x+","+p4.y+") does not lie in the triangle ABC");
        }
    }
}
