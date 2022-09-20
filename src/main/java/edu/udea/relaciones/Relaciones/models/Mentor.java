package edu.udea.relaciones.Relaciones.models;


import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name="mentor")
public class Mentor {

    @Id
    private int numeroDocumentoMentor;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private int aniosExperiencia;
    @OneToOne
    @Nullable
    private Estudiante estudiante;




//CONSTRUCTOR
    public Mentor(int numeroDocumentoMentor, String nombre, String apellido, int aniosExperiencia, Estudiante estudiante) {
        this.numeroDocumentoMentor = numeroDocumentoMentor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.aniosExperiencia = aniosExperiencia;
        this.estudiante = estudiante;
    }


//CONSTRUCTOR VACIO
    public Mentor(){

    }




//GETTER & SETTER
    public int getNumeroDocumentoMentor() {
        return numeroDocumentoMentor;
    }

    public void setNumeroDocumentoMentor(int numeroDocumentoMentor) {
        this.numeroDocumentoMentor = numeroDocumentoMentor;
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

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
