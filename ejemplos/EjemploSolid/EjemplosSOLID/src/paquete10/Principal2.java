/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Principal2 {

     public static void main(String[] args) {
        // Guardar los objetos de tipo Generador Pelicular en un 
        // archivo serializado
        String nombreArchivo = "GeneradorPelicula.data";

        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp);
        System.out.println("---------------------------");
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2);
        System.out.println("---------------------------");
        
        APIStarPlus api3 = new APIStarPlus();
        api3.establecerApiKey("123455");
        
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println(gp3);
        System.out.println("---------------------------");
        
        APIdirectvGo api4 = new APIdirectvGo();
        api4.establecerApiKey("123455");
        
        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println(gp4);

        EscrituraArchivo archivo = new EscrituraArchivo(nombreArchivo);
        archivo.establecerGeneradores(gp);
        archivo.establecerSalida();
        archivo.establecerGeneradores(gp2);
        archivo.establecerSalida();
        archivo.establecerGeneradores(gp3);
        archivo.establecerSalida();
        archivo.establecerGeneradores(gp4);
        archivo.establecerSalida();

    }
}
