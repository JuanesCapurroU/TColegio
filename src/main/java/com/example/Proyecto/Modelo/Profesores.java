package com.example.Proyecto.Modelo;


import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_profesor")
public class Profesores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "materia")
    private String materia;

    // Relacion muchos a muchos de Profesores con estudiantes
    @ManyToMany
    @JoinTable(
            name = "profesor_estudiante",
            joinColumns = @JoinColumn(name = "profesor_id"),
            inverseJoinColumns = @JoinColumn(name = "estudiante_id")
    )
    private Set<Estudiantes> estudiantes = new HashSet<>();

    // Relacion Uno a uno profesores a Asignaturas
    @OneToOne(mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Asignaturas asignaturas;

    public Profesores() {
    }

    public Profesores(int id, String nombre, String materia) {
        this.id = id;
        this.nombre = nombre;
        this.materia = materia;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Set<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Set<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Asignaturas getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignaturas asignaturas) {
        this.asignaturas = asignaturas;
    }
}
