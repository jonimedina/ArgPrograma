package GuiaEjercicio1;
public class testingD {

    public static void main(String[] args) {
        
        int numeroInicio = 5;
        int numeroFin = 14;
        
        for (int i = numeroFin ; i >= numeroInicio; i--){
                if (numeroFin%2 == 0){
                    System.out.println (numeroFin);
                    numeroFin--;
                } else {
                    numeroFin--;
                }
        }
    }
}
