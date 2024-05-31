class Departamento extends Inmueble{

    private int numPiso;

    public Departamento(String direccion, double tamano, int numHabitaciones, double precio, int numPiso){
        super(direccion,tamano,numHabitaciones,precio);
        this.numPiso=numPiso;
    }

    public int getNumPiso() {
        return numPiso;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("\n---Departamento---\n"+"Direccion: "+getDireccion()+"\nTamaño: "+getTamano()+"\nPrecio: "+getPrecio()+"\nNumero Habitaciones: "+getNumHabitaciones()+"\nNúmero de Piso: "+numPiso);

    }


}
