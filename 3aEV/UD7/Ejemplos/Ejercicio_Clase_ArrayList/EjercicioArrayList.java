import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjercicioArrayList 
{
    public static void main(String[] args) 
    {
        List<String> nombresAlumnos = new ArrayList<>();
        nombresAlumnos.add("Guillem");
        nombresAlumnos.add("Jackson");
        nombresAlumnos.add("Alexis");
        nombresAlumnos.add("Raúl");
        nombresAlumnos.add("Saray");

        System.out.println("Alumnos: ");
        for(String alumno : nombresAlumnos)
        {
            System.out.println(alumno);
        }
        System.out.println("");
        System.out.println("Cantidad de alumnos: ");
        System.out.println(nombresAlumnos.size());

        Iterator<String> it = nombresAlumnos.iterator();

        while (it.hasNext()) 
        {
            String nombre =  it.next();
            
            if(nombresAlumnos.equals("Guillem"))
            {
                it.remove();
                System.out.println("Nombre eliminado");
            }
        }
        System.out.println("Mostrando lista actualizada...");
        System.out.println("Alumnos: ");
        for(String alumno : nombresAlumnos)
        {
            System.out.println(alumno);
        }
    }
    
}
