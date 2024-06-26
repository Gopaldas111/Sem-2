public class Add {
    public static void main(String[] args) {
        int sum=0;
        try{
            for(int i=0;i<args.length;i++){
                int n=Integer.parseInt(args[i]);
                try{
                    if(n<0){
                        throw new IllegalArgumentException(n+": Negative number");
                    }
                    else if(n%10==0){
                        throw new IllegalArgumentException(n+": Divisible by 10");
                    }
                    else if(n>1000&&n<2000){
                        throw new IllegalArgumentException(n+": Between 1000 and 2000");
                    }
                    else if(n>7000){
                        throw new IllegalArgumentException(n+": Greater than 7000");
                    }
                    else{
                        sum+=n;   
                    }
                }
                catch(IllegalArgumentException ie){
                    System.out.println(ie.getMessage());
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Sum: "+sum);
    }
}
