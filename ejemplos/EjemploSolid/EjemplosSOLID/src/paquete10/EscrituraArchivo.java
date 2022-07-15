/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author kevin
 */
public class EscrituraArchivo {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> generadores;

    public EscrituraArchivo(String n) {
        nombreArchivo = n;
        establecerListaGeneradores();

        try {

            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (obtenerListaGeneradores().size() > 0) {
                for (int i = 0; i < obtenerListaGeneradores().size(); i++) {
                    establecerGeneradores(obtenerListaGeneradores().get(i));
                    establecerSalida();
                }
            }

        } catch (IOException IOexception) {
            System.out.println("Error al abrir el archivo");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerGeneradores(GeneradorPeliculas g) {
        registro = g;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public void establecerListaGeneradores() {
        LecturaArchivo l = new LecturaArchivo(obtenerNombreArchivo());
        l.establecerGeneradores();
        generadores = l.obtenerGeneradores();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<GeneradorPeliculas> obtenerListaGeneradores() {
        return generadores;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        }
    }
}
