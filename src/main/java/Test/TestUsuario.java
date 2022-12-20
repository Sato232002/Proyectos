/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import DOMINIO.Usuario;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestUsuario {
     public static void main(String args[]){
         Scanner in = new Scanner(System.in);
         Usuario u= new Usuario();
         
         u.setNombre("Michael");
         u.setCodigo(0);
         u.setContraseña(0);
         u.setNombreDeUsuario("nombreDeUsuario");
         
         System.out.println("Nombre:  " + u.getNombre());  
         System.out.println("Codigo:  " + u.getCodigo());
         System.out.println("Contraseña :  " + u.getContraseña());
         System.out.println("Nombre de Usuario :  " + u.getNombreDeUsuario());
 
        
     
     u.toString();
    } 
    
}
