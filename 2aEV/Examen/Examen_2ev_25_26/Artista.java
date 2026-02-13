
import java.util.regex.Pattern;


public class Artista
{
    private String nombreArtistico;
    private int edad;
    private String genero;
    private String emailContacto;
    private static final int EDAD_MINIMA = 16;

    public Artista(String nombreArtistico, int edad, String genero, String emailContacto)
    {
        setNombreArtistico(nombreArtistico);
        setEdad(edad);
        setEmailContacto(emailContacto);
        setGenero(genero);
    }
    public Artista(String nombreArtistico, String emailContacto)
    {
        setNombreArtistico(nombreArtistico);
        setEmailContacto(emailContacto);
        edad = EDAD_MINIMA;
        genero = "Undefined";
    }

    public void setNombreArtistico(String nombreArtistico)
    {
        if(!nombreArtistico.isEmpty() && nombreArtistico != null)
        {
            this.nombreArtistico = nombreArtistico.trim();
        }
    }
    public void setEdad(int edad)
    {
        if(edad >= EDAD_MINIMA)
        {
            this.edad = edad;
        }
    }
    public void setEmailContacto(String emailContacto)
    {
        if(emalValido(emailContacto))
        {
            this.emailContacto = emailContacto;
            System.out.println("coincide");
        }
        else
        {
            System.out.println("No coincide");
        }
    }
    private boolean emalValido(String emailContacto)
    {
        String patron = "^[a-zA-Z0-9_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        boolean coincide = Pattern.matches(patron, emailContacto);
        return coincide;
    }
    public void setGenero(String genero)
    {
        if(!genero.isEmpty())
        {
            this.genero = genero;
        }
    }

    public String getEmailContacto()
    {
        return emailContacto;
    }
    public String getNombreArtistico()
    {
        return nombreArtistico;
    }
    public int getEdad()
    {
        return edad;
    }
    public String getGenero()
    {
        return genero;
    }
    public String toString()
    {
        String string = "Nombre Artista: " + nombreArtistico + "\n Edad: " + edad
        + "\n Género: " + genero + "\n Email de comtacto: " ;
        if(emailContacto == null)
        {
            string += "Email no disponible";
        }
        else
        {
            string += emailContacto;
        }
        return string;
    }
}
