package com.example.Proyecto.Controlador;


import com.example.Proyecto.Modelo.Estudiantes;
import com.example.Proyecto.Servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/estudiante")
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio estServicio;

    @PostMapping("/guardar")
    public Estudiantes guardar(@RequestBody Estudiantes estu){
        return estServicio.guardar(estu);
    }

}
