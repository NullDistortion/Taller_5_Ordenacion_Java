package ed.u2.sorting;

//Aqui se van a comparar de dos en dos y se van a ir arreglando
public final class BubbleSort {

    public static void sort(int[] vector, boolean show) {

        for (int trace = 0; trace < vector.length - 1; trace++) {

            boolean change = false;

            if (show) {
                System.out.println("Pasada " + (trace + 1) + ": revision de numeros...");
            }

            for (int i = 0; i < vector.length - 1 - trace; i++) {

                if (vector[i] > vector[i + 1]) {

                    if (show) {
                        System.out.println("Intercambio " + vector[i] +
                                " con " + vector[i + 1]);
                    }

                    int aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;

                    change = true;
                }
            }

            if (show) {
                System.out.print("Estado del vector: ");
                SortingUtils.printArray(vector);
                System.out.println();
            }

            if (!change) {
                if (show) {
                    System.out.println("El Dataset ya no tiene mas cambios");
                }
                break;
            }
        }
    }
}
