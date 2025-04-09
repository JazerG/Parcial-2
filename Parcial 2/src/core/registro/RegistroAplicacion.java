/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.registro;

/**
 *
 * @author andrwc
 */

import core.usuario.Usuario;
import java.time.LocalDateTime;

public class RegistroAplicacion extends Registro{
    
    private double latitud, longuitud; 
    private Usuario usuarioAplicacion; 

    public RegistroAplicacion(Usuario usuarioAplicacion, double latitud, double longuitud, LocalDateTime fecha) {
        super(fecha);
        this.latitud = latitud;
        this.longuitud = longuitud;
        this.usuarioAplicacion = usuarioAplicacion;
    }
    
    
    
}
