/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;
import paquete02.Gastos;
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
        Gastos gastos1 = new Gastos();
        Gastos gastos2 = new Gastos();

        gastos1.establecerNombre("Universidad Técnica Particular de Loja");
        gastos1.establecerTipoInstitucion("Universidad");
        gastos1.establecerNumeroAlumnos(15000);
        gastos1.establecerNumeroDocentes(1000);
        gastos1.establecerNumeroSedes(3);
        gastos1.establecerGastosEstudiante(1000);
        gastos1.establecerPresupuesto();

        System.out.printf("El nombre de la institución 1 es: %s\n"
                + "Es de tipo: %s\n"
                + "Cuenta con %d alumnos\n"
                + "Cuenta con %d docentes\n"
                + "Cuenta con %d sedes\n"
                + "El gasto por estudiante es de %.2f\n"
                + "El presupuesto es de %.2f\n",
                gastos1.obtenerNombre(),
                gastos1.obtenerTipoInstitucion(),
                gastos1.obtenerNumeroAlumnos(),
                gastos1.obtenerNumeroDocentes(),
                gastos1.obtenerNumeroSedes(),
                gastos1.obtenerGastosEstudiante(),
                gastos1.obtenerPresupuesto());
        
        System.out.println("-------------------------------------------------");

        gastos2.establecerNombre("Unidad Educativa Fiscomisional Daniel Álvarez Burneo");
        gastos2.establecerTipoInstitucion("Fiscomisinal");
        gastos2.establecerNumeroAlumnos(25500);
        gastos2.establecerNumeroDocentes(100);
        gastos2.establecerNumeroSedes(6);
        gastos2.establecerGastosEstudiante(70);
        gastos2.establecerPresupuesto();

        System.out.printf("El nombre de la institución 2 es: %s\n"
                + "Es de tipo: %s\n"
                + "Cuenta con %d alumnos\n"
                + "Cuenta con %d docentes\n"
                + "Cuenta con %d sedes\n"
                + "El gasto por estudiante es de %.2f\n"
                + "El presupuesto es de %.2f\n",
                gastos2.obtenerNombre(),
                gastos2.obtenerTipoInstitucion(),
                gastos2.obtenerNumeroAlumnos(),
                gastos2.obtenerNumeroDocentes(),
                gastos2.obtenerNumeroSedes(),
                gastos2.obtenerGastosEstudiante(),
                gastos2.obtenerPresupuesto());
    }
    
}
