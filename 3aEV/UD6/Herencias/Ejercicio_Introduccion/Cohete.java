public class Cohete extends VehiculoEspacial
{
    private int cantidadPropulsores;

    public Cohete(String nombre, double velocidadMaxima, int capacidadTripulacion, int cantidadPropulsores)
    {
        super(nombre, velocidadMaxima, cantidadPropulsores);
        this.cantidadPropulsores = cantidadPropulsores;
    }
    @Override
    public void mostrarInformacion()
    {
        super.mostrarInformacion();
        System.out.println("Cantidad de propulsores: " + cantidadPropulsores);
    }
}
