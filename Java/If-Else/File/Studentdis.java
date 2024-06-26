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
public class Studentdis{
	public static void main(String[] args){
		String filename="students.dat";
		try{
			FileOutputStream fos=new FileOutputStream(filename);
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeUTF("Ansh");
			dos.writeInt(20);
			dos.writeUTF("Akhil");
			dos.writeInt(21);
			dos.writeUTF("Samarth");
			dos.writeInt(22);
			dos.close();
			fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			FileInputStream fis=new FileInputStream(filename);
			DataInputStream dis=new DataInputStream(fis);
			while(dis.available()>0){
				String name=dis.readUTF();
				int age=dis.readInt();
				Student s=new Student(name,age);
				System.out.println(s);
			}
			dis.close();
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}