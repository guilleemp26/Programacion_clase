public class Coche extends Vehiculo
{
    private int numPuertas;

    public Coche(String marca, String modelo, int anyoFabricacion, int numPuertas)
    {
        super(marca, modelo, anyoFabricacion);
        this.numPuertas = numPuertas;
    }

    @Override
    public double calcularPrecio()
    {
        return (super.calcularPrecio() + numPuertas * 5);
    }

    @Override
    public void mostrarInfo()
    {
        super.mostrarInfo();
        System.out.println("Número de puertas: " + numPuertas);
    }
}
