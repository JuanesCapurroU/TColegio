package com.example.Proyecto.Servicio;

import com.example.Proyecto.Modelo.Profesores;
import com.example.Proyecto.Repositorio.ProfesorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorServicio {

    @Autowired
    private ProfesorRepositorio profesorRepo;

    public List<Profesores> obtenerTodo() {
        return profesorRepo.findAll();
    }

    public Optional<Profesores> obtenerID(int id) {
        return profesorRepo.findById(id);
    }

    public Profesores guardar(Profesores profesor) {
        return profesorRepo.save(profesor);
    }

    public void eliminar(int id) {
        profesorRepo.deleteById(id);
    }
}
