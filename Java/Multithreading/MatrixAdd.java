import java.util.Scanner;
class ThreadAdd extends Thread{
    int m;
    int n;
    double[][] matrix;
    
    public ThreadAdd(int m,int n,double[][] matrix){
        this.m=m;
        this.n=n;
        this.matrix=matrix;
    }
    public void run(){
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=matrix[m][i];
        }
        System.out.println("Sum of row "+m+": "+sum);
    }
}
public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Matrix Rows Addition");
        System.out.print("No. of rows: ");
        int m=sc.nextInt();
        System.out.print("No. of columns: ");
        int n=sc.nextInt();
        double[][] matrix = new double[m][n];
        System.out.println("Enter values of matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("matrix["+i+"]["+j+"]: ");
                matrix[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Matrix: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
        ThreadAdd[] t=new ThreadAdd[m];
        for(int i=0;i<m;i++){
            t[i]=new ThreadAdd(i,n,matrix);
            t[i].start();
        }
        sc.close();
    }
}
