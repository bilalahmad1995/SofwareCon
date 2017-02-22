import java.util.Scanner;

public class MatrixMultiplicationIterativeMethod {

	   private static Scanner s;
	   
	   static IterativeMultiplication IM = new IterativeMultiplication();

   	   public static void main(String[] args) {
       s = new Scanner(System.in);
       
       System.out.print("Enter number of rows in A: ");
       int noOfRowsInA = s.nextInt();
       
       System.out.print("Enter number of columns in A / rows in B: "); // for matrix multiplication compatibility
       int noOfColumnsInAandRowsInB = s.nextInt();
       
       System.out.print("Enter number of columns in B: ");
       int noOfRowsInB = s.nextInt();
       
       int[][] a = new int[noOfRowsInA][noOfColumnsInAandRowsInB];
       int[][] b = new int[noOfColumnsInAandRowsInB][noOfRowsInB];
       
       System.out.println("Enter matrix A");
       for (int k = 0; k < a.length; k++) {
           for (int l = 0; l < a[0].length; l++) {
               a[k][l] = s.nextInt();
           }
       }
       
       System.out.println("Enter matrix B");
       for (int k = 0; k < b.length; k++) {
           for (int l = 0; l < b[0].length; l++) {
               b[k][l] = s.nextInt();
           }
       }
       
       int c[][] = IM.multiply(a,b);
       System.out.println("Product of A and B is");
       for (int k = 0; k < c.length; k++) {
           for (int l = 0; l < c[0].length; l++) {
               System.out.print(c[k][l] + " ");
           }
           System.out.println();
       }
   }

	
  
}