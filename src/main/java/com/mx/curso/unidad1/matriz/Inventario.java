package com.mx.curso.unidad1.matriz;

public class Inventario {

    public static void main(String[] args) {

        //Definir una matriz

        Double[][] inventario = {
                {181.00, 100.00,18.87},
                {181.00, 100.00,18.87},
                {181.00, 100.00,18.87},
                {181.00, 100.00,18.87}
        };

        for( int i=0; i<inventario.length; i++){
            for( int j =0; j<inventario[i].length;j++){
                System.out.print(inventario[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
