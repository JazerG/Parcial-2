/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Puntointeres;

import core.usuario.Usuario;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author gjazer
 */
public class PuntoInteres {
    private String nombre;
    private String tipo;
    private double latitud;
    private double longitud;
    private double rango;
    private ArrayList<LocalDateTime> fechas; 
    private ArrayList<Usuario> usuarios; 

    public PuntoInteres(String tipo, String nombre, double latitud, double longitud, double rango) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.latitud = latitud;
        this.longitud = longitud;
        this.rango = rango;
        this.fechas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

   
    public void updateUsuariosCercanos(Usuario usuario, LocalDateTime fecha){
        System.out.println("Sin implementar");
    }
}
