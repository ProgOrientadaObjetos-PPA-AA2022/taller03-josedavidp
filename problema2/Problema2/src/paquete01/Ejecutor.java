/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;
import paquete02.EquivalenteHora;

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
        EquivalenteHora eq1 = new EquivalenteHora();
        EquivalenteHora eq2 = new EquivalenteHora();
        
        eq1.establecerHoras(48);
        eq1.establecerMinutos();
        eq1.establecerSegundos();
        eq1.establecerDias();
        
        System.out.printf("%.2f horas equivalen a %.2f minutos, %.2f segundos y %.2f dias\n",
                eq1.obtenerHoras(), eq1.obtenerMinutos(), eq1.obtenerSegundos(), eq1.obtenerDias());
        
        double horas = 24;
        
        eq2.establecerHoras(horas);
        eq2.establecerMinutos();
        eq2.establecerSegundos();
        eq2.establecerDias();

        System.out.printf("%.2f horas equivalen a %.2f minutos, %.2f segundos y %.2f dias\n",
                eq2.obtenerHoras(), eq2.obtenerMinutos(), eq2.obtenerSegundos(), eq2.obtenerDias());
    }
    
}
