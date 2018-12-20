package Pruebas;
import java.util.*;
import java.io.*;

public class Conversor_de_bases_3 {
    static String n_dec(String nbase, int base){
        String dec;
        int n=0, d=0,i;
        double sumaent=0,sument,sumdex,sumadex=0;
        int[] ent=new int[n],dex=new int[d];
        n=nbase.indexOf(',');
        n=nbase.indexOf('.');
        n=nbase.indexOf("'");
        d=nbase.length()-(n+1);
        for(i=0;i<=n;i++){
            switch(nbase.charAt(i)){
                case 'A': ent[i]=10;
                case 'a': ent[i]=10;break;
                case 'B': ent[i]=11;
                case 'b': ent[i]=11;break;
                case 'C': ent[i]=12;
                case 'c': ent[i]=12;break;
                case 'D': ent[i]=13;
                case 'd': ent[i]=13;break;
                case 'E': ent[i]=14;
                case 'e': ent[i]=14;break;
                case 'F': ent[i]=15;
                case 'f': ent[i]=15;break;
                default: ent[i]=nbase.charAt(i);
            }
        }
        for(i=0;i<=d;i++){
            switch(nbase.charAt(i)){
                case 'A': dex[i]=10;
                case 'a': dex[i]=10;break;
                case 'B': dex[i]=11;
                case 'b': dex[i]=11;break;
                case 'C': dex[i]=12;
                case 'c': dex[i]=12;break;
                case 'D': dex[i]=13;
                case 'd': dex[i]=13;break;
                case 'E': dex[i]=14;
                case 'e': dex[i]=14;break;
                case 'F': dex[i]=15;
                case 'f': dex[i]=15;break;
               // default: dex[i]=Integer.parseInt(nbase.charAt(i));
            }
        }
        for(i=0;i<=n;i++){
            sument=(ent[i]*Math.pow(base,i));
            sumaent=sumaent+sument;
        }
        for(i=-1;i>=-d;i--){
            sumdex=(dex[i]*Math.pow(base,i));
            sumadex=sumadex+sumdex;
        }
        dec=sumaent+""+sumadex;
        return dec;
    }
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int cont=-1,resp,base;
        String nbase="",dec;
        do{
            System.out.println("------------------");
            System.out.println("1- Convertir de 'n' base a decimal");
            System.out.println("2- Convertir de decimal a ''n'' base");
            System.out.println("3- Salir");
            System.out.println("Seleccione la operacion que desee hacer");
            resp=sc.nextInt();
            switch(resp){
                case 1:
                    System.out.println("Introduzca el número deseado");
                    try{
                        nbase=br.readLine();
                    }
                    catch(IOException e){
                        
                    }
                    System.out.println("Introduzca la base del número");
                    base=sc.nextInt();
                    dec=n_dec(nbase,base);
                    System.out.println(dec);
                    break;
                case 2:
                    break;
                case 3:
                    cont=1;
                    break;
                default:
                    System.out.println("Opció inexistent");
                    cont=0;
            }
        }while (cont==0);
    }
}
