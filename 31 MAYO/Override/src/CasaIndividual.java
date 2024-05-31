public class CasaIndividual extends Inmueble{
    private double tamanoTerreno;

    public CasaIndividual(String direccion, double tamano, int numHabitaciones, double precio, double tamanoTerreno){
        super(direccion,tamano,numHabitaciones,precio);
        this.tamanoTerreno=tamanoTerreno;
    }
    public double getTamanoTerreno() {
        return tamanoTerreno;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("\n---Casa Individual---\nDireccion: "+getDireccion()+"\nTamaño: "+getTamano()+"\nPrecio: "+getPrecio()+"\nNumero Habitaciones: "+getNumHabitaciones()+"\nTamaño Terreno: "+tamanoTerreno);

    }

}
