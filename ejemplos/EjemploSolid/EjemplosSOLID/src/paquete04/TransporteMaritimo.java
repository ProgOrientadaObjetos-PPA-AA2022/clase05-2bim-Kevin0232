/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class TransporteMaritimo extends Transporte {

    private String cooperativaBus;

    public void establecerTransporteMaritimo(String n) {
        cooperativaBus = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 150.00 + 30;
    }

    public String obtenerTransporteMaritimo() {
        return cooperativaBus;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Transporte Maritimo: $ %.2f\n", obtenerTarifa());
        return cadena;
    }

}
