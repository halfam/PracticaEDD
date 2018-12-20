//FICHERO DE PRUEBAS
package Pruebas;
import java.util.*;
import java.io.*;
public class Pruebas_1{
    public static void main(String args[]){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        String a="";
        int n;
        try{
            a=br.readLine();
        }
        catch(IOException e){
            
        }
        n=a.indexOf(',');
        System.out.println(n);
    }
}