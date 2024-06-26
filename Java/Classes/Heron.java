class Heron {
    int side;
    public Heron(int side){
        this.side=side;
    }
    public int isTriangle(Heron s2,Heron s3){
        if((this.side<(s2.side+s3.side))&&(s2.side<(this.side+s3.side))&&(s3.side<(s2.side+this.side))){
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
