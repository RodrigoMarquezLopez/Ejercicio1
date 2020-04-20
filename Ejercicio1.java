public class Ejercicio1
{
    //Metodo con un parametro entero
    public String Serie (int  x){
     //Declaracion de las variables 
     int cont;
     String salida="";
     //Condicion de un numero positivo   
     if(x<=0) return String.valueOf(x);
     else{
         //Condicion para el primer digito con el que comenzara la serie con una variable auxiliar
         if((x%10 > 0 && x!=26 && (x > 10 && x%2>0))||x==5)x=x*2; int y=x;
         //Ciclo para realizar la serie requiere un axuliar contador y se realizara mientras que x sea mayor a 1
         while(x>=1){
            cont =x;
            x=x/2;
            //Condicional para realizar una operacion diferente dependiendo del valor de x
            if((x%10 > 0 && x!=26 && (x > 10 && x%2>0))||x==5){
                //Condicion para no imprimir el valor de x cambido en caso de que cumpla con la segunada condicion
                if(cont == y){
                    salida= String.valueOf(x);
                 
                }else{ 
                  salida=salida+ " "+String.valueOf(cont)+ " "+ String.valueOf(x);
                  
                }
                //Reasignacion de x
                x=(x+cont)+1;
            } else{
                salida=salida+" "+String.valueOf(cont);
            }
            }
        }
            return salida;
        }
  }
