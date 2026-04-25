package com.example.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mascota {

    @Id
    private String id;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String nombreDueno;
    
    
    
    public Mascota() {
    }



    public Mascota(String id, String nombre, String especie, String raza, int edad, String nombreDueno) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }



    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getEspecie() {
        return especie;
    }



    public void setEspecie(String especie) {
        this.especie = especie;
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



    public String getnombreDueno() {
        return nombreDueno;
    }



    public void setnombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }


}
