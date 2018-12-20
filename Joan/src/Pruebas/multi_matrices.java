package Pruebas;
public class multi_matrices{
    public static void main(String args[]) {
        int[][] A={ {2,0,1}, {3,0,0}, {5,1,1}};
        int[][] B={ {1,0,1}, {1,2,1}, {1,1,0}};
        int[][] C= new int[3][3];
    
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    // aquí se multiplica la matriz
                    C[i][j]=C[i][j]+A[i][k] * B[k][j];
                }
            }
        }
        for (int[] C1 : C) {
            System.out.println("");
            for (int j = 0; j<C[0].length; j++) {
                System.out.print(C1[j] + " ");
            }
        }
    }
    
}

