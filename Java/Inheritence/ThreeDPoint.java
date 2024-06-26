class ThreeDPoint extends MyPoint{
    double z;

    public ThreeDPoint(){
        x=0;
        y=0;
        z=0;
    }

    public ThreeDPoint(double x,double y,double z){
        super(x,y);
        this.z=z;
    }

    public double getZ(){
        return z;
    }

    public void getInput(){
        System.out.print("X-coordinate: ");
        this.x=sc.nextDouble();
        System.out.print("Y-coordinate: ");
        this.y=sc.nextDouble();
        System.out.print("Z-coordinate: ");
        this.z=sc.nextDouble();
    }

    public double distance(ThreeDPoint p){
        double d=Math.sqrt(((p.getX()-this.x)*(p.getX()-this.x))+((p.getY()-this.y)*(p.getY()-this.y))+((p.getZ()-this.z)*(p.getZ()-this.z)));
        return d;
    }

    public double distanceinCoodinates(double x,double y,double z){
        double d=Math.sqrt(((x-this.x)*(x-this.x))+((y-this.y)*(y-this.y))+((z-this.z)*(z-this.z)));
        return d;
    }
}
