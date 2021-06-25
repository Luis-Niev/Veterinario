/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaModelo;

import java.util.Date;

/**
 *@date 24/06/2021
 * @author Alejandro
 * @descripcion  Clase de tipo catalogo que almacena los datos de las mascotas
 */
public class TCita {

    public TCita() {
    }
    
    
    
    private String id;
    private Date fechaCita;
    private CMascota mascota;
    private CServicio servicio;
    private CVeterinario veterinario;
    
    public void crearCita(){
        
    }
    public void consultarCita(){
        
    }
    public void actualizarCita(){
        
    }
    public void eliminarCita(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public CMascota getMascota() {
        return mascota;
    }

    public void setMascota(CMascota mascota) {
        this.mascota = mascota;
    }

    public CServicio getServicio() {
        return servicio;
    }

    public void setServicio(CServicio servicio) {
        this.servicio = servicio;
    }

    public CVeterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(CVeterinario veterinario) {
        this.veterinario = veterinario;
    }
    
    
    
}
