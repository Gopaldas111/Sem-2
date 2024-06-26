import java.io.*;
public class NoOfChar {
    public static void main(String[] args) {
        try{
            File f=new File("Noofchar.txt");
            if(!f.exists()){
                throw new FileNotFoundException("File Not Found");
            }
            FileReader f1=new FileReader("Noofchar.txt");
            BufferedReader filebuffer=new BufferedReader(f1);
            int countLine=0;
            int countWord=0;
            int countChar=0;
            String line=filebuffer.readLine();
            while(line!=null){
                countLine+=1;
                countWord+=line.trim().split(" ").length;
                countChar+=line.length();
                line=filebuffer.readLine();
            }
            System.out.println("File name: Noofchar.txt");
            System.out.println("No. of lines: "+countLine);
            System.out.println("No. of words: "+countWord);
            System.out.println("No. of characters: "+countChar);
            filebuffer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
