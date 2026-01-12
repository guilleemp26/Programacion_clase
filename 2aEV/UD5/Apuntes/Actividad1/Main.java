public class Main 
{
    public static void main(String[] args) 
    {
        EstudioPodcast estudio1 = new EstudioPodcast();
        EstudioPodcast estudio2 = new EstudioPodcast("Estudio Clase", 33);
        EstudioPodcast estudio3 = new EstudioPodcast(32);


        System.out.println(estudio3.getNombre());
        estudio3.setNombre("Estudio UPV");
        System.out.println(estudio3.getNombre());
        System.out.println("hola");
        System.out.println(EstudioPodcast.getTotalEstudiosCreados());

        System.out.println("");

        System.out.println(EstudioPodcast.DURACION_MAXIMA_GRABACION);
    }
}
