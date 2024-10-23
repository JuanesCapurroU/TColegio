package com.example.Proyecto.Modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_asignatura")
public class Asignaturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    // Relacion uno a uno de Asignaturas a Profesores

    @JoinColumn(name = "profesor_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Profesores profesor;

    public Asignaturas(int id, String nombre, Profesores profesor) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesores getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesores profesor) {
        this.profesor = profesor;
    }
}
