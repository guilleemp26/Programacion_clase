public class Main
{
    public static void main(String[] args)
    {
        // Crear el taller
        TallerDeSanta taller = new TallerDeSanta("Taller Mágico", "Polo Norte");

        // Crear un elfo
        Elfo elfo1 = new Elfo("Frodo", "mañana");
        elfo1.presentarse();

        // Fabricar algunos juguetes
        Juguete j1 = elfo1.fabricarJuguete("RoboExplorador", "Plástico reciclado", 29.99, 8);
        Juguete j2 = elfo1.fabricarJuguete("Estrella Cósmica", "Metal y plástico", 34.20, 10);

        // Agregar juguetes al taller
        taller.agregarJuguete(j1);
        taller.agregarJuguete(j2);

        // Mostrar inventario completo
        System.out.println();
        taller.mostrarInventario();

        // Mostrar el valor total
        double total = taller.calcularValorTotal();
        System.out.println("Valor total de los juguetes: " + total + " €");

        // Aplicar descuento navideño al primer juguete
        System.out.println();
        j1.aplicarDescuento(10);
    }
}