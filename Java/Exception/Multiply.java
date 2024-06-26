public class Multiply {
    public static int product(int x,int y){
        int product=0;
        if(x<0 && y<0){
            x=Math.abs(x);
            y=Math.abs(y);
            for(int i=1;i<=y;i++){
                product+=x;
            }
            return product;
        }
        else if(x<0 || y<0){
            x=Math.abs(x);
            y=Math.abs(y);
            for(int i=1;i<=y;i++){
                product+=x;
            }
            product=(-1)*product;
            return product; 
        }
        for(int i=1;i<=y;i++){
            product+=x;
        }
        return product;
    }
    public static void main(String[] args) {
        try{
            int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]); 
            int ans=product(x,y);
            System.out.println("Multiplication: "+x+"*"+y+" = "+ans);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Not enough Command Line Arguments provided");
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid Input");
        } 
        catch(Exception e){
            e.printStackTrace();
        } 
    }
}
