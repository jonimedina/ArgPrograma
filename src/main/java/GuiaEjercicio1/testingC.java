package GuiaEjercicio1;

import java.util.Scanner;

public class testingC {

    public static void main(String[] args) {
        
        Scanner leerDato = new Scanner (System.in);
        
        int numeroInicio = 5;
        int numeroFin = 14;
        int opcion = 0;
        
        System.out.println ("Ingrese: \n1 - Si quiere ver los números pares\n2 - Si quiere ver los números impares");
        opcion = leerDato.nextInt();
        
        if (opcion == 1){
           
            while (numeroInicio <= numeroFin){
                if (numeroInicio%2 == 0){
                    System.out.println (numeroInicio);
                    numeroInicio++; 
                }  else {
                    numeroInicio++;
                }          
            }
        } else {
            while (numeroInicio <= numeroFin){
                if (numeroInicio%2 != 0){
                    System.out.println (numeroInicio);
                    numeroInicio++; 
                }  else {
                    numeroInicio++;
                }          
            }
        }
    }
}
