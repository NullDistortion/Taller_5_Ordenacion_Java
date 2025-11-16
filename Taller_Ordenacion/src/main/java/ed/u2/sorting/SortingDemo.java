package ed.u2.sorting;

import java.util.Scanner;

public class SortingDemo {

    //Arreglos que se van a escoger en la consola
    private static final int[][] DATASETS = {
            {8, 3, 6, 3, 9},     // A
            {5, 4, 3, 2, 1},     // B
            {1, 2, 3, 4, 5},     // C
            {2, 2, 2, 2},        // D
            {9, 1, 8, 2}         // E
    };

    private static final String[] NAMES = {"A", "B", "C", "D", "E"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[--------MENU PARA LA ORDENACION --------]");
            System.out.println("1. InsertionSort");
            System.out.println("2. SelectionSort");
            System.out.println("3. BubbleSort");
            System.out.println("4. Ejecutar los tres");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 5) break;

            System.out.println("\nElige un dataset:");
            for (int i = 0; i < NAMES.length; i++) {
                System.out.println((i + 1) + ". Dataset " + NAMES[i]);
            }
            System.out.print("Opción: ");
            int d = sc.nextInt() - 1;

            System.out.println("\n=== Dataset " + NAMES[d] + " ===");
            System.out.print("Original: ");
            SortingUtils.printArray(DATASETS[d]);
            System.out.println("\n");

            int[] copia;

            switch (opcion) {
                case 1:
                    System.out.println("-- InsertionSort --");
                    copia = SortingUtils.copyOf(DATASETS[d]); //copiara el arreglo original
                    InsertionSort.sort(copia, true);
                    System.out.print("Resultado: ");
                    SortingUtils.printArray(copia);
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("-- SelectionSort --");
                    copia = SortingUtils.copyOf(DATASETS[d]);
                    SelectionSort.sort(copia, true);
                    System.out.print("Resultado: ");
                    SortingUtils.printArray(copia);
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("-- BubbleSort --");
                    copia = SortingUtils.copyOf(DATASETS[d]);
                    BubbleSort.sort(copia, true);
                    System.out.print("Resultado: ");
                    SortingUtils.printArray(copia);
                    System.out.println("\n");
                    break;

                case 4:
                    ejecutarTodos(DATASETS[d]);
                    break;
            }
        }
    }

    //Va a dar todos los metodos de la Seleccion que hizo el usuario
    private static void ejecutarTodos(int[] original) {
        int[] a1 = SortingUtils.copyOf(original);
        System.out.println("[-- InsertionSort --]");
        InsertionSort.sort(a1, true);
        System.out.println();

        int[] a2 = SortingUtils.copyOf(original);
        System.out.println("[-- SelectionSort --]");
        SelectionSort.sort(a2, true);
        System.out.println();

        int[] a3 = SortingUtils.copyOf(original);
        System.out.println("[-- BubbleSort --]");
        BubbleSort.sort(a3, true);
        System.out.println();
    }
}
