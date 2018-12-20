package Pruebas;
import java.util.*;
public class Conversor_a_nbase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int base, num,err,i=1, modnb, divnb;
        int decint;
        System.out.println("Introduzca la base a la cual quiere convertir el numero");
        base=sc.nextInt();
        if (base>=10){
            System.out.println("Introduzca la parte ENTERA del numero que quiere convertir");
            num=sc.nextInt();
            modnb=num%base;
            divnb=num/base;
            switch (modnb){
                case 10: System.out.println("A");break;
                case 11: System.out.println("B");break;
                case 12: System.out.println("C");break;
                case 13: System.out.println("D");break;
                case 14: System.out.println("E");break;
                case 15: System.out.println("F");break;
                default: System.out.println(modnb);
            }
            while(divnb>base){
                divnb=divnb/base;
                switch (modnb){
                    case 10: System.out.println("A");break;
                    case 11: System.out.println("B");break;
                    case 12: System.out.println("C");break;
                    case 13: System.out.println("D");break;
                    case 14: System.out.println("E");break;
                    case 15: System.out.println("F");break;
                    default: System.out.println(modnb);
                }
            }
            switch (divnb){
                case 10: System.out.println("A");break;
                case 11: System.out.println("B");break;
                case 12: System.out.println("C");break;
                case 13: System.out.println("D");break;
                case 14: System.out.println("E");break;
                case 15: System.out.println("F");break;
                default: System.out.println(divnb);
            }
            System.out.println("**Los numeros se leeran de abajo a arriba**");
            System.out.println("------------------");
            double dec;
            System.out.println("Introduce SOLO la parte decimal (0,...) del numero que quiere convertir");
            dec=sc.nextDouble();
            System.out.println("Introduce el error");
            err=sc.nextInt();
            if(err==0){
                while(1-dec==0){
                    dec=dec*base;
                    System.out.println("0");
                }
                 System.out.println(base-1);
            }
             else{
                        while((dec!=1.0)&&(i<=err)){
                            dec=dec*base;
                            decint=(int)Math.floor(dec);
                            switch (decint){
                                case 10: System.out.println("A");break;
                                case 11: System.out.println("B");break;
                                case 12: System.out.println("C");break;
                                case 13: System.out.println("D");break;
                                case 14: System.out.println("E");break;
                                case 15: System.out.println("F");break;
                                default: System.out.println(decint);
                            }
                            dec=dec-decint;
                            i++;
                        }
                    }
                    System.out.println("**Los numeros se leeran de arriba a abajo**");
                }
                else{
                    System.out.println("Introduzca la parte ENTERA del numero que quiere convertir");
                    num=sc.nextInt();
                    System.out.println("**RESULTADO**");
                    System.out.println(num%base);
                    while(num>base){
                        num=num/base;
                        System.out.println(num%base);
                    }
                    System.out.println(num/base);
                    System.out.println("**Los numeros se leeran de abajo a arriba**");
                    System.out.println("------------------");
                    double dec;
                    System.out.println("Introduce SOLO la parte decimal (0,...) del numero que quiere convertir");
                    dec=sc.nextDouble();
                    System.out.println("Introduce el error");
                    err=sc.nextInt();
                    System.out.println("**RESULTADO**");
                    if(err==0){
                        while(1-dec==0){
                            dec=dec*base;
                            System.out.println("0");
                        }
                        System.out.println(base-1);
                    }
                    else{
                        while((dec!=1.0)&&(i<=err)){
                            dec=dec*base;
                            System.out.println(Math.floor(dec));
                            dec=dec-Math.floor(dec);
                            i++;
                        }
                    }
                    System.out.println("**Los numeros se leeran de arriba a abajo**");
                }
    }
}

//Se dividira hasta que el resultado de la division sea menor que la base
//El resultado de la parte entera se leera de abajo a arriba, siendo el ultimo numero, el de
//mas "valor"
//El resultado de la parte decimal se leera de arriba a abajo, siendo el primer numero, el de
//mas "valor"