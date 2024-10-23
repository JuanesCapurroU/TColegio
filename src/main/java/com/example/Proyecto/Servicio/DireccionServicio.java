package com.example.Proyecto.Servicio;

import com.example.Proyecto.Modelo.Direccion;
import com.example.Proyecto.Repositorio.DireccionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DireccionServicio {

    @Autowired
    private DireccionRepositorio direccionRepo;

    public List<Direccion> obtenerTodo() {
        return direccionRepo.findAll();
    }

    public Optional<Direccion> obtenerID(int id) {
        return direccionRepo.findById(id);
    }

    public Direccion guardar(Direccion direccion) {
        return direccionRepo.save(direccion);
    }

    public void eliminar(int id) {
        direccionRepo.deleteById(id);
    }
}
