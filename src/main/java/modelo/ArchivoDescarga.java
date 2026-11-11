/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import excepciones.TiempoExcedidoException;

/**
 *
 * @author Home
 */
public class ArchivoDescarga {
    private String nombre;
    private double tiempo;
    private String url;
    
    
    public String getNombre(){return nombre;}
    public double getTiempo(){return tiempo;}
    public String getUrl(){return url;}
}

 class ProcesoDescargaHilo implements Runnable{
        private ArchivoDescarga descarga;
        private Proceso proceso;
        
        public interface Proceso{
        void onInicio();
        void onFinal();
        void onError(String error);
      }
        
        public ProcesoDescargaHilo(ArchivoDescarga descarga, Proceso proceso){
        this.descarga = descarga;
        this.proceso = proceso;
      }
        
        public void run(){
        proceso.onInicio();
        try{
            Thread.sleep(2000);
        }  catch(InterruptedException e){
           proceso.onError("La descarga fue interumpido");
        }
      }
    }
    
   