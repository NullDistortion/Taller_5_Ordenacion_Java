package ed.u2.sorting;

import java.util.Arrays;
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

        boolean continuar = true;

        while (continuar) {
            System.out.println("[--------MENU PARA LA ORDENACION --------]");
            System.out.println("1. InsertionSort");
            System.out.println("2. SelectionSort");
            System.out.println("3. BubbleSort");
            System.out.println("4. Ejecutar los tres");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            String opcion = sc.nextLine().trim();

            // Validar opción del menú
            if (!opcion.matches("[1-5]")) {
                System.out.println("Opción inválida. Intente de nuevo.\n");
                continue; // repetir menú
            }

            if (opcion.equals("5")) {
                continuar = false;
                break;
            }

            // Elegir dataset
            System.out.println("\nElige un dataset:");
            for (int i = 0; i < NAMES.length; i++) {
                System.out.println((i + 1) + ". Dataset " + NAMES[i] + " " + Arrays.toString(DATASETS[i]));
            }
            System.out.print("Opción: ");

            String ds = sc.nextLine().trim();

            if (!ds.matches("[1-5]")) {
                System.out.println("Dataset inválido. Intente de nuevo.\n");
                continue;
            }

            int d = Integer.parseInt(ds) - 1;

            System.out.println("\n=== Dataset " + NAMES[d] + " ===");
            System.out.print("Original: ");
            SortingUtils.printArray(DATASETS[d]);
            System.out.println("\n");

            int[] copia;

            switch (opcion) {
                case "1":
                    System.out.println("-- InsertionSort --");
                    copia = SortingUtils.copyOf(DATASETS[d]);
                    if (!SortingUtils.inEmpty(copia)) {
                        InsertionSort.sort(copia, true);
                        System.out.print("Resultado: ");
                        SortingUtils.printArray(copia);
                        System.out.println("\n");
                    }
                    break;

                case "2":
                    System.out.println("-- SelectionSort --");
                    copia = SortingUtils.copyOf(DATASETS[d]);
                    if (!SortingUtils.inEmpty(copia)) {
                        SelectionSort.sort(copia, true);
                        System.out.print("Resultado: ");
                        SortingUtils.printArray(copia);
                        System.out.println("\n");
                    }
                    break;

                case "3":
                    System.out.println("-- BubbleSort --");
                    copia = SortingUtils.copyOf(DATASETS[d]);
                    if (!SortingUtils.inEmpty(copia)) {
                        BubbleSort.sort(copia, true);
                        System.out.print("Resultado: ");
                        SortingUtils.printArray(copia);
                        System.out.println("\n");
                    }
                    break;

                case "4":
                    ejecutarTodos(DATASETS[d]);
                    break;
            }
        }
        sc.close();
    }

    //Va a dar todos los metodos de la Seleccion que hizo el usuario
    private static void ejecutarTodos(int[] original) {
        int[] a1 = SortingUtils.copyOf(original);
        if (!SortingUtils.inEmpty(a1)) {
            System.out.println("[-- InsertionSort --]");
            InsertionSort.sort(a1, true);
            System.out.println();
        }

        int[] a2 = SortingUtils.copyOf(original);
        if (!SortingUtils.inEmpty(a2)) {
            System.out.println("[-- SelectionSort --]");
            SelectionSort.sort(a2, true);
            System.out.println();
        }

        int[] a3 = SortingUtils.copyOf(original);
        if (!SortingUtils.inEmpty(a3)) {
            System.out.println("[-- BubbleSort --]");
            BubbleSort.sort(a3, true);
            System.out.println();
        }

    }
}
