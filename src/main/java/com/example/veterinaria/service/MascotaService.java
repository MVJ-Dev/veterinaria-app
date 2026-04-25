package com.example.veterinaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.veterinaria.model.Mascota;
import com.example.veterinaria.repository.MascotaRepository;

//esta clase tiene el autowired para la inyeccion de dependencias @Autowired
//Intermediario entre controller y el Repository
//creamos los métodos que necesitemos. En esta primera instancia necesitamos uno que obtenga (findall) mascotas y otro que guarde mascotas save()

@Service
public class MascotaService {

    @Autowired // para la inyeccion de dependencias
    private MascotaRepository mascotaRepository; // traemos lo que está en la capa de repository a la de servicio

    public List<Mascota> mascotaObtener(){ // hacemos una lista para las mascotas

        return this.mascotaRepository.findAll();  // obtenemos todas las mascotas que tengamos listadas
    }


    //metodo para almacenar. Antes de guardar, se debe verificar si una mascota ya existe con ese id.

    public String mascotaAlmacenar(Mascota mascota){

        this.mascotaRepository.save(mascota);
        return "Mascota Almacenada";
        
    }

    //fsdfsdfsdfsdf

    //método para eliminar mascotas. Recibe un ID de tipo string y llama a DeletebyID()

    public void mascotaEliminar(String id){ //le pasamos el ID
        this.mascotaRepository.deleteById(id);
    }

    //método para modificar. Recibe un ID de tipo string y un objeto mascota.

    public void mascotaModificar(String id, Mascota mascota){
        this.mascotaRepository.save(mascota);
    }

    



}
