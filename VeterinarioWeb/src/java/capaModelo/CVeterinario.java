/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaModelo;

/**
 * @date 24/06/2021
 * @author Alejandro
 * @descripcion  Clase de tipo catalogo que almacena los datos de los veterinarios
 */
public class CVeterinario {

    public CVeterinario() {
    }
    
    
    
    private int id;
    private String nombre;
    private String direccion;
    private String cedulaP;
    private long telefono;

    
    public void crearVeterinario(){
        
    }
    public void  consultarUsuario(){
        
    }
    public void actualizarVeterinario(){
        
    }
    public void eliminarVeterinario(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedulaP() {
        return cedulaP;
    }

    public void setCedulaP(String cedulaP) {
        this.cedulaP = cedulaP;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
    
}
