public class Main 
{
    public static void main(String[] args) {

        Animal a1 = new Perro("Rex", 5, "Labrador", true);
        Animal a2 = new Gato("Michi", 3, true);
        Animal a3 = new Pajaro("Correcaminos", 25, 12, false);

        System.out.println("----- INFORMACIÓN -----");
        a1.mostrarInfo();
        System.out.println();
        a2.mostrarInfo();

        System.out.println("\n----- SONIDOS -----");
        a1.hacerSonido();
        a2.hacerSonido();

        System.out.println("\n----- POLIMORFISMO CON ARRAY -----");

        Animal[] animales = {
                new Perro("Thor", 2, "Pastor Alemán", false),
                new Gato("Luna", 1, false)
        };

        for (Animal animal : animales) {
            animal.hacerSonido();
        }

        a3.hacerSonido();
        a3.mostrarInfo();
        ((Pajaro)a3).volar();
    }
}
