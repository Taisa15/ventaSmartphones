/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author taisa
 */
public class Venta {
    //Atributos
    private List<Smartphone> smartphones = new ArrayList();
    private String fecha = new String();
    private Persona vendedor = new Persona();
    private Persona comprador = new Persona();
    private String proveedor = new String();
    private boolean credito = false;
    private double total = 0.0;

    //Constructor
    public Venta() {}
    
    //Getters Setters

    public List<Smartphone> getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(List<Smartphone> smartphones) {
        this.smartphones = smartphones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Persona getVendedor() {
        return vendedor;
    }

    public void setVendedor(Persona vendedor) {
        this.vendedor = vendedor;
    }

    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    //Metodos propios
    
}
