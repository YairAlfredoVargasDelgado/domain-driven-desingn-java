package com.numbers.onlinestore.domain.entities;

import java.util.List;

import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.numbers.onlinestore.domain.valueobjects.Nombre;
import com.numbers.onlinestore.infrastructure.data.generics.BaseEntity;

public class Cliente extends BaseEntity {
    
    private String cédula;
    
    private Nombre nombre;

    private List<PhoneNumber> teléfonos;

    private List<Dirección> direcciones;

    private String correoElectrónico;

    private Cliente() {}

    public String getCédula() {
        return cédula;
    }

    public void setCédula(String cédula) {
        this.cédula = cédula;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public List<PhoneNumber> getTeléfonos() {
        return teléfonos;
    }

    public void setTeléfonos(List<PhoneNumber> teléfono) {
        this.teléfonos = teléfono;
    }

    public List<Dirección> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Dirección> direcciones) {
        this.direcciones = direcciones;
    }

    public String getCorreoElectrónico() {
        return correoElectrónico;
    }

    public void setCorreoElectrónico(String correoElectrónico) {
        this.correoElectrónico = correoElectrónico;
    }

    public static class ClienteBuilder {

        Cliente cliente = new Cliente();
        
        public ClienteBuilder() {
            cliente.setCédula("");
            cliente.setNombre(new Nombre("", "", "", ""));
            cliente.setDirecciones(null);
            cliente.setTeléfonos(null);
            cliente.setCorreoElectrónico("");
        }

        public ClienteBuilder setCédula(String cédula) {
            cliente.setCédula(cédula);
            return this;
        }

        public ClienteBuilder setNombre(Nombre nombre) {
            cliente.setNombre(nombre);
            return this;
        }

        public ClienteBuilder setDirecciones(List<Dirección> direcciones) {
            cliente.setDirecciones(direcciones);
            return this;
        }

        public ClienteBuilder setTeléfonos(List<PhoneNumber> teléfonos) {
            cliente.setTeléfonos(teléfonos);
            return this;
        }

        public ClienteBuilder setCorreoElectrónico(String correoElectrónico) {
            cliente.setCorreoElectrónico(correoElectrónico);
            return this;
        }

        public Cliente build() {
            return cliente;
        }
    }

}