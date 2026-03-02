public class Perro extends Animal
{
    private String raza;
    private boolean tieneChip;

    public Perro(String nombre, int edad, String raza, boolean tieneChip)
    {
        super(nombre, edad);
        this.raza = raza;
        this.tieneChip = tieneChip;
    }

    @Override
    public void hacerSonido()
    {
        System.out.println(nombre + " dice: Guau!");
    }

    public void moverCola()
    {
        System.out.println(nombre + " está moviendo la cola.");
    }

    @Override
    public void mostrarInfo()
    {
        super.mostrarInfo();
        System.out.println("Raza: " + raza);
        System.out.println("Tiene chip: " + tieneChip);
    }
}
