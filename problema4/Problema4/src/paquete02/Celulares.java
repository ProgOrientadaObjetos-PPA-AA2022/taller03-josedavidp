/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author josed
 */
public class Celulares {
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial; 
    private String mac;
    private int imei;
    private double costoFinal;

    public void establecerSistemaOperativo(String c) {
        sistemaOperativo = c;
    }
    public void establecerTamanioPantalla(double c) {
        tamanioPantalla = c;
    }
    public void establecerCostoInicial(double c) {
        costoInicial = c;
    }
    public void establecerIvaPorcentaje(double c) {
        ivaPorcentaje = c;
    }
    public void establecerIvaCostoInicial() {
        ivaCostoInicial = costoInicial * ivaPorcentaje/100;
    }
    public void establecerMac(String c) {
        mac = c;
    }
    public void establecerImei(int c) {
        imei = c;
    }
    public void establecerCostoFinal() {
        costoFinal = costoInicial + ivaCostoInicial;
    }
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }
    public double obtenerTamanioPantalla() {
        return tamanioPantalla;
    }
    public double obtenerCostoInicial() {
        return costoInicial;
    }
    public double obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }
    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }
    public String obtenerMac() {
        return mac;
    }
    public int obtenerImei() {
        return imei;
    }
    public double obtenerCostoFinal() {
        return costoFinal;
    }

}
