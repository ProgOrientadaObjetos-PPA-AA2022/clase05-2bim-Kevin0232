/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;
    // private double edadminima;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }
    
    public void establecerPromedioEdadesCualitativo() {
        if (promedioEdades >=0 && promedioEdades <=21) {
            promedioEdadesCualitativo = "Promedio jovenes.";
        }else{
            if(promedioEdades > 21){
                promedioEdadesCualitativo = " promedio Adulto."; 
            }
        }
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }
    
    public String obtenerPromediCualitativo() {

        return promedioEdadesCualitativo;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (Persona e : obtenerEstudiante()) {
            cadena = String.format("%sNombre: %s\n",
                    cadena,
                    e.obtenerNombre());
        }
        cadena = String.format("%s\nPromedio de edades: %.2f\n"
                + "Promedio Edades cualitativo: %s\n",
                cadena,
                obtenerPromedioEdades(),
                obtenerPromediCualitativo());
        return cadena;
    }
}
