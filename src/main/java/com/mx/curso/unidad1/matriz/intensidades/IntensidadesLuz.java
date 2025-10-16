package com.mx.curso.unidad1.matriz.intensidades;

public class IntensidadesLuz {

    public static void main(String[] args) {

        //Definir una matriz de 3x3
        Float[][] intensidades = {
                {121.01f,221.01f, 900.87f},
                {71.01f, 300.01f, 444.87f},
                {91.01f, 400.01f, 444.87f},
                {12.01f, 240.01f, 333.87f}
        };

        float suma=0;
        //Imprimir la matriz
        for (int i = 0; i < intensidades.length; i++) {
            for (int j = 0; j < intensidades[i].length; j++) {
                System.out.print(intensidades[i][j] + " ");
                suma = suma + intensidades[i][j];
            }
            System.out.println("");
        }

        System.out.println("Intensidad en posicion espeficica: "  +  intensidades[2][1]);
        System.out.println("La suma de las intensidades es: " + suma);
        System.out.println("Promedio de las intensidades: " + (suma / (intensidades.length * intensidades[0].length)) + "");

        // Promedio de intensidades de una cuadricula (fila)
        for (int i = 0; i < intensidades.length; i++) {
            float sumaFila = 0;
            for (int j = 0; j < intensidades[i].length; j++) {
                sumaFila += intensidades[i][j];
            }
            System.out.println("Promedio de la fila " + i + ": " + (sumaFila / intensidades[i].length));
        }
    }
}
