interface Transport{
    public void deliver();
}
abstract class Animal{
    abstract public void show();
}
class Tiger extends Animal{
    public void show(){
        System.out.println("Tiger Class Object formed");
    }
}
class Camel extends Animal implements Transport{
    public void show(){
        System.out.println("Camel Class Object formed");
    }
    public void deliver(){
        System.out.println("Camel Class: Deliver method from Transport interface");
    }
}
class Deer extends Animal{
    public void show(){
        System.out.println("Deer Class Object formed");
    }
}
class Donkey extends Animal implements Transport{
    public void show(){
        System.out.println("Donkey Class Object formed");
    }
    public void deliver(){
        System.out.println("Donkey Class: Deliver method from Transport interface");
    }
}
public class TransportAnimal {
    public static void main(String[] args) {
        Animal a[]=new Animal[4];
        a[0]=new Tiger();
        a[1]=new Camel();
        a[2]=new Deer();
        a[3]=new Donkey();
        for(int i=0;i<4;i++){
            if(a[i] instanceof Transport){
                ((Transport)a[i]).deliver();
            }
            else{
                a[i].show();
            }
        }
    }
}
