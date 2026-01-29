import java.util.ArrayList;

public class Ordenador 
{
    private String marca;
    ArrayList<Componente> componentes;

    public Ordenador(String marca)
    {
        this.marca = marca;
        componentes = new ArrayList<Componente>();
    }

    public void anyadirComponente(String nombre, double consumoWatts)
    {
        Componente componente = new Componente(nombre, consumoWatts);
        componentes.add(componente);
    }

    public double calcularConsumoTotal()
    {
        double consumoTotal = 0;

        for (Componente componente : componentes)
        {
            consumoTotal += componente.getConsumo();
        }

        return consumoTotal;
    }

    public void mostrarComponentes()
    {
        for (Componente componente : componentes)
        {
            System.out.println(componente);
        }
    }
}
