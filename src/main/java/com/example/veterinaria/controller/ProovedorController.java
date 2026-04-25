package com.example.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.veterinaria.model.Proovedor;
import com.example.veterinaria.service.ProovedorService;

@RestController
@RequestMapping("/proovedores")
public class ProovedorController {
    @Autowired
    private ProovedorService proovedorService;

    @PostMapping
    public void almacenar(@RequestBody Proovedor proovedor){
        this.proovedorService.almacenar(proovedor);
    }

    @GetMapping
    public List<Proovedor> listar(){
        return this.proovedorService.listar();
    }


}



