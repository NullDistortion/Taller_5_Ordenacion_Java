package ed.u2.sorting;

public class SortingUtils {

    // Aqui va a imprimir siempre el arreglo que esta solo en corchetas del Demo
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    // Aqui el copyOf va hacer una copia del arreglo para no modificar el original
    public static int[] copyOf(int[] arr) {
        int[] copia = new int[arr.length];
        System.arraycopy(arr, 0, copia, 0, arr.length);
        return copia;
    }

    //Verificar q el arreglo no este vaio
    public static boolean inEmpty(int[] vec) {
        if (vec.length == 0) {
            System.out.println("Arreglo Vacio\n");
            return true;
        }
        return false;
    }
}
