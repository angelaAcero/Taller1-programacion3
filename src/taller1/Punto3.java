/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;


import java.util.Scanner;


public class Punto3 {
   
    public static void main(String[] args) {
      
    Scanner ingreso = new Scanner(System.in);
   CALCULADORA calculadora1 = new CALCULADORA();
       
       int operacion;
       String continuar;
       
       System.out.println();
       System.out.println("                     Calculadora");
       System.out.println();
       
       System.out.println("1 → suma");
       System.out.println("2 → resta");
       System.out.println("3 → mutiplicacion");
       System.out.println("4 → division");
       System.out.println("5 → seno");
       System.out.println("6 → coseno");
       System.out.println("7 → tangente");
       System.out.println("8 → raiz enecima      (primer numero radical, segundo numero radicando)");
       System.out.println("9 → potencia enécima     (primer numero base, segundo numero expoente)");
       System.out.println("10 → calcular el iva");
       
       
       
       System.out.println();
       System.out.println();    
       
    do
    {
            
     System.out.print("Digite su primer numero: ");
       float a = ingreso.nextFloat();

       System.out.print("digite el numero de la operacion que desea realizar:  ");
       operacion = ingreso.nextInt();
       
           switch (operacion) {
               case 1:
                   System.out.print("Digite su segundo numero:    ");
                   float b = ingreso.nextFloat();
                   calculadora1.Numero1 = a;
                   calculadora1.Numero2 = b;
                   calculadora1.Suma();
                   System.out.println(calculadora1.resultado);
                   break;
               case 2:
                   System.out.print("Digite su segundo numero:    ");
                   b = ingreso.nextFloat();
                   calculadora1.Numero1 = a;
                   calculadora1.Numero2 = b;
                   calculadora1.Resta();
                   System.out.println(calculadora1.resultado);
                   break;
               case 3:
                   System.out.print("Digite su segundo numero:  ");
                   b = ingreso.nextFloat();
                   calculadora1.Numero1 = a;
                   calculadora1.Numero2 = b;
                   calculadora1.Multiplicacion();
                   System.out.println(calculadora1.resultado);
                   break;
               case 4:
                  System.out.print("Digite su segundo numero:  ");
                   b = ingreso.nextFloat();
                   calculadora1.Numero1 = a;
                   calculadora1.Numero2 = b;
                   calculadora1.Division();
                   System.out.println(calculadora1.resultado);
                   break;
               case 5:
                   calculadora1.Numero1 = a;
                   calculadora1.Seno(a);
                   System.out.println(calculadora1.resultado);
                   Math.toDegrees(calculadora1.resultado);
                   break;
               case 6:
                   calculadora1.Numero1 = a;
                   calculadora1.Coseno(a);
                   System.out.println(calculadora1.resultado);
                   Math.toDegrees(calculadora1.resultado);
                   break;
               case 7:
                   calculadora1.Numero1 = a;
                   calculadora1.tangente(a);
                   System.out.println(calculadora1.resultado);
                   Math.toDegrees(calculadora1.resultado);
                   break;
               case 8:
                   System.out.print("Digite su segundo numero:  ");
                   b = ingreso.nextFloat();
                   calculadora1.Numero1 = a;
                   calculadora1.Numero2 = b;
                   calculadora1.Exponencial();
                   System.out.println(calculadora1.resultado);
                   break;
               case 9:
                   System.out.print("Digite su segundo numero:  ");
                   b = ingreso.nextFloat();
                   calculadora1.Numero1 = a;
                   calculadora1.Numero2 = b;
                   calculadora1.Raiz();
                   System.out.println(calculadora1.resultado);
                   break;
                 case 10:
                   System.out.print("Digite el porcentaje del iva:");
                   b = ingreso.nextFloat();
                   calculadora1.Numero1 = a;
                   calculadora1.Numero2 = b;
                   calculadora1.IVA();
                   System.out.println(calculadora1.resultado);
                   break;
               default:
                   break;
           }
       
      System.out.println("desea continuar?");
      continuar = ingreso.next();
       
    }while(continuar.equals("si")|| continuar.equals ("SI") || continuar.equals("Si"));
       
       
    }
    
}
