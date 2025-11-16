package ed.u2.sorting;

// Aqui debe buscar el numero menor y colocarlo en el inicio
public final class SelectionSort {

    private SelectionSort() {}

    public static void sort(int[] arreglo, boolean mostrar) {

        int cambios = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {

            int posicionDelMenor = i;

            if (mostrar) {
                System.out.println("Busqueda del numero mas pequeño desde la pocion" + i);
            }

            // Aqui va a buscar el numero menor
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[posicionDelMenor]) {
                    posicionDelMenor = j;
                }
            }

            // Aqui es para ver si encuentra un numero mas pequeño lo va a cambiar x ese
            if (posicionDelMenor != i) {
                if (mostrar) {
                    System.out.println("Intercambiando " + arreglo[i] + " con " + arreglo[posicionDelMenor]);
                }

                int aux = arreglo[i];
                arreglo[i] = arreglo[posicionDelMenor];
                arreglo[posicionDelMenor] = aux;

                cambios++;
            }

            if (mostrar) {
                System.out.print("Estado del arreglo: ");
                SortingUtils.printArray(arreglo);
                System.out.println();
            }
        }

        //Aqui debo mostrar los cambios que se hicieron en todos BUBBLE INSERTION Y SELECTION
        if (mostrar) {
            System.out.println("Los cambios que se hizo aqui son: " + cambios);
        }
    }
}
