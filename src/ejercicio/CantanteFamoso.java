/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author 
 */
public class CantanteFamoso {
    private String nombre;
    private String DiscoMasVendido;
    
    public CantanteFamoso(){
        nombre = "";
        DiscoMasVendido = "";
        
    }
    public CantanteFamoso(String nombre, String DiscoMasVendido){
        this.nombre = nombre;
        this.DiscoMasVendido = DiscoMasVendido;
    }
    public String getDiscoConMasVentas(){
        return DiscoMasVendido;
    }
    public String getNombre(){
        return nombre;
    }
    
}
