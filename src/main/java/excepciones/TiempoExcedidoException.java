/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Home
 */
public class TiempoExcedidoException extends Exception {
    private String tiempoFaltante;
    public TiempoExcedidoException(String mensaje, String tiempoFaltante){
        super(mensaje);
        this.tiempoFaltante = tiempoFaltante;
    }
    public String getTiempoFaltante(){
    return tiempoFaltante;
    }
    
}
