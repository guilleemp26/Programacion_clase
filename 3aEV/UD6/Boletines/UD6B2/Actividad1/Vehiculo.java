public class Vehiculo 
{
    protected String marca;
    protected String modelo;
    protected int anyoFabricacion;
    private static final double PRECIO_INICIAL = 80; 

    public Vehiculo(String marca, String modelo, int anyoFabricacion)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
    }

    public double calcularPrecio()
    {
        return PRECIO_INICIAL;
    }

    public void mostrarInfo()
    {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAño de fabriación: " + anyoFabricacion);
    }
}
