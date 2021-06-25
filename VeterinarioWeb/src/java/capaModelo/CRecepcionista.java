/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaModelo;

/**
 * @date 24/06/2021
 * @author Alejandro
 * @descripcion  Clase de tipo catalogo que almacena los datos del recepcionista
 */
public class CRecepcionista {

    public CRecepcionista() {
    }
    
    
    
    private int id;
    private String usuario;
    private String contrasena;

    
    public void autenticarUsuario(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
