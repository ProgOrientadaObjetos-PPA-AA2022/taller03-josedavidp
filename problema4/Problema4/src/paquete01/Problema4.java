/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;
import paquete02.Celulares;
/**
 *
 * @author josed
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celulares c1 = new Celulares();
        Celulares c2 = new Celulares();

        c1.establecerSistemaOperativo("Android");
        c1.establecerTamanioPantalla(5.5);
        c1.establecerCostoInicial(1000);
        c1.establecerIvaPorcentaje(16);
        c1.establecerIvaCostoInicial();
        c1.establecerMac("00:00:00:00:00:00");
        c1.establecerImei(123456789);
        c1.establecerCostoFinal();

        c2.establecerSistemaOperativo("iOS");
        c2.establecerTamanioPantalla(4.5);
        c2.establecerCostoInicial(500);
        c2.establecerIvaPorcentaje(16);
        c2.establecerIvaCostoInicial();
        c2.establecerMac("M2:D0:C8:0G:2E:00");
        c2.establecerImei(987654321);
        c2.establecerCostoFinal();

        System.out.printf("El sistema operativo de c1 es: %s\nEl tamaño de "
                + "pantalla es de: %.2f\nEl costo inicial es de: %.2f\nEl "
                + "iva es de: %.2f\nEl iva del costo inicial es de: %.2f\nLa "
                + "mac es de: %s\nEl imei es de: %d\nEl costo final es de: %.2f\n", 
                c1.obtenerSistemaOperativo(), 
                c1.obtenerTamanioPantalla(), 
                c1.obtenerCostoInicial(), 
                c1.obtenerIvaPorcentaje(), 
                c1.obtenerIvaCostoInicial(), 
                c1.obtenerMac(), 
                c1.obtenerImei(), 
                c1.obtenerCostoFinal());
        System.out.println("---------------------------------------------");
        System.out.printf("El sistema operativo de c2 es: %s\nEl tamaño de "
                + "pantalla es de: %.2f\nEl costo inicial es de: %.2f\nEl "
                + "iva es de: %.2f\nEl iva del costo inicial es de: %.2f\nLa "
                + "mac es de: %s\nEl imei es de: %d\nEl costo final es de: %.2f\n", 
                c2.obtenerSistemaOperativo(), 
                c2.obtenerTamanioPantalla(), 
                c2.obtenerCostoInicial(), 
                c2.obtenerIvaPorcentaje(), 
                c2.obtenerIvaCostoInicial(), 
                c2.obtenerMac(), 
                c2.obtenerImei(), 
                c2.obtenerCostoFinal());
    }
    
}
