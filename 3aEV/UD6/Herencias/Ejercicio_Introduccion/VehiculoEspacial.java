public class VehiculoEspacial 
{
    protected String nombre;
    protected double velocidadMaxima;
    protected int capacidadTripulacion;

    public VehiculoEspacial(String nombre, double velocidadMaxima, int capacidadTripulacion)
    {
        this.nombre =  nombre;
        this.velocidadMaxima = velocidadMaxima;
        this.capacidadTripulacion = capacidadTripulacion;
    }

    public void despegar()
    {
        System.out.println("El vehículo " + nombre + " está despegabdo.");
    }
    public void mostrarInformacion()
    {
        System.out.println("Nombre: " + nombre + "\nVelocidad máxima: " + velocidadMaxima + "Capacidad: " + capacidadTripulacion);
    }
}
