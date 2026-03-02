public class Animal
{
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer()
    {
        System.out.println(nombre + " está comiendo.");
    }

    public void hacerSonido()
    {
        System.out.println("El animal hace un sonido.");
    }

    public void mostrarInfo()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
