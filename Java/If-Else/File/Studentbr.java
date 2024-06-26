import java.io.*;
class Student{
	String name;
	int age;
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "Name: "+this.name+", Age: "+this.age;
	}
}
public class Studentbr{
	public static void main(String[] args){
		String filename="students.txt";
		try{
			FileWriter fw=new FileWriter(filename);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Ansh,20");
			bw.newLine();
			bw.write("Akhil,21");
			bw.newLine();
			bw.write("Samarth,22");
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			FileReader fr=new FileReader(filename);
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null){
				String[] s=line.split(",");
				String name=s[0];
				int age=Integer.parseInt(s[1]);
				Student stu=new Student(name,age);
				System.out.println(stu);
				line=br.readLine();
			}
			br.close();
			fr.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}