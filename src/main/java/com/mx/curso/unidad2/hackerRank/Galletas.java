package com.mx.curso.unidad2.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Galletas {

    public static int cookies(int k, List<Integer> A) {
        //recibir la lista A y ordenarla
        A.sort(Integer::compareTo);
        System.out.println(A);
        int[] arregloMenores = new int[2];
        int l = 0;
        int iteraciones = 0;
        List<Integer> g = new ArrayList<>();

        //iterar lista lista ordenada buscando los dos elementos menos a k
        for (int i = 0; i < A.size(); i++) {
            //segunda iteracion
            for (int j = 0; j < A.size(); j++) {
                if (A.get(0) < k && l <= 1) {
                    g.add(A.get(0));
                    A.remove(0);
                    l++;
                } else if (g.size() <= 0) {
                    break;
                } else {
                    //realizar las operaciones
                    int n1 = g.get(0) * 1;
                    int n2 = g.get(1) * 2;
                    int nuevaGalleta = n1 + n2;

                    //agregar las nuevas galletas a la lista
                    A.add(nuevaGalleta);
                    //Ordeno la lista nuevamente
                    A.sort(Integer::compareTo);
                    l = 0;
                    g.clear();
                    iteraciones++;
                    break;
                }
            }
        }
        return iteraciones;
    }



    public static void main(String[] args) {
        List<Integer> galletas = new ArrayList<>();
        galletas.add(2);
        galletas.add(7);
        galletas.add(3);
        galletas.add(6);
        galletas.add(4);
        galletas.add(6);

        System.out.println(Galletas.cookies(9, galletas));
    }
}
