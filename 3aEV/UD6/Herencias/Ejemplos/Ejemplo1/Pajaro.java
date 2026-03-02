public class Pajaro extends Animal
{
    private double envergadura;
    private boolean puedeVolar;

    public Pajaro(String nombre, int edad, double envergadura, boolean puedeVolar)
    {   
        super(nombre, edad);
        this.envergadura = envergadura;
        this.puedeVolar = puedeVolar;
    }

    


    public void volar()
    {
        System.out.println(nombre + (puedeVolar ? "Ha empezado a volar" : "No puede volar"));
    }

    @Override
    public void hacerSonido()
    {
        System.out.println(nombre + "dice...\"PIOPIOPIOPIOPIOPIOOOOOOO\"");
    }

    @Override
    public void mostrarInfo()
    {
        super.mostrarInfo();
        System.out.println("Envergadura: " + envergadura);
        System.out.println("Puede volar: " + (puedeVolar ? "Sí" : "No"));
    }
}
