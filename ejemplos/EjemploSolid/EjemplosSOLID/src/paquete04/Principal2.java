/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Principal2 {

    public static void main(String[] args) {
        // 1. Agregar por teclado numero n de Transportes
        // Bus, Taxi, Maritimo
        // Crear Tipos Transporte
        // Presentar Reporte de los transportes
        // Reporte
        // Transporte Bus : $1.00
        // Transporte Maritimo : $1000.00
        
        ArrayList<Transporte> lista = new ArrayList<>();
        
        TransporteBus bus = new TransporteBus();
        bus.establecerTarifa();
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerTarifa();
        TransporteAereo avion = new TransporteAereo();
        avion.establecerTarifa();
        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerTarifa();
        
        int opc = 0;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    lista.add(bus);
                    break;
                case 2:
                    lista.add(taxi);
                    break;
                case 3:
                    lista.add(avion);
                    break;
                case 4:
                    lista.add(mar);
                    break;
                case 5:
                    opc =0;
                    break;
                default:
                    System.out.println("Numero fuera de Rango");
                    break;
                    
            }
        } while (opc != 0);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("%s\n", 
                tipos);
    }

    public static int menu() {
        Scanner leer = new Scanner(System.in);
        int i = 0;
        System.out.println(" -------------------");
        System.out.println(" 1. Transporte Bus");
        System.out.println(" 2.  Transporte Taxi");
        System.out.println(" 3.  Transporte Aereo");
        System.out.println(" 4.  Transporte Maritimo");
        System.out.println(" 5.  Salir del programa");
        System.out.println("-----------------------");
        System.out.print("Ingrese la opcion deseada: ");
        i = leer.nextInt();
        System.out.println("");
        return i;
    }
}
