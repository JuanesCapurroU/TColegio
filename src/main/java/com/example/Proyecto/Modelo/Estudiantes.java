package com.example.Proyecto.Modelo;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_estudiante")
public class Estudiantes {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name="grado")
    private String grado;

    @Column(name = "Correo")
    private String correo;

    // Relacion Muchos  a muchos Estudiantes a profesores
    @ManyToMany(mappedBy = "estudiantes")
    private Set<Profesores> profesores = new HashSet<>();

    // Relacion Uno a uno de Estudiantes a Direccion
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")

    private Direccion direccion;

    public Estudiantes() {
    }

    public Estudiantes(int codigo, String nombre, String apellido, String grado, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.correo = correo;
    }

    // Getters y setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Set<Profesores> getProfesores() {
        return profesores;
    }

    public void setProfesores(Set<Profesores> profesores) {
        this.profesores = profesores;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
