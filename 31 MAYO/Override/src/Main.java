
public class Main {
    public static void main(String[] args) {
        Inmueble in1= new Inmueble("AV.XXXXX",100.5,50,5000);
        in1.mostrarInformacion();
        Departamento dp1= new Departamento("Av.000000",40,15,4000,5);
        dp1.mostrarInformacion();
        CasaIndividual cs1= new CasaIndividual("Av.111111",20,4,2000,20);
        cs1.mostrarInformacion();
        Suite st1=new Suite("Av.222222",30,5,10000,true);
        st1.mostrarInformacion();

    }
}