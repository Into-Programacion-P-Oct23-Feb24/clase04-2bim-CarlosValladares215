/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        //  
        int[][] arregloN1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arregloN2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arregloFinal = new int[3][3];
        String acumulador1 = "";
        String acumulador2 = "";
        String acumuladorFinal = "";

        for (int f = 0; f < arregloN1.length; f++) {
            for (int c = 0; c < arregloN1[f].length; c++) {
                arregloFinal[f][c] = obtenerMultiplicacion(arregloN1[f][c],
                        arregloN2[f][c]);
            }

        }

        for (int f = 0; f < arregloN1.length; f++) {
            for (int c = 0; c < arregloN1[f].length; c++) {
                acumulador1 = String.format("%s%d  "
                        , acumulador1, arregloN1[f][c]);
                acumulador2 = String.format("%s%d  "
                        , acumulador2, arregloN2[f][c]);
                acumuladorFinal = String.format("%s%d  "
                        , acumuladorFinal, arregloFinal[f][c]);
            }
            acumulador1 = String.format("%s\n", acumulador1);
            acumulador2 = String.format("%s\n", acumulador2);
            acumuladorFinal = String.format("%s\n", acumuladorFinal);
        }

        System.out.printf("%s\n", acumulador1);
        System.out.printf("%s\n", acumulador2);
        System.out.printf("%s", acumuladorFinal);

    }

    public static int obtenerMultiplicacion(int a, int b) {
        int multiplicacion;
        multiplicacion = a * b;

        return multiplicacion;
    }

}
