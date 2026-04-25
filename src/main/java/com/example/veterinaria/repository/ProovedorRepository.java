package com.example.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.veterinaria.model.Proovedor;


@Repository
public interface ProovedorRepository extends JpaRepository <Proovedor, String> {

}
