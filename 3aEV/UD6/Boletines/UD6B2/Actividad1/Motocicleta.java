public class Motocicleta extends Vehiculo 
{
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int anyoFabricacion, int cilindrada)
    {
        super(marca, modelo, anyoFabricacion);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularPrecio()
    {
        return (super.calcularPrecio() + (cilindrada / 50));
    }

    @Override
    public void mostrarInfo()
    {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada);
    }

}
