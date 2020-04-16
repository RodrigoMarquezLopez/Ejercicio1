public class Ejercicio1
{
    
    public String Serie (int  x){
     int cont;
     String salida="";
        if(x<0) return String.valueOf(x);
     else{
         while(x>=1){
            cont =x;
            x=x/2;
            if(x%10 > 0 && x!=26 && (x>10 && x%2>0)){
                 salida=salida+ " "+String.valueOf(cont)+ " "+ String.valueOf(x);
                 x=(x+cont)+1;
            } else{
                salida=salida+" "+String.valueOf(cont);
            }
            }
        }
            return salida;
        }
  }
