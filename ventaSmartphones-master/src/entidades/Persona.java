/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author taisa
 */
public class Persona {
    //Atributos
    private String nombre = new String();
    private boolean cuentaCredito = false;
    private String domicilio = new String();
    private int	edad = 0;
    private String telefono = new String();
    private String email = new String();
    
    //Constructor
    public Persona(){}
    
    
    //Getters Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCuentaCredito() {
        return cuentaCredito;
    }

    public void setCuentaCredito(boolean cuentaCredito) {
        this.cuentaCredito = cuentaCredito;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Metodos propios

    
    
}
