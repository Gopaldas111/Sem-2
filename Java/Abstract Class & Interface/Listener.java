interface EventListener{
    public void performEvent();
}
interface MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}
interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyReleased();
}
class EventDemo implements MouseListener, KeyListener{
    public void performEvent(){
        System.out.println("Perform Event");
    }
    public void mouseClicked(){
        System.out.println("Mouse Clicked");
    }
    public void mousePressed(){
        System.out.println("Moise Pressed");
    }
    public void mouseReleased(){
        System.out.println("Mouse Released");
    }
    public void mouseMoved(){
        System.out.println("Mouse Moved");
    }
    public void mouseDragged(){
        System.out.println("Mouse Dragged");
    }
    public void keyPressed(){
        System.out.println("Key Pressed");
    }
    public void keyReleased(){
        System.out.println("Key Released");
    }
}
public class Listener {
    public static void main(String[] args) {
        EventDemo e=new EventDemo();
        e.performEvent();
        e.mouseClicked();
        e.mousePressed();
        e.mouseReleased();
        e.mouseMoved();
        e.mouseDragged();
        e.keyPressed();
        e.keyReleased();
    }
}
