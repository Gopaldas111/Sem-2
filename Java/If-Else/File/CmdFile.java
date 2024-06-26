import java.io.*;
public class CmdFile {
	public static void main(String[] args){
		int length;
		try{
			File filename=new File(args[0]);
			if(!filename.exists()){
				System.out.println("File or Directory Not Found");
				return;
			}
			if(filename.isFile()){
				System.out.println("File Found");
				System.out.println("Length: "+filename.length());
			}
			else{
				System.out.println("Directory Found");
				File[] files=filename.listFiles();
				if(files!=null){
					System.out.println("List of Files found in Directory");
					for(File f: files){
						System.out.println("\t"+f.getName());
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}