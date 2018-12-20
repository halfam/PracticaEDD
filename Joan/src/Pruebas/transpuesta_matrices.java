package Pruebas;
public class transpuesta_matrices{
    public static void main(String args[]) {
        int[][] A={ {2,0,1}, {3,0,0}, {5,1,1}};
        int[][] At=new int[3][3];
        int aux,i,j;
        
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[0].length; j++) {
                At[j][i]=A[i][j];
            }
        }
        for (i = 0; i < A.length; i++) {
            System.out.println("");
            for (j = 0; j < A[0].length; j++) {
                 System.out.print(At[i][j]+" ");
            }
        }
    }
}