/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // String miCiudad = obtenerCiudadMayuscula("Loja");
        // System.out.printf("%s\n", miCiudad);
        
        // se invoca a obtenerMultipliacion poeque es un procedimiento
        // y no devuelve ningun valor
        obtenerMultiplicacion(7,50);
        
        // En este caso obtenerMultiplicacion es una funcion que devuelve un
        // valor tipo String, es por eso que que el valor devuelto es recogido
        // por la variable tipo cadena miMensaje
        String miMensaje = obtenerMultiplicacionDos(7,50);
        System.out.printf("%s\n",miMensaje);
    }
    
    // Por ahora para crear funciones deberan de tener esta estructura
    public static String obtenerCiudadMayuscula(String m){
        String m2 = m.toUpperCase();
        return m2;
    }
    
    // Generar una tabla del 7 que empieze desde 1 y vaya a 100, con acumulador
    public static void obtenerMultiplicacion(int tabla, int limite){
        int res;
        String tablaDel7 = "";
        for(int i = 1; i<=limite;i++){
            res = tabla * i;
            tablaDel7 = String.format("%s%d * %d = %d\n",tablaDel7
                    , tabla,i,res);
        }
        System.out.printf("%s",tablaDel7);
    }
    
    public static String obtenerMultiplicacionDos(int tabla, int limite){
        int res;
        String tablaDel_7 = "";
        for(int i = 1; i<=limite;i++){
            res = tabla * i;
            tablaDel_7 = String.format("%s%d * %d = %d\n",tablaDel_7
                    , tabla,i,res);
        }
        return tablaDel_7;
    }
    
    public static String obtenerNombre(){
        return "Luis";
    }
    
    
}