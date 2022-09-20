package edu.udea.relaciones.Relaciones.models;


import javax.persistence.*;
import java.util.List;



@Entity
@Table(name="grupo")
public class Grupo {

    @Id
    private String codigoGrupo;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @OneToMany
    @JoinColumn (name ="grupo_id")
    private List<Estudiante> estudiantes;

    @ManyToMany
    private List<Materia> materias;


    public Grupo(String codigoGrupo, String nombre, String descripcion, List<Estudiante> estudiantes,
                 List<Materia> materias) {
        this.codigoGrupo = codigoGrupo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estudiantes = estudiantes;
        this.materias = materias;
    }


    public Grupo() {
    }


    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
