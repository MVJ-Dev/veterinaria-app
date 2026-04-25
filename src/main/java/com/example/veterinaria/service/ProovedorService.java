package com.example.veterinaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.veterinaria.model.Proovedor;
import com.example.veterinaria.repository.ProovedorRepository;

@Service
public class ProovedorService {
    @Autowired
    private ProovedorRepository proovedorRepository;

    public String almacenar(Proovedor proovedor){
        this.proovedorRepository.save(proovedor);
        return "Almacenado";
    }

    public List<Proovedor> listar(){
        return proovedorRepository.findAll();
    }



}
