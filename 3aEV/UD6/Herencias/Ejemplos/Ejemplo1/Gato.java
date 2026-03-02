public class Gato extends Animal
{
    private boolean esDomestico;
    private int vidas;

    public Gato(String nombre, int edad, boolean esDomestico)
    {
        super(nombre, edad);
        this.esDomestico = esDomestico;
        this.vidas = 7;
    }

    @Override
    public void hacerSonido()
    {
        System.out.println(nombre + " dice: Miau!");
    }

    public void perderVida()
    {
        if (vidas > 0) {
            vidas--;
        }
    }

    @Override
    public void mostrarInfo()
    {
        super.mostrarInfo();
        System.out.println("Es doméstico: " + esDomestico);
        System.out.println("Vidas restantes: " + vidas);
    }
}
