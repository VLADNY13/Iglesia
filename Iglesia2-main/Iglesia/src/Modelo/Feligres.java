/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author auxiliar
 */
import java.util.ArrayList;
public class Feligres {
    
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private Integer estrato;
    private String estado;
    public Integer diezma;
    public static ArrayList<Feligres> feligreses = new ArrayList<>();

    public Feligres() {
    }
    
    
    
    

   

    public Feligres(String cedula, String nombre, String direccion, String telefono, Integer estrato, String estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.estado = estado;
    }

    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static ArrayList<Feligres> getFeligreses() {
        return feligreses;
    }

    public static void setFeligreses(ArrayList<Feligres> feligreses) {
        Feligres.feligreses = feligreses;
    }

    public Integer getDiezma() {
        return diezma;
    }

    public void setDiezma(Integer diezma) {
        this.diezma = diezma;
    }
    
    
    
   // public Diezmo(Integer diezma){
    
     //   this.diezma=diezma;
        
      
    //} 
   
    
    public void calcularDiezmo(Integer estrato){
      

        
        if( estrato==1){ diezma=250000; }
        if( estrato>1 && estrato<=3){ diezma=500000; }   
        if( estrato>3){ diezma=1000000; }
        
        
    } 
    
}
