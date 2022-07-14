/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        Tarjeta t = new Tarjeta("Banco de Loja", 24000);
        MayorEdad representante = new MayorEdad("José", t);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta: \n%s\n" ,
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta());
        
    }
}
