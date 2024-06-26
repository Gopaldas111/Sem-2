abstract class Vegetable {
    String color;
    String name;
    abstract public String toString();
}
class Potato extends Vegetable{
    public Potato(){
        super.name="Potato";
        super.color="Brown";
    }
    public String toString(){
        return super.name+": Color-> "+super.color;
    }
}
class Brinjal extends Vegetable{
    public Brinjal(){
        super.name="Brinjal";
        super.color="Purple";
    }
    public String toString(){
        return super.name+": Color-> "+super.color;
    }
}
class Tomato extends Vegetable{
    public Tomato(){
        super.name="Tomato";
        super.color="Red";
    }
    public String toString(){
        return super.name+": Color-> "+super.color;
    }
}

public class VegetableDemo{
    public static void main(String[] args) {
        System.out.println("Colors of Vegetables");
        Potato p=new Potato();
        System.out.println(p);
        Brinjal b=new Brinjal();
        System.out.println(b);
        Tomato t=new Tomato();
        System.out.println(t);
    }
}