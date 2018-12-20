package Pruebas;
public class diagonal_matrices{
    public static void main(String args[]) {
        int[][] A={ {2,0,1}, {3,0,0}, {5,1,1}};
        
        int i,j;
        
        for (i = 0; i < A.length; i++) {
              for (j=0;j<i;j++)
                System.out.print("  ");
               System.out.println(A[i][i]);
         }
    }
}