package com.example.Proyecto.Modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "calle")
    private String calle;

    @Column(name = "ciudad")
    private String ciudad;

    //Relacion uno a uno direccion a estudiante
    @OneToOne(mappedBy = "direccion", cascade = CascadeType.ALL, orphanRemoval = true)
    private Estudiantes estudiante;

    public Direccion() {
    }

    public Direccion(int id, String calle, String ciudad) {
        this.id = id;
        this.calle = calle;
        this.ciudad = ciudad;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Estudiantes getEstudiante() {
       return estudiante;
   }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
   }
}
