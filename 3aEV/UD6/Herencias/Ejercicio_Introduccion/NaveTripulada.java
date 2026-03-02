public class NaveTripulada extends VehiculoEspacial 
{
    private boolean tieneSistemaSoporteVida;

    public NaveTripulada(String nombre, double velocidadMaxima, int capacidadTripulacion, boolean tieneSistemaSoporteVida)
    {
        super(nombre, velocidadMaxima, capacidadTripulacion);
        this.tieneSistemaSoporteVida = tieneSistemaSoporteVida;
    }

    @Override
    public void despegar()
    {
        System.out.println("La nave tripulada " + super.nombre + " iniciam isión con +tripulación.");
    }
}
