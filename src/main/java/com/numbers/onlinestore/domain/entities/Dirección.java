package com.numbers.onlinestore.domain.entities;

import com.numbers.onlinestore.infrastructure.data.generics.BaseEntity;

public class Dirección extends BaseEntity {
    
    private String calle;

    private String número;

    private String carrera;

    private String diagonal;

    private String manzana;

    private String interior;

    private String casa;

    private String piso;

    private String barrio;

    private String bloque;

    private String transversal;

    private String conjunto;

    private String etapa;

    private String localidad;

    private String comuna;

    private String códigoPostal;

    private Dirección() {}

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getTransversal() {
        return transversal;
    }

    public void setTransversal(String transversal) {
        this.transversal = transversal;
    }

    public String getConjunto() {
        return conjunto;
    }

    public void setConjunto(String conjunto) {
        this.conjunto = conjunto;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCódigoPostal() {
        return códigoPostal;
    }

    public void setCódigoPostal(String códigoPostal) {
        this.códigoPostal = códigoPostal;
    }

}