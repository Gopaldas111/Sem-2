import java.util.Scanner;
class Student {
    int id_no; 
    int no_of_subjects_registered;
    String[] subject_code; 
    int[] subject_credits;
    String[] grade_obtained;
    double spi;
    Scanner sc=new Scanner(System.in);

    public Student(int id_no,int no_of_subjects_registered,String[] subject_code,int[] subject_credits,String[] grade_obtained){
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = 0.0;
    }

    public double get_spi(){
        int totalCredits=0;
        double gradetemp=0.0;
        for(int i=0;i<no_of_subjects_registered;i++){
            totalCredits+=subject_credits[i];
            gradetemp+=subject_credits[i]*gradeToNumber(grade_obtained[i]);
        }
        spi=gradetemp/totalCredits;
        return spi;
    }

    public double gradeToNumber(String grade_obtained){
        grade_obtained=grade_obtained.toUpperCase();
        char grade=grade_obtained.charAt(0);
        switch (grade) {
            case 'A':
                return 10.0;
            case 'B':
                return 9.0;
            case 'C':
                return 8.0;
            case 'D':
                return 7.0;
            case 'E':
                return 6.0;
            case 'F':
                return 5.0;
            default:
                return 0.0;
        }
    }
}
