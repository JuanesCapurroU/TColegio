package com.example.Proyecto.Servicio;

import com.example.Proyecto.Modelo.Estudiantes;
import com.example.Proyecto.Repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServicio {

    @Autowired
    private EstudianteRepositorio estuRepo;

    public List<Estudiantes> obtenerTodo(){
        return estuRepo.findAll();
    }

    public Optional<Estudiantes> obtenerID(int id){
        return estuRepo.findById(id);
    }

    public Estudiantes guardar(Estudiantes est){
        return estuRepo.save(est);
    }

    public void eliminar(int id){
        estuRepo.deleteById(id);
    }

}
