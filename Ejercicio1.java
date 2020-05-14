
/**
 * Write a description of class Ejercicio4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1
{
//Metodo con un parametro entero
    public String Serie (int  x){
     //Declaracion de las variables 
     int cont=2;
     String salida="";
     int y = 0;
     //Condicion de un numero positivo   
     if(x<=0) return String.valueOf(x);
     else{
         //Condicion para el primer digito con el que comenzara la serie con una variable auxiliar
         if(x%2 > 0 ){ 
         x=x*2;  
         y=x;
        }
        System.out.println("Ya pase esta primera parte");
         //Ciclo para realizar la serie requiere un axuliar contador y se realizara mientras que contador sea mayor a 1
         while(cont>1){
             cont=x;
             x=x/2;
             //Accion si es un numero par
             if(x%2 == 0  && x>=1){
                 salida = salida+" "+String.valueOf(cont);

             }else{
                //Numero impar y por si el numero dado es impar
                 if(cont==y){
                salida = salida+" "+String.valueOf(x);
              }
                else{
                salida = salida+" "+String.valueOf(cont)+" "+String.valueOf(x);
             }
                if(x>1)
                x=(x+cont)+1;
                else
                cont=1;
            }
        }

        }
        return salida;
}
}
