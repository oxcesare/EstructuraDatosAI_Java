package com.mx.curso.unidad2.ordenamiento.quickSort;

public class QuickSortEscenario2 {

    // Método principal que inicia el proceso de ordenamiento
    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    // Método recursivo que implementa la lógica de divide y vencerás
    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            // 'pi' es el índice de partición, arr[pi] ya está en el lugar correcto
            int pi = partition(arr, low, high);

            // Ordena recursivamente los elementos antes de la partición
            sort(arr, low, pi - 1);

            // Ordena recursivamente los elementos después de la partición
            sort(arr, pi + 1, high);
        }
    }

    // Método que realiza la partición del arreglo
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Tomamos el último elemento como pivote
        int i = (low - 1); // Índice del elemento más pequeño

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor que el pivote
            if (arr[j] < pivot) {
                i++;

                // Intercambio de arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambio del pivote con el elemento en el índice i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] datos ={15,4,5,15,3,2,18,20,12,3,18,18,17,10,18};

        System.out.println("Arreglo original:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }

        quickSort(datos);

        System.out.println("\nArreglo ordenado:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }
    }

}
