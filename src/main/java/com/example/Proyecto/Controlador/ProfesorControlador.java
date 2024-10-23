package com.example.Proyecto.Controlador;

import com.example.Proyecto.Modelo.Profesores;
import com.example.Proyecto.Servicio.ProfesorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/profesor")
public class ProfesorControlador {

    @Autowired
    private ProfesorServicio profesorServicio;

    @PostMapping("/guardar")
    public Profesores guardar(@RequestBody Profesores profesor) {
        return profesorServicio.guardar(profesor);
    }

    @GetMapping("/obtenerTodo")
    public List<Profesores> obtenerTodo() {
        return profesorServicio.obtenerTodo();
    }

    @GetMapping("/obtener/{id}")
    public Optional<Profesores> obtenerID(@PathVariable int id) {
        return profesorServicio.obtenerID(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable int id) {
        profesorServicio.eliminar(id);
    }
}
