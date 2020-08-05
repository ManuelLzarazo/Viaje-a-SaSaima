
package viaje.a.sasaima;

import java.util.Scanner;

public class ViajeASaSaima {

   
    public static void main(String[] args) {
     
        Scanner Teclado =new Scanner(System.in);

        double Ck =78.5;

        double Cpc =0;
        
        double Cgk =0;

        double Tkt =0; 

        double Pg =10000;
        
        double Cv =0;
        
        double Tg= 0;
        
        double Cgc=0;

         
    System.out.println("Digite la capacidad de carga del camión en kilos");
            Cpc = Teclado.nextInt();
       

    System.out.println("Digite Cuantos galones por Kilometro consume su camión");
            Cgk = Teclado.nextInt();
            
    System.out.println("Digite Cuantos kilos de mercacia necesita transportar");
            Tkt = Teclado.nextInt();
            
            if (Tkt>Cpc){
                Cv = (double)(Tkt/Cpc);
            System.out.println("la cantidad de viajes a realizar para transportar la mercancia es"+Cv);
            }
            if (Tkt<Cpc){
                Cv = (double)(1);
            System.out.println("la cantidad de viajes a realizar para transporta la mercancia es"+Cv);
            }

          Tg = (double)(Cv*Ck)/Cgk;
          System.out.print(" El total de galones a consumir para transportar la mercancia es"+Tg);
          System.out.println("Galones de gasolina");
          
          Cgc = (double)(Tg*Pg);
          System.out.print("El costo de los galones que se requieren para transportar la mercancia es"+Cgc);
          System.out.print("pesos");
       
     }

    }

        
        
 
