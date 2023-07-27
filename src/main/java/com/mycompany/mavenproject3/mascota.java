/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author osboxes
 */
public class mascota {
  private  String nombre;
  private  String raza;
   private int edad;

    public mascota(String nombre) {
        this.nombre = nombre;
    }
    
    public mascota(String n, String r, int e)
    {
        this.nombre=n;
        this.edad=e;
        this.raza=r;
    
    }
   
   

    public String getNombre() {
  //guardar a 
        return nombre;
    }

    public void setNombre(String nombre) {
       ///guardar a bitacora 
        
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
