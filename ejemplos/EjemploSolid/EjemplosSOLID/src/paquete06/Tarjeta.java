/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class Tarjeta {
    private String nombreBanco;
    private double cupo;

    public Tarjeta(String n, double c) {
        nombreBanco = n;
        cupo = c;
    }

    public void establecerNombreBanco(String c) {
        nombreBanco = c;
    }

    public void establecerCupo(double c) {
        cupo = c;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerCupo() {
        return cupo;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre del Banco: %s\n"
                + "Cupo maximo de la tarjeta: %.2f\n", 
                obtenerNombreBanco(),
                obtenerCupo());
        return cadena;
    }
}
