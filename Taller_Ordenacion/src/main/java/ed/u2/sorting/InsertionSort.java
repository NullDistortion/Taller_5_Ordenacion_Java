package ed.u2.sorting;

// Aqui solo tomara el arreglo de donde esta y lo va a ordenar en la posicion que debe estar
public final class InsertionSort {

    private InsertionSort() {}

    public static void sort(int[] arreglo, boolean mostrar) {

        for (int i = 1; i < arreglo.length; i++) {

            int numeroActual = arreglo[i];
            int j = i - 1;

            if (mostrar) {
                System.out.println("Colocando el número " + numeroActual + " donde debe ir...");
            }

            // Aqui movemos los números que son mayores hacia la derecha
            while (j >= 0 && arreglo[j] > numeroActual) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }

            // Aqui solo va hacer para ordenarlo donde va a quedar el numero
            arreglo[j + 1] = numeroActual;

            if (mostrar) {
                System.out.print("Estado del arreglo: ");
                SortingUtils.printArray(arreglo);
                System.out.println();
            }
        }
    }
}
