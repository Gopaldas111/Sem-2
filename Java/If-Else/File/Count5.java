import java.io.*;
import java.util.*;
public class Count5 {
    public static void main(String[] args) {
        Scanner sc;
        int count=0;
        try{
            File file = new File(args[0]);
            if(!file.exists()){
                file.createNewFile();
            }
            sc = new Scanner(file);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                for(int i=0;i<line.length();i++){
                    if(line.charAt(i) == '5'){
                        count++;
                    }
                }
            }
            System.out.println("No. of 5s: "+count);
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
