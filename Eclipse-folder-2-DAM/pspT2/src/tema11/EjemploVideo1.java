/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovideo1;

import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco Jesús Delgado Almirón
 */
public class EjemploVideo1 {

    /**
     * Esta función calcula la diferencia en segundos entre dos fechas
     * @param tiempoinicio Tiempo de inicio
     * @param tiempofin Tiempo final
     * @return Diferencia en segundos entre tiemponicio y tiempofinal
     */
    private static float diferenciaSegundosTiempo(Date tiempoinicio, Date tiempofin) 
    {
        // Calculamos la diferencia de las fechas en segundos
        float segundos = (float) ((tiempofin.getTime() / 1000) - (tiempoinicio.getTime() / 1000));

        if (segundos > 60) 
        {
            segundos = segundos / 60;
        }

        return segundos;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try 
        {
            // Obtenemos la fecha inicial
            Date inicio = Calendar.getInstance().getTime();

            // Dormimos el programa 1 segundo
            sleep(2000);

            // Obtenemos la fecha final
            Date fin = Calendar.getInstance().getTime();

            // Mostramos la diferencia en segundos entre las dos fechas
            System.out.println("La diferencia en segundos es: " + diferenciaSegundosTiempo(inicio, fin));
        } 
        catch (InterruptedException ex) 
        {
            Logger.getLogger(EjemploVideo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
