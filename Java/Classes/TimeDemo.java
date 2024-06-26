public class TimeDemo {
    public static void main(String[] args) {
        System.out.println("Time 1: ");
        Time t1 = new Time();
        System.out.println("Time 2: ");
        Time t2 = new Time();
        System.out.format("\nTime 1: %02d:%02d:%02d\n",t1.hour,t1.minute,t1.second);
        System.out.format("Time 2: %02d:%02d:%02d\n",t2.hour,t2.minute,t2.second);
        t2.addTime(t1);
        System.out.print("\nAddition: ");
        System.out.format("%02d:%02d:%02d\n",t2.hour,t2.minute,t2.second);
    }
}
