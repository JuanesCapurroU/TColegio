package com.example.Proyecto.Repositorio;

import com.example.Proyecto.Modelo.Asignaturas;
import com.example.Proyecto.Modelo.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturaRepositorio extends JpaRepository<Asignaturas, Integer> {
}
