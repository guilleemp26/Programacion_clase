public class Main 
{
    public static void main(String[] args) 
    {
        Mascota mascota1 = new Mascota("Picota", "Labrador", 10);
        Mascota mascota2 = new Mascota("Rifki", "Bichon Maltes", 12);

        System.out.println("");
        mascota1.mostrarInfo();
        System.out.println("");
        mascota2.mostrarInfo();
    }
}
