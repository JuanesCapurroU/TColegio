package com.example.Proyecto.Controlador;

import com.example.Proyecto.Modelo.Direccion;
import com.example.Proyecto.Servicio.DireccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/direccion")
public class DireccionControlador {

    @Autowired
    private DireccionServicio direccionServicio;

    @PostMapping("/guardar")
    public Direccion guardar(@RequestBody Direccion direccion) {
        return direccionServicio.guardar(direccion);
    }

    @GetMapping("/obtenerTodo")
    public List<Direccion> obtenerTodo() {
        return direccionServicio.obtenerTodo();
    }

    @GetMapping("/obtener/{id}")
    public Optional<Direccion> obtenerID(@PathVariable int id) {
        return direccionServicio.obtenerID(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable int id) {
        direccionServicio.eliminar(id);
    }
}
