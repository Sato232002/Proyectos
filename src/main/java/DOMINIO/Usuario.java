/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

/**
 *
 * @author User
 */
public class Usuario {
    private String nombre;
    private int codigo;
    private int contraseña;
    private String nombreDeUsuario;
    //constructor sin argumentos
    public Usuario() {
        nombre= "0";
        codigo= 0;
        contraseña= 0; 
        nombreDeUsuario="0";
        
    }
    public Usuario(String nombre, int codigo, int contraseña, String nombreDeUsuario){
        this.nombre=nombre;
        this.codigo=codigo;
        this.contraseña=contraseña;
        this.nombreDeUsuario=nombreDeUsuario;
        
    }
     public Usuario(Usuario u) {
         this.nombre=u.nombre;
         this.codigo=u.codigo;
         this.contraseña=u.contraseña;
         this.nombreDeUsuario=u.nombreDeUsuario;
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", codigo=" + codigo + ", contrase\u00f1a=" + contraseña + ", nombreDeUsuario=" + nombreDeUsuario + '}';
    }
     
    
    
}
