public class Main 
{
    public static void main(String[] args) 
    {
        Ordenador ordenador = new Ordenador("Asus");
        
        ordenador.anyadirComponente("CPU", 5);
        ordenador.anyadirComponente("RAM", 5);
        ordenador.anyadirComponente("GPU", 5);
        ordenador.anyadirComponente("Fuente de alimentación", 5);

        System.out.println("Consumo total del ordenador: " + ordenador.calcularConsumoTotal());
        System.out.println("");
        ordenador.mostrarComponentes();
    }
}
