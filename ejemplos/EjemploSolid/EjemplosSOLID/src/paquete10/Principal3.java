/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;


/**
 *
 * @author SALA I
 */
public class Principal3 {

    public static void main(String[] args) {
        String nombreArchivo = "Generadores.data";
        LecturaArchivo lectura = new LecturaArchivo(nombreArchivo);
        lectura.establecerGeneradores();
        System.out.println(lectura);
    }
}
