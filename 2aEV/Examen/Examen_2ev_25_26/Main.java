public class Main 
{
    public static void main(String[] args)
	{
        corrector();
	}
	









	public static void corrector()
	{
        System.out.println("=== PRUEBAS CLASE ARTISTA ===");

        Artista a1 = new Artista("  Daft Punk  ", 25, "Electrónica", "daftpunk@gmail.com");
        System.out.print("Probando normalización de nombre... ");
        System.out.println(a1.getNombreArtistico().equals("Daft Punk") ? "OK" : "ERROR");

        Artista a2 = new Artista("Invalid Age", 10, "Pop", "invalid@domain.com");
        System.out.print("Probando edad mínima... ");
        System.out.println(a2.getEdad() == 0 ? "OK" : "ERROR");

        Artista a3 = new Artista("Muse", 30, "Rock", "muse@music.LTD");
        System.out.print("Probando email válido... ");
        System.out.println(a3.getEmailContacto().equals("muse@music.LTD") ? "OK" : "ERROR");

        Artista a4 = new Artista("Justice", 22, "Electro", "invalid_email.com");
        System.out.print("Probando email inválido... ");
        System.out.println(a4.getEmailContacto() == null ? "OK" : "ERROR");

        System.out.print("Probando toString con email no disponible... ");
        System.out.println(a4.toString().contains("Email no disponible") ? "OK" : "ERROR");

        System.out.println("\n=== PRUEBAS CLASE ESCENARIO ===");
        Escenario escenario1 = new Escenario("Main Stage");
        System.out.print("Añadiendo artista... ");
        System.out.println(escenario1.addArtista(a1) ? "OK" : "ERROR");

        System.out.print("Añadiendo artista duplicado... ");
        System.out.println(!escenario1.addArtista(a1) ? "OK" : "ERROR");

        System.out.print("Buscando artista existente... ");
        System.out.println(escenario1.buscarArtista("daft punk") == a1 ? "OK" : "ERROR");

        System.out.print("Buscando artista inexistente... ");
        System.out.println(escenario1.buscarArtista("Unknown") == null ? "OK" : "ERROR");

        System.out.print("Lista de nombres en mayúsculas con varios artistas... ");
        escenario1.addArtista(a3);
        escenario1.addArtista(a4);
        String nombresEsperados = "DAFT PUNK, MUSE, JUSTICE";
        System.out.println(escenario1.getNombresArtistas().equals(nombresEsperados) ? "OK" : "ERROR");
        System.out.println(escenario1.getNombresArtistas());

        System.out.print("toString del escenario... ");
        System.out.println(escenario1.toString().contains("Main Stage") ? "OK" : "ERROR");

        System.out.println("\n=== PRUEBAS CLASE FESTIVAL ===");
        Festival fest1 = new Festival("ElectroFest", "Madrid", 2);
        Festival fest2 = new Festival("RockNight", "Barcelona", 3);

        System.out.print("Comprobando contador de festivales... ");
        System.out.println(Festival.getTotalFestivales() == 2 ? "OK" : "ERROR");

        System.out.print("Añadiendo escenario... ");
        System.out.println(fest1.addEscenario(escenario1) ? "OK" : "ERROR");

        Escenario escenario2 = new Escenario("Second Stage");
        fest1.addEscenario(escenario2);
        System.out.print("Respetando límite de escenarios... ");
        System.out.println(!fest1.addEscenario(new Escenario("Extra Stage")) ? "OK" : "ERROR");

        System.out.print("toString del festival... ");
        System.out.println(fest1.toString().contains("ElectroFest") ? "OK" : "ERROR");
    }
}
