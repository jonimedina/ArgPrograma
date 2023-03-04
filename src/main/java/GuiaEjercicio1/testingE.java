package GuiaEjercicio1;
public class testingE {

    public static void main(String[] args) {
        float ingresos = 0;
        int cantVehiculos = 0;
        int cantInmuebles = 0;
        int cantEmbAeroAct =0;
        
        if (ingresos <= 489083 || 
                cantVehiculos <= 3 ||
                cantInmuebles <= 3 ||
                cantEmbAeroAct <= 1){
            System.out.println("Pertenece a sector de Ingresos Altos");
        } else {
            System.out.println("No pertenece a sector de Ingresos Altos");
        }             
    }
}
