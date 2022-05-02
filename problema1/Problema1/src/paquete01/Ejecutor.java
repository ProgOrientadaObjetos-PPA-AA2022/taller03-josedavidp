/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;
import paquete02.Terreno;

/**
 *
 * @author josed
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Terreno a = new Terreno();
        Terreno b = new Terreno();

        Double valorMetroCuadrado = 50.0;
        Double ancho = 50.0;
        Double largo = 100.0;

        a.establecerAncho(ancho);
        a.establecerLargo(largo);
        a.establecerValorMetroCuadrado(valorMetroCuadrado);
        a.calcularArea();
        a.calcularCosto_terreno();

        System.out.printf("El ancho del terreno es: %.2f\nEl largo del terreno"
                + " es: %.2f\nEl valor del metro cuadrado es: %.2f\nEl área"
                + " del terreno es: %.2f\nEl costo del terreno"
                + " es: %.2f\n", a.obtenerAncho(), a.obtenerLargo(), 
                a.obtenerValorMetroCuadrado(), a.obtenerArea(), 
                a.obtenerCosto_terreno());
        System.out.println("----------------------------------------------");
        
        b.establecerAncho(25);
        b.establecerLargo(75);
        b.establecerValorMetroCuadrado(12);
        b.calcularArea();
        b.calcularCosto_terreno();

        System.out.printf("El ancho del terreno 2 es: %.2f\nEl largo del terreno 2"
                + " es: %.2f\nEl valor del metro cuadrado es: %.2f\nEl área"
                + " del terreno 2 es: %.2f\nEl costo del terreno 2"
                + " es: %.2f\n", b.obtenerAncho(), b.obtenerLargo(), 
                b.obtenerValorMetroCuadrado(), b.obtenerArea(), 
                b.obtenerCosto_terreno());
    }
    
}
