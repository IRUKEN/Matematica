package Modulo;

import jdk.nashorn.api.tree.ForLoopTree;

public class Aritmetica{
    
    //suma de dos numeros 
    public double suma(double x,double y){
        return x+y;
    }
    //resta de dos numero 
    public double resta(double x, double y){
        return x-y;
    }
    // multiplicacion de dos numeros 
    public double multiplicacion(double x , double y){
        return x*y;
    }
    /// divicion de dos terminos 
    public double divicion(double x,double y){
        if(y!=0){
            return x/y;
        }
        return 0;
    }
    ///potencia de un un numero 
    public double potencia(double x,double y){
         double z=0;
        for(int i=1;i>=y;i++){
            z+=multiplicacion(x, x);

     }
     return z;
    }


}