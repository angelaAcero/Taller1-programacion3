/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

/**
 *
 * @author amace
 */
public class CALCULADORA {
 
    //atributos
    public float Numero1, Numero2, resultado;
    
    //Metodos
    
    public void Suma(){
        
        resultado = Numero1 + Numero2;
    }
    
     public void Resta(){
         
         resultado = Numero1 - Numero2;
    }
      public void Multiplicacion(){
          
         resultado = Numero1 * Numero2;
    }
       public void Division(){
           
         resultado = Numero1 / Numero2;
    }
        public void Exponencial(){
            
        resultado = (float)Math.pow(Numero1 ,Numero2);
    }
     public void Raiz(){
         
         resultado = (float)Math.pow(Numero2 ,1.0/ Numero1);
    }
    public void Seno(double a){
        
        resultado = (float)Math.sin(a);
    }
    public void Coseno(double a){
        
        resultado = (float)Math.cos(a);
        
    }
    public void tangente(double a){
    
        resultado = (float)Math.tan(a);
        
    }
     public void IVA(){
    
        resultado = (Numero1*Numero2)/100;
        
    }
}
