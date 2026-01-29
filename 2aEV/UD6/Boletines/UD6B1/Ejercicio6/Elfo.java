public class Elfo 
{
    private String nombre;
    private String turno;

    public Elfo(String nombre, String turno)
    {
        this.nombre = nombre;
        this.turno = turno;
    }

    public Juguete fabricarJuguete(String nombre, String material, double precio, int edadRecomendada )
    {
        return (new Juguete(nombre, material, precio, edadRecomendada));
    }

    public void presentarse()
    {
        System.out.println("Hola, soy el elfo " + nombre + " y trabajo en el turno de " + turno);
    }


}
