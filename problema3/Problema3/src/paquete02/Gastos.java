/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author josed
 */
public class Gastos {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosEstudiante;
    private double presupuesto;

    public void establecerNombre(String a) {
        nombre = a;
    }
    public void establecerTipoInstitucion(String a) {
        tipoInstitucion = a;
    }
    public void establecerNumeroAlumnos(int a) {
        numeroAlumnos = a;
    }
    public void establecerNumeroDocentes(int a) {
        numeroDocentes = a;
    }
    public void establecerNumeroSedes(int a) {
        numeroSedes = a;
    }
    public void establecerGastosEstudiante(double a) {
        gastosEstudiante = a;
    }
    public void establecerPresupuesto() {
        presupuesto = numeroAlumnos * gastosEstudiante;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }
    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }
    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }
    public int obtenerNumeroSedes() {
        return numeroSedes;
    }
    public double obtenerGastosEstudiante() {
        return gastosEstudiante;
    }
    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
