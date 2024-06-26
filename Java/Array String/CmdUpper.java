public class CmdUpper {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            if(args[i].charAt(0)>='A'&&args[i].charAt(0)<='Z'){
                continue;
            }
            else{
                System.out.print("Error: The Argument \""+args[i]+"\" passed at position"+i+" does not begin with an Uppercase Letter");
                
            }
        }
    }
}
