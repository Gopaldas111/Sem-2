public class ThreeDPointDemo {
    public static void main(String[] args) {
        System.out.println("Enter coordinates for a point: ");
        ThreeDPoint p1=new ThreeDPoint();
        p1.getInput();
        System.out.println("You entered: Point A("+p1.x+","+p1.y+","+p1.z+")");
        System.out.println("Let a particular point be P(10,30,25.5)");
        System.out.println("Distance between A("+p1.x+","+p1.y+","+p1.z+") and P(10,30,25.5): "+p1.distanceinCoodinates(10,30,25.5));
        System.out.println("\nEnter coordinates for another point: ");
        ThreeDPoint p2=new ThreeDPoint();
        p2.getInput();
        System.out.println("You entered: Point B("+p2.x+","+p2.y+","+p2.z+")");
        System.out.println("Distance between A("+p1.x+","+p1.y+","+p1.z+") and B("+p2.x+","+p2.y+","+p2.z+"): "+p1.distance(p2));
    }
}
