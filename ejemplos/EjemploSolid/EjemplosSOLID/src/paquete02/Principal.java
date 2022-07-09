/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        // 1. crear 3 estudiantes
        Persona p1 = new Persona("Jose",20);
        Persona p2 = new Persona("Sebastian",21);
        Persona p3 = new Persona("Sofia",22);
        
        // 2. agregar a un arraylist
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        // 3. Generar objeto tipo  OP
        OperacionesEstudiantes op = new OperacionesEstudiantes();
        op.establecerEstudiante(lista);
        op.establecerPromedioEdades();
        op.establecerPromedioEdadesCualitativo();
        // 4. presentar roString de OP
        System.out.printf("%s\n",op);
    }
}
