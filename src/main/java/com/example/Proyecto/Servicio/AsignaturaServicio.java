package com.example.Proyecto.Servicio;

import com.example.Proyecto.Modelo.Asignaturas;
import com.example.Proyecto.Repositorio.AsignaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaServicio {

    @Autowired
    private AsignaturaRepositorio asignaturaRepo;

    public List<Asignaturas> obtenerTodo() {
        return asignaturaRepo.findAll();
    }

    public Optional<Asignaturas> obtenerID(int id) {
        return asignaturaRepo.findById(id);
    }

    public Asignaturas guardar(Asignaturas asignatura) {
        return asignaturaRepo.save(asignatura);
    }

    public void eliminar(int id) {
        asignaturaRepo.deleteById(id);
    }
}
