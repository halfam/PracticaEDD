package Pruebas;

import java.util.*;
public class Ejer_matrices{
    static double[][] potmat(double[][]mat){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        mat[0][0]=Math.pow(3,n-1)+Math.pow(2,n-1);
        mat[0][1]=Math.pow(3,n-1);
        mat[0][2]=Math.pow(3,n-1)-Math.pow(2,n-1);
        mat[1][0]=Math.pow(3,n-1);
        mat[1][1]=Math.pow(3,n-1);
        mat[1][2]=Math.pow(3,n-1);
        mat[2][0]=Math.pow(3,n-1)-Math.pow(2,n-1);
        mat[2][1]=Math.pow(3,n-1);
        mat[2][2]=Math.pow(3,n-1)+Math.pow(2,n-1);
        System.out.println("La matriz elevada a "+n+" quedaría así:");
        return mat;
    }
    static double[][] summat(double[][]mat,double[][]matsc){
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        double[][] sum=new double[3][3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matsc[i][j]=sc.nextInt();
            }
        }
        System.out.print('\n');
        sum[i][j]=mat[i][j]+matsc[i][j];
        System.out.println("La matriz dada más la matriz introducida es: ");
        return sum;
    }
    static double[][] restmat(double[][]mat,double[][]matsc){
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        double[][] rest=new double[3][3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matsc[i][j]=sc.nextInt();
            }
        }
        rest[i][j]=mat[i][j]-matsc[i][j];
        System.out.println("La matriz dada más la matriz introducida es: ");
        return rest;
    }
    static double[][] multmat(double[][]mat,double[][]matsc){
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,k;
        double[][] mult=new double[3][3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matsc[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++) {
            for(j=0;j<3;j++){
                for(k=0;k<3;k++) {
                    mult[i][j]=mult[i][j]+mat[i][k]*matsc[k][j];
                }
            }
        }
        System.out.print("La matriz obtenida al multiplicar la matriz dada por la matriz introducida es: ");
        return mult;
    }
    static double[][] transmat(double[][]mat){
        int i,j;
        double[][] trans=new double[3][3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                trans[j][i]=mat[i][j];
            }
        }
        System.out.print("La matriz transpuesta de la matriz dada es la siguiente:");
        return trans;
    }
    public static void main(String args[]){
        int e,i,j;
        double[][] mat=new double[][]{{2,1,0},{1,1,1},{0,1,2}},matsc=new double[3][3],sum=new double[3][3],rest=new double[3][3],mult=new double[3][3],trans=new double[3][3];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++){
            System.out.println("");
            for(j=0;j<3;j++){
                System.out.print(mat[i][j]+" ");
            }
        }
        System.out.println("");
        System.out.println("    1-Sumarle a la matriz dada otra introducida por teclado");
        System.out.println("    2-Restarle a la matriz dada otra introducida por teclado");
        System.out.println("    3-Multiplicarle a la matriz dada otra introducida por teclado");
        System.out.println("    4-Potenciar la matriz dada a un exponente dado por teclado");
        System.out.println("    5-Transponer la matriz dada");
        System.out.println("Introduce el número para relizar la operación deseada: ");
        e=sc.nextInt();
        System.out.println("");
        if(e<2){
            System.out.print("Introduce la matriz que quieras sumar con la matriz dada: ");
            summat(mat,matsc);
            for(i=0;i<3;i++){
                System.out.println("");
                for(j=0;j<3;j++){
                    System.out.print(sum[i][j]+" ");
                }
            }
        }
        else{
            if(1<e&&e<3){
                System.out.print("Introduce la matriz que quieras restar a la matriz dada: ");
                restmat(mat,matsc);
                for(i=0;i<3;i++){
                    System.out.println("");
                    for(j=0;j<3;j++){
                        System.out.print(rest[i][j]+" ");
                    }
                }
            }
            else{
                if(2<e&&e<4){
                    System.out.println("Introduce la matriz a la cual quieras multiplicar la matriz dada: ");
                    multmat(mat,matsc);
                    for(i=0;i<3;i++){
                        System.out.println("");
                        for(j=0;j<3;j++){
                            System.out.print(rest[i][j]+" ");
                        }
                    }
                }
                else{
                    if(3<e&&e<5){
                        System.out.println("Introduce el numero al que quieras elevar la anterior matriz: ");
                        potmat(mat);
                        for(i=0;i<3;i++){
                            System.out.println("");
                            for(j=0;j<3;j++){
                                System.out.print(mat[i][j]+" ");
                            }
                        }
                        System.out.println("");
                    }
                    else{
                        transmat(mat);
                        for(i=0;i<3;i++){
                            System.out.println("");
                            for(j=0;j<3;j++){
                                System.out.print(mat[i][j]+" ");
                            }
                        }
                        System.out.println("");
                        }
                    }
                }
            }
        }
}

