import java.io.*;
public class Studentfis{
	public static void main(String[] args){
		String filename="students.txt";
		try{
			FileOutputStream fos=new FileOutputStream(filename);
			String s="Ansh,20";
			byte[] b=s.getBytes();
			fos.write(b);
			fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			FileInputStream fis=new FileInputStream(filename);
			int i;
			while((i=fis.read())!=-1){
				System.out.print((char)i);
			}
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}