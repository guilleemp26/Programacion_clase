import java.util.ArrayList;

public class Empresa 
{
    private String nombre;
    ArrayList<Proyecto> listaProyectos = new ArrayList<Proyecto>();
    
    public Empresa(String nombre)
    {
        this.nombre = nombre;
    }

    public void asignarProyecto(Proyecto proyecto)
    {
        listaProyectos.add(proyecto);
        System.out.println("Se ha añadido el proyecto a la empresa");
    }

    public void listarProyectos()
    {
        for (Proyecto proyecto : listaProyectos)
        {
            System.out.println(proyecto + "\n");
        }
    }
}


