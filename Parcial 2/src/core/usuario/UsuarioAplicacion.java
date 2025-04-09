/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.usuario;

import core.registro.RegistroAplicacion;

/**
 *
 * @author andrwc
 */


public class UsuarioAplicacion extends Usuario{
    private String nombre, cedula, direccion; 
    private RegistroAplicacion registroAplicacion; 

    public UsuarioAplicacion(String celular, boolean covid,String nombre, String cedula,String direccion) {
        super(cedula, covid);
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.registroAplicacion = registroAplicacion;
    }
    
    
    
}
