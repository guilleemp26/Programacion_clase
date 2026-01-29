import java.util.ArrayList;

public class TallerDeSanta 
{
    private String nombre;
    private String ubicacion;
    private ArrayList<Juguete> juguetes;
    
    public TallerDeSanta(String nombre, String ubicacion)
    {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        juguetes = new ArrayList<Juguete>();
    }

    public void agregarJuguete(Juguete juguete)
    {
        juguetes.add(juguete);
        System.out.println("Se ha añadido el juguete a la lista");
    }

    public void mostrarInventario()
    {
        for (Juguete juguete : juguetes)
        {
            System.out.println(juguete);
        }
    }

    public double calcularValorTotal()
    {
        double total = 0;

        for (Juguete juguete : juguetes) 
        {
            total+= juguete.getPrecio();
        }

        return total;
    }
}
