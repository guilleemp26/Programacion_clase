public class EjemploArrayBidimensional 
{
    public static void main(String[] args)
    {
        int[][] matriz = new int[3][4];

        // Llenar la matriz con valores
        int contador = 1;

        for (int i = 0; i < matriz.length; i++) // recorrer filas
        {           
            for (int j = 0; j < matriz[i].length; j++) // recorrer columnas
            {    
                matriz[i][j] = contador;
                contador++;
            }
        }

        // Mostrar los valores en formato tabla
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println(); // salto de línea por cada fila
        }
    }
}