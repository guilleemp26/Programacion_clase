public class Main
{
    public static void main(String[] args)
    {
        // Mostrar cuántas personas existen antes de crear ninguna
        System.out.println("Personas creadas inicialmente: " + Persona.obtenerContador());

        // Crear varios objetos Persona
        Persona persona1 = new Persona("Ada", 25, "Madrid");
        Persona persona2 = new Persona("Marie", 30, "Barcelona");
        Persona persona3 = new Persona("Hipatia", 22, "Valencia");

        // Mostrar cuántas personas se han creado después
        System.out.println("Personas creadas tras inicialización: " + Persona.obtenerContador());
        System.out.println("----------------------------------------------------");

        // Mostrar los datos iniciales de cada persona
        persona1.mostrarInfo();
        persona2.mostrarInfo();
        persona3.mostrarInfo();
        System.out.println("----------------------------------------------------");

        // Modificar atributos usando setters
        persona2.setCiudad("Sevilla");
        persona3.setEdad(23);
        persona3.setNombre("Marta Gómez");

        // Mostrar los cambios usando getters
        System.out.println("Datos actualizados:");
        System.out.println(persona2.getNombre() + " vive ahora en " + persona2.getCiudad());
        System.out.println(persona3.getNombre() + " tiene " + persona3.getEdad() + " años.");
        System.out.println("----------------------------------------------------");

        // Llamar a métodos de instancia
        persona1.cumplirAnyo();
        persona2.cumplirAnyo();

        // Mostrar la información final de todas las personas
        System.out.println("Estado final:");
        persona1.mostrarInfo();
        persona2.mostrarInfo();
        persona3.mostrarInfo();
        System.out.println("----------------------------------------------------");

        // Usar el método estático para mostrar el total de personas creadas
        System.out.println("Total de personas creadas: " + Persona.obtenerContador());
    }
}