public class Suite extends Inmueble{

    private boolean tieneJacuzzi;

    public Suite(String direccion, double tamano, int numHabitaciones, double precio, boolean tieneJacuzzi){
        super(direccion,tamano,numHabitaciones,precio);
        this.tieneJacuzzi=tieneJacuzzi;
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    public void mostrarInformacion(){
        System.out.println("\n---Suite---\nDireccion: "+getDireccion()+"\nTamaño: "+getTamano()+"\nPrecio: "+getPrecio()+"\nNumero Habitaciones: "+getNumHabitaciones()+"\nJacuzzi: "+tieneJacuzzi);

    }

}
