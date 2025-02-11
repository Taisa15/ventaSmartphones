package controlador;

import entidades.Persona;
import entidades.Smartphone;
import entidades.Venta;
import java.util.ArrayList;
import java.util.List;


public class VentasImpl {
    
    //Catalogos
    private List<Smartphone> celulares = new ArrayList(); 
    private List<Venta> ventas = new ArrayList();
    private List<Persona> vendedores = new ArrayList();
    private List<Persona> compradores = new ArrayList();
    
//    public static String nombre = "";
    
    
    /**
     * Este metodo registra un celular dentro de mi stock
     * Si no existe el celular, va a crearlo nuevo y si existe
     * aumenta el stock
     * @param cel Es un parametro de tipo Smartphone
     * @return Regresa verdadero si pudo registrar el smartphone
     * y falso si no se pudo registrar.
     */
    public boolean registrarSmartphone(Smartphone cel){
        if(cel != null){//Celalular valido
            this.celulares.add(cel);
            return true;
        }
        return false;
    }
    
    
    public boolean aumentarStock(int indice,int ingreso){
        if(indice > 0){
            if(this.celulares.get(indice) != null){
               int stockActual =  this.celulares.get(indice).getStock();
               this.celulares.get(indice).setStock(stockActual+ingreso);
               return true;
            }
        }
        
        return false;
        
    }
    
    
    /**
     * Este metodo registra una venta. 
     * @param venta Recibe un parametro de tipo venta el cual deberá tener todos sus datos
     * @return verdadero si se registro la venta.
     */ 
    public boolean registrarVenta(Venta venta){
        if(venta != null){            
                     
            this.ventas.add(venta);
            
            
            return true;
        }
        return false;
    }

    
    
    
    
    
    
    
    
    
    // Getter y setters
    public List<Smartphone> getCelulares() {
        return celulares;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public List<Persona> getVendedores() {
        return vendedores;
    }

    public void setVendedores(Persona vendedor) {
        this.vendedores.add(vendedor);
    }

    public List<Persona> getCompradores() {
        return compradores;
    }

    public void setCompradores(Persona comprador) {
        this.compradores.add(comprador);
    }
    
    
    
}
