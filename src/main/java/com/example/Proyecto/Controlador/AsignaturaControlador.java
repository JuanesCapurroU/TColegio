package com.example.Proyecto.Controlador;

import com.example.Proyecto.Modelo.Asignaturas;
import com.example.Proyecto.Servicio.AsignaturaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/asignatura")
public class AsignaturaControlador {

    @Autowired
    private AsignaturaServicio asignaturaServicio;

    @PostMapping("/guardar")
    public Asignaturas guardar(@RequestBody Asignaturas asignatura) {
        return asignaturaServicio.guardar(asignatura);
    }

    @GetMapping("/obtenerTodo")
    public List<Asignaturas> obtenerTodo() {
        return asignaturaServicio.obtenerTodo();
    }

    @GetMapping("/obtener/{id}")
    public Optional<Asignaturas> obtenerID(@PathVariable int id) {
        return asignaturaServicio.obtenerID(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable int id) {
        asignaturaServicio.eliminar(id);
    }
}
