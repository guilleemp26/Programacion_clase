public class Escenario
{
    private static final int MAX_ARTISTAS = 5;
    private String nombre;
    private Artista[] artistas;
    private int numArtistas = 0;
      
    public Escenario(String nombre)
    {
        setNombre(nombre);
        artistas = new Artista[MAX_ARTISTAS];
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre.trim();
    }

    public boolean addArtista(Artista artista)
    {
        boolean anyadido = false;
        if(numArtistas < MAX_ARTISTAS && buscarArtista(artista.getNombreArtistico()) == null)
        {
            this.artistas[numArtistas] = artista;
            numArtistas++;
            anyadido = true;
        }
        return anyadido;
    }
    public Artista buscarArtista(String nombre)
    {
        boolean encontrado = false;
        int posicionEncontrada = -1;
        for(int i = 0; i < numArtistas; i++)
        {
            if(artistas[i].getNombreArtistico().equalsIgnoreCase(nombre))
            {
                encontrado = true;
                posicionEncontrada = i;
            }
        }
        if(encontrado)
        {
            return artistas[posicionEncontrada];
        }
        else
        {
            return null;
        }
    }
    public String getNombresArtistas()
    {
        String listaArtistas = "";
        for(int i = 0; i < numArtistas; i++)
        {
            listaArtistas += artistas[i].getNombreArtistico().toUpperCase() + (i != (numArtistas - 1) ? ", " : "");
        }
        return listaArtistas;
    }
    public String toString()
    {
        String datosEscentario = "Escenario: " + nombre + "\nArtistas: " + getNombresArtistas();

        return datosEscentario;
    }
}
