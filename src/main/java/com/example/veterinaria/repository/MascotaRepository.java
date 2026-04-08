package com.example.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.veterinaria.model.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, String>{ //Mascota es el objeto, String estamos diciendo que la llave primaria es de tipo String
    // Agregamos el repository. Capa que interactua con la base de datos //
}
