public class MyPointDemo {
    public static void main(String[] args) {
        System.out.println("Enter coordinates for a point: ");
        MyPoint p1=new MyPoint();
        p1.getInput();
        System.out.println("You entered: Point A("+p1.x+","+p1.y+")");
        System.out.println("Let a particular point be P(1,2)");
        System.out.println("Distance between A("+p1.x+","+p1.y+") and P(1,2): "+p1.distanceinCoodinates(1,2));
        System.out.println("\nEnter coordinates for another point: ");
        MyPoint p2=new MyPoint();
        p2.getInput();
        System.out.println("You entered: Point B("+p2.x+","+p2.y+")");
        System.out.println("Distance between A("+p1.x+","+p1.y+") and B("+p2.x+","+p2.y+"): "+p1.distance(p2));
    }
}