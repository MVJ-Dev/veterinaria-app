package com.example.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.veterinaria.model.Mascota;
import com.example.veterinaria.service.MascotaService;

//Controller es la puerta de entrada de la API
// Recibe peticiones HTTP y devuelve las respuestas en formato JSON
@RestController 
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired //llamamos a service e inyectamos las dependencias.
    private MascotaService mascotaService;

    //creamos el método GET

    @GetMapping //método para obtener a las mascotas
    public List <Mascota> mascotaObtener(){
        return this.mascotaService.mascotaObtener();
    }

    //creamos el método POST para poner mascotas

    @PostMapping
    public void mascotaAlmacenar(@RequestBody Mascota mascota){
        this.mascotaService.mascotaAlmacenar(mascota);
    }

    //dfsdfds



}
