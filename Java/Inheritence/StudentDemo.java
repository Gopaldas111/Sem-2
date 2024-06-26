import java.util.Scanner;
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total no. of Students: ");
        int n=sc.nextInt();
        Student[] s=new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1)+": ");
            System.out.print("Enter id number: ");
            int id_no=sc.nextInt();
            System.out.print("Enter No. of Subjects registered: ");
            int no_of_subjects_registered=sc.nextInt();
            String[] subject_code=new String[no_of_subjects_registered];
            int[] subject_credits=new int[no_of_subjects_registered];
            String[] grade_obtained=new String[no_of_subjects_registered];
            for(int j=0;j<no_of_subjects_registered;j++){
                System.out.println("\tSubject "+(j+1)+": ");
                System.out.print("\t\tEnter Subject Code: ");
                subject_code[j]=sc.next();
                System.out.print("\t\tEnter Subject Credits: ");
                subject_credits[j]=sc.nextInt();
                System.out.print("\t\tEnter Grade Obtained: ");
                grade_obtained[j]=sc.next();
            }
            s[i]=new Student(id_no,no_of_subjects_registered,subject_code,subject_credits,grade_obtained);
            double spi=s[i].get_spi();
            System.out.println("Student "+s[i].id_no+"-> SPI obtained: "+spi);
        }
        sc.close();
    }
}
