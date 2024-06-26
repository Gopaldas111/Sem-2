import java.io.*;
public class ReplaceWord {
    public static void main(String[] args) {
        try {
            File file1=new File("Replaceword1.txt");
            File file2=new File("Replaceword2.txt");
            FileReader fr=new FileReader(file1);
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter(file2);
            BufferedWriter bw=new BufferedWriter(fw);

            int count=0;
            String line;
            while((line=br.readLine())!=null){
                String changedLine="";
                String[] s=line.split(" ");
                for(int i=0;i<s.length;i++){
                    if(s[i].equals("word1")){
                        changedLine+="word2"+" ";
                        count++;
                    }
                    else{
                        changedLine+=s[i]+" ";
                    }
                }
                bw.write(changedLine);
                bw.newLine();
            }
            System.out.println("Replacements done: "+count);
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
