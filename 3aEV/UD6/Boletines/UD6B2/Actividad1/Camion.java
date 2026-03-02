public class Camion extends Vehiculo
{
    private int capacidadCarga;

    public Camion(String marca, String modelo, int anyoFabricacion, int capacidadCarga)
    {
        super(marca, modelo, anyoFabricacion);
        this.capacidadCarga = capacidadCarga;
    }    

    @Override
    public double calcularPrecio()
    {
        return (super.calcularPrecio() + (capacidadCarga * 10));
    }

    @Override
    public void mostrarInfo()
    {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadCarga);
    }
}
