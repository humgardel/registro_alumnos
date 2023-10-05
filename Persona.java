/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroalumnos;

/**
 *
 * @author HUMGARDEL
 */
public class Persona {
    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    
    public Persona(){
        
    }
    
    public Persona(String id_, String nombre_, String apellido_, String telefono_, String direccion_){
        this.id=id_;
        this.nombre=nombre_;
        this.apellido=apellido_;
        this.telefono=telefono_;
        this.direccion=direccion_;
    }
}
