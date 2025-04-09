/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.Puntointeres;

import core.registro.Registro;
import core.registro.RegistroAplicacion;
import core.registro.RegistroOperador;
import core.usuario.Usuario;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author gjazer
 */
public class CovidTrack {
    private ArrayList<Usuario> usuarios; 
    private ArrayList<Registro> registros; 
    private ArrayList<Antena> antenas; 
    private ArrayList<PuntoInteres> puntosInteres; 
    
    

    public CovidTrack() {
        this.usuarios = usuarios;
        this.registros = registros;
        this.antenas = antenas;
        this.puntosInteres = puntosInteres;
    }
    
    
    
    
    public boolean addUsuario(Usuario usuario){
        if(!usuarios.contains(usuario)){
            usuarios.add(usuario);
            return true;
        }
        return false; 
    }
    
    public boolean addRegistro(Registro registro){
        if(!registros.contains(registro)){
            registros.add(registro);
            return true;
        }
        return false; 
    }
    
    public boolean addRegistro( Usuario usuario, Antena antena, LocalDateTime fecha){
        RegistroOperador alo = new RegistroOperador( usuario,  antena,  fecha);
        
        if(!registros.contains(alo)){
            registros.add(alo);
            return true;
        }
        return false; 
    }

    public boolean addRegistro(Usuario usuario, double d, double d0, LocalDateTime of) {
        RegistroAplicacion alo = new RegistroAplicacion(usuario, d, d0, of);
        
        if(!registros.contains(alo)){
            registros.add(alo);
            return true;
        }
        return false; 
    }
    
    
    public boolean addAntena(Antena antena) {
        if(!antenas.contains(antena)){
            antenas.add(antena);
            return true;
        }
        return false; 
    }

    public boolean addPuntoInteres(String hospital_General, String hospital, double d, double d0, double d1) {
        PuntoInteres alo = new PuntoInteres( hospital_General, hospital,  d,  d0, d1);
        if(!puntosInteres.contains(alo)){
            puntosInteres.add(alo);
            return true;
        }
        
        return false;
        
    }

    
    public Usuario getUsuario(int index){
        return this.usuarios.get(index);
    }
    
    public Usuario getUsuarios( ){
        return this.usuarios.get(0);
    }
    
    
    public Antena getAntena(int index){
        return this.antenas.get(index);
    }
    
    public PuntoInteres getPuntoInteres(int index){
        return this.puntosInteres.get(index);
    }

    

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public ArrayList<Antena> getAntenas() {
        return antenas;
    }

    public ArrayList<PuntoInteres> getPuntosInteres() {
        return puntosInteres;
    }
    
    public void showResumenPuntosIntesesPorMes(){
        System.out.println("SIn implementar");
    }


    
    



    
    
    
    
    
}
