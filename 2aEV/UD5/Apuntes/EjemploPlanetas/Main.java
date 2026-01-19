public class Main
{
    public static void main(String[] args)
    {
        Planeta tierra = new Planeta("Tierra", 5.972e24, 2);

        Satelite luna = new Satelite("Luna", 27.3, 384400);
        Satelite satEliteFicticio = new Satelite("Selene II", 12.1, 250000);

        tierra.agregarSatelite(luna);
        tierra.agregarSatelite(satEliteFicticio);

        tierra.mostrarDetalles();

        System.out.println(luna.toString());
    }
}
