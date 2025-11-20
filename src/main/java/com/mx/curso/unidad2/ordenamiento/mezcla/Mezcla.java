package com.mx.curso.unidad2.ordenamiento.mezcla;

public class Mezcla {

    // Método principal que llama al proceso recursivo de ordenamiento
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        sort(arr, 0, arr.length - 1);
    }

    // Método recursivo para dividir el arreglo
    private static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            // Divide la mitad izquierda
            sort(arr, left, mid);
            // Divide la mitad derecha
            sort(arr, mid + 1, right);
            // Fusiona las mitades
            merge(arr, left, mid, right);
        }
    }

    // Método para fusionar las dos mitades ordenadas
    private static void merge(int[] arr, int left, int mid, int right) {
        // Tamaños de los subarreglos a fusionar
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Crear arreglos temporales
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copiar datos a los arreglos temporales
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + 1 + j];
        }

        // Fusionar los arreglos temporales de vuelta al arreglo principal
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de L[] si hay
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de R[] si hay
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] datos = {4,8,1,9};

        System.out.println("Arreglo original:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }

        mergeSort(datos);

        System.out.println("\nArreglo ordenado:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }
    }
}
