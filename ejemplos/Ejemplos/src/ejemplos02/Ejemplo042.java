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
public class Ejemplo042 {

    public static void main(String[] args) {
        // 
        
        int [][] arreglo1 = {{1,2,3}, {3,2,4}, {2,6,2}};
        int [][] arreglo2 = {{1,2,3}, {2,2,2}, {3,1,2}};
        int [][] arreglo3 = new int[3][3];
        int [][] arreglo4 = new int[3][3];
        
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo3[i][j] = obtenerMultiplicacion(arreglo1[i][j], 
                        arreglo2[i][j]);
            }
        }
        
        // Este ciclo repetitivo se encargar de guardar los valores al arreglo4
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                // En esta linea de codigo se llama a la funcion obtenerSuma para
                // que tome los valores dados y guarde el resultado en el arreglo4
                arreglo4[i][j] = obtenerSuma(arreglo1[i][j], 
                        arreglo2[i][j],arreglo3[i][j]);
            }
        }
        
        // Aqui se presenta por pantalla las tablas
        System.out.printf("%s\n",obtenerReporte(arreglo1));
        System.out.printf("%s\n",obtenerReporte(arreglo2));
        System.out.printf("%s\n",obtenerReporte(arreglo3));
        System.out.printf("%s\n",obtenerReporte(arreglo4));
    }
    
    public static String obtenerReporte(int[][] arreglo1){
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        return cadena;
    }
    
    public static int obtenerMultiplicacion(int a, int b){
        int operacion;
        operacion = a * b;
        return operacion;
        
    }
    
    // Esta funcion se encarga de obtener los valores de los 3 arreglos para
    // sumarlos y retornar el resultado
    public static int obtenerSuma(int a, int b,int c){
        int operacion;
        operacion = a + b + c;
        return operacion;
        
    }
}
