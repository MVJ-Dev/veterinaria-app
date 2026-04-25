package com.example.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Proovedor {
    @Id
    private String id;
    private String nombre;
    private String email;
    private int telefono;
    private String status;



    public Proovedor() {
        this.id = "";
        this.nombre = "";
        this.email = "";
        this.telefono = 0;
        this.status = "";
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



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public int getTelefono() {
        return telefono;
    }



    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }



    public String getStatus() {
        return status;
    }



    public void setStatus(String status) {
        this.status = status;
    }

    





    
}
