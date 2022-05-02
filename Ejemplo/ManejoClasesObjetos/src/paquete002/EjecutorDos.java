/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;
import paquete001.FacturaTelefono;

/**
 *
 * @author josed
 */
public class EjecutorDos {
    
    public static void main(String[] args) {
        FacturaTelefono telefono = new FacturaTelefono();
        telefono.establecerMinutosMes(200);
        telefono.establecerValorMinuto(0.20);
        telefono.establecerNumeroTelefono("0987654321");
        telefono.calcularValorFactura();
        System.out.printf("Factura de Teléfono\n\nNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\nValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", telefono.obtenerNumeroTelefono(),
                telefono.obtenerMinutosMes(), telefono.obtenerValorMinuto(),
                telefono.obtenerValorFactura());
    }
}
