package Pruebas;
import java.util.*;

public class Conversor_a_decimal{
    public static void main (String args[]){
        double i, d, n, num, base;
        double suma=0,sum;
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduzca n");//n sera la cantidad de numeros -1 a la izq de la coma
        n=sc.nextDouble();
        System.out.println("Introduzca d");
        d=sc.nextDouble();
        i=-d;
        System.out.println("Introduzca la base");
        base=sc.nextDouble();
        while (i<=n){
            System.out.println("Introduzca el número");
            //Para hexadecimal, seguir las siguientes equivalencias:
            //A=10; B=11; C=12; D=13; E=14; F=15
            num=sc.nextDouble();
            sum=(num*Math.pow(base,i));
            System.out.println(sum);
            suma=suma+sum;
            i++;   
        }
        System.out.println("="+suma);
    }
}
//Para que el sumatorio funcione, primero se introducira
//n para crear un bucle while que vaya sumando los diferentes
//exponentes