import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EjemploArrayList
{
    public static void main(String[] args)
    {
        // ==================================================
        // 1. DECLARACIÓN (buena práctica)
        // ==================================================

        // Programar contra la interfaz
        List<String> cientificas = new ArrayList<>();


        // ==================================================
        // 2. INSERTAR ELEMENTOS
        // ==================================================

        cientificas.add("Marie Curie");
        cientificas.add("Ada Lovelace");
        cientificas.add("Rosalind Franklin");
        cientificas.add("Katherine Johnson");

        System.out.println("Lista inicial:");
        System.out.println(cientificas);


        // Insertar en una posición concreta
        cientificas.add(1, "Jane Goodall");

        System.out.println("\nDespués de insertar en índice 1:");
        System.out.println(cientificas);


        // ==================================================
        // 3. ACCESO A ELEMENTOS
        // ==================================================

        String primera = cientificas.get(0);

        System.out.println("\nPrimera científica:");
        System.out.println(primera);


        // ==================================================
        // 4. MODIFICAR ELEMENTOS
        // ==================================================

        cientificas.set(2, "Barbara McClintock");

        System.out.println("\nDespués de modificar un elemento:");
        System.out.println(cientificas);


        // ==================================================
        // 5. BUSCAR ELEMENTOS
        // ==================================================

        boolean existe = cientificas.contains("Ada Lovelace");

        System.out.println("\n¿Está Ada Lovelace?");
        System.out.println(existe);

        int posicion = cientificas.indexOf("Katherine Johnson");

        System.out.println("Katherine Johnson está en índice:");
        System.out.println(posicion);


        // ==================================================
        // 6. ELIMINAR ELEMENTOS
        // ==================================================

        // eliminar por valor
        cientificas.remove("Jane Goodall");

        // eliminar por índice
        cientificas.remove(0);

        System.out.println("\nDespués de eliminar elementos:");
        System.out.println(cientificas);


        // ==================================================
        // 7. ITERACIÓN CON FOR CLÁSICO
        //    ¿Cuándo usar?: se necesita acceso al índice
        // ==================================================

        System.out.println("\nIteración con for clásico:");

        for (int i = 0; i < cientificas.size(); i++)
        {
            String cientifica = cientificas.get(i);

            System.out.println("Índice " + i + ": " + cientifica);
        }


        // ==================================================
        // 8. ITERACIÓN CON FOREACH
        //    ¿Cuándo usar?: solo quieres recorrer la colección y no necesitas el índice
        // ==================================================

        System.out.println("\nIteración con foreach:");

        for (String cientifica : cientificas)
        {
            System.out.println(cientifica);
        }


        // ==================================================
        // 9. ITERACIÓN CON ITERATOR
        //    ¿Cuándo usar?: necesitas eliminar elementos mientras recorres la lista 
        // ==================================================

        System.out.println("\nIteración con Iterator:");

        Iterator<String> it = cientificas.iterator();

        while (it.hasNext())
        {
            String cientifica = it.next();
            System.out.println(cientifica);
        }


        // ==================================================
        // 10. ELIMINAR DURANTE ITERACIÓN
        // ==================================================

        Iterator<String> it2 = cientificas.iterator();

        while (it2.hasNext())
        {
            String cientifica = it2.next();

            if (cientifica.equals("Ada Lovelace"))
            {
                it2.remove();
            }
        }

        System.out.println("\nDespués de eliminar Ada Lovelace:");
        System.out.println(cientificas);


        // ==================================================
        // 11. ORDENAR LA LISTA
        // ==================================================

        Collections.sort(cientificas);

        System.out.println("\nLista ordenada alfabéticamente:");
        System.out.println(cientificas);


        // ==================================================
        // 12. INVERTIR ORDEN
        // ==================================================

        Collections.reverse(cientificas);

        System.out.println("\nLista en orden inverso:");
        System.out.println(cientificas);


        // ==================================================
        // 13. INFORMACIÓN DE LA LISTA
        // ==================================================

        System.out.println("\nNúmero de elementos:");
        System.out.println(cientificas.size());

        System.out.println("¿La lista está vacía?");
        System.out.println(cientificas.isEmpty());


        // ==================================================
        // 14. LIMPIAR LA LISTA
        // ==================================================

        cientificas.clear();

        System.out.println("\nLista después de clear():");
        System.out.println(cientificas);
    }
}