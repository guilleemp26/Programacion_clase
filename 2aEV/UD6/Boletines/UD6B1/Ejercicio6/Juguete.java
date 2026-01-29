public class Juguete 
{
    private String nombre;
    private String material;
    private double precio;
    private int edadRecomendada;

    public Juguete(String nombre, String material, double precio, int edadRecomendada)
    {
        this.nombre = nombre;
        this.material = material;
        this.precio = precio;
        this.edadRecomendada = edadRecomendada;
    }

    public String toString()
    {
        return "Juguete: " + nombre + "\nMaterial: " + material + "\nPrecio: " + precio + "\nEdad recomendada: " + edadRecomendada;
    }

    public double aplicarDescuento(double porcentaje)//revisar
    {
        double dividendo = porcentaje / 100;
        return precio * dividendo;
    }

    public boolean esParaNinyosPequenyos()
    {
        boolean validar = edadRecomendada <= 3 ; 
        return validar;
    }

    public double getPrecio()
    {
        return precio;
    }
}
