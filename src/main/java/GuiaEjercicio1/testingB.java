package GuiaEjercicio1;
public class testingB {

    public static void main(String[] args) {
        
        int numeroInicio = 5;
        int numeroFin = 14;
        
        while (numeroInicio <= numeroFin){
            if (numeroInicio%2 == 0){
                System.out.println(numeroInicio);
                numeroInicio ++; 
            }  else {
                numeroInicio++;
            }          
        }
    }
}

