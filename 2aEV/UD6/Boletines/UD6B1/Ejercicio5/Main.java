public class Main 
{
    public static void main(String[] args) 
    {
        Jugador jugador1 = new Jugador("Guillem", 3, 2200);
        Jugador jugador2 = new Jugador("Jackson", 4, 3200);
        Jugador jugador3 = new Jugador("Gerardo", 5, 3500);
        
        Equipo equipo = new Equipo("ManicomioFC");

        equipo.ficharJugador(jugador1);
        equipo.ficharJugador(jugador2);
        equipo.ficharJugador(jugador3);

        System.out.println("Plantilla del equipo: ");
        System.out.println("");
        equipo.mostrarPlantilla();
    }
}
