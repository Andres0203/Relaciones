package edu.udea.relaciones.Relaciones.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Materia {

    @Id
    private String codigoMateria;
    @Column
    private String nombreMateria;
    @Column
    private int nivel;
    @Column
    private String descripcion;
    @Column
    private String tipo;
    @Column
    private String programaResumido;
    @ManyToMany(mappedBy = "materias")
    private List<Grupo> grupos;


    public Materia(String codigoMateria, String nombreMateria, int nivel, String descripcion, String tipo, String programaResumido, List<Grupo> grupos) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
        this.nivel = nivel;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.programaResumido = programaResumido;
        this.grupos = grupos;
    }

    public Materia() {
    }


    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProgramaResumido() {
        return programaResumido;
    }

    public void setProgramaResumido(String programaResumido) {
        this.programaResumido = programaResumido;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
}
