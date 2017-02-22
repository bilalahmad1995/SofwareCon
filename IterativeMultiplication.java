public class IterativeMultiplication {


	public int[][] multiply(int[][] a, int[][] b) {
		
	       int rowsInA = a.length;
	       int columnsInA = a[0].length; // same as rows in B
	       int columnsInB = b[0].length;
	       int[][]  c = new int[rowsInA][columnsInB];
	       for (int k = 0; k < rowsInA; k++) {
	           for (int l = 0; l < columnsInB; l++) {
	               for (int j = 0; j < columnsInA; j++) {
	                   c[k][l] = c[k][l] + a[k][j] * b[j][l];
	               }
	           }
	       }
	       return c;
	   }

}

