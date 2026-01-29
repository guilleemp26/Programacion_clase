import java.util.ArrayList;

public class Equipo 
{
    private String nombre;
    private ArrayList<Jugador> jugadores;
    
    public Equipo(String nombre)
    {
        this.nombre = nombre;
        jugadores = new ArrayList<Jugador>();
    }

    public void ficharJugador(Jugador jugador)
    {
        jugadores.add(jugador);
    }

    public void mostrarPlantilla()
    {
        for (Object jugador : jugadores) 
        {
            System.out.println(jugador);    
        }
    }
}
