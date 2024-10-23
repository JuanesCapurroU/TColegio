package com.example.Proyecto.Repositorio;

import com.example.Proyecto.Modelo.Asignaturas;
import com.example.Proyecto.Modelo.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionRepositorio extends JpaRepository<Direccion, Integer> {
}
