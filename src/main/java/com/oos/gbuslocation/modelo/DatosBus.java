package com.oos.gbuslocation.modelo;


import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name="buslocation")
public class DatosBus {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombus",length= 60,nullable=false)
    private Integer nombus;
    @Column(name = "latitud",precision = 8, scale = 8,nullable=false)
    private Float latitud;
    @Column(name = "longitud",precision = 8, scale = 8,nullable=false)
    private Float longitud;
    @Column(name = "velobus",length= 60,nullable=false)
    private Float velobus;
    @Column(name = "fecha",length= 60,nullable=false)
    private String fecha;

    public DatosBus(){

    }

    public DatosBus(Integer id, Integer nombus,Float latitud, Float longitud,  Float velobus, String fecha) {
        this.id = id;
        this.nombus = nombus;
        this.latitud = latitud;
        this.longitud = longitud;
        this.velobus = velobus;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNombus() {
        return nombus;
    }

    public void setNombus(Integer nombus) {
        this.nombus = nombus;
    }
    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }


    public Float getVelobus() {
        return velobus;
    }

    public void setVelobus(Float velobus) {
        this.velobus = velobus;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
