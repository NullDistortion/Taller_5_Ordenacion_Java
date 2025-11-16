package ed.u2.sorting;

//Aqui se van a comparar de dos en dos y se van a ir arreglando
public final class BubbleSort {

    private BubbleSort() {}

    public static void sort(int[] arreglo, boolean mostrar) {

        for (int pasada = 0; pasada < arreglo.length - 1; pasada++) {

            boolean huboCambio = false;

            if (mostrar) {
                System.out.println("Pasada " + (pasada + 1) + ": revision de numeros...");
            }

            for (int i = 0; i < arreglo.length - 1 - pasada; i++) {

                if (arreglo[i] > arreglo[i + 1]) {

                    if (mostrar) {
                        System.out.println("Intercambio " + arreglo[i] +
                                " con " + arreglo[i + 1]);
                    }

                    int aux = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = aux;

                    huboCambio = true;
                }
            }

            if (mostrar) {
                System.out.print("Estado del arreglo: ");
                SortingUtils.printArray(arreglo);
                System.out.println();
            }

            if (!huboCambio) {
                if (mostrar) {
                    System.out.println("El Dataset ya no tiene mas cambios");
                }
                break;
            }
        }
    }
}
