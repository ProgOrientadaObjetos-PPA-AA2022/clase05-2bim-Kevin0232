/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;
import java.io.Serializable;
/**
 *
 * @author SALA I
 */
public class APIStarPlus implements APIMovie, Serializable{
    private String apiKey;
    @Override
    public void establecerApiKey(String ak) {
        apiKey = String.format("%s%s", ak, "576567");
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }
    
    @Override
    public String toString() {
        return "Star Plus";
    }
}
