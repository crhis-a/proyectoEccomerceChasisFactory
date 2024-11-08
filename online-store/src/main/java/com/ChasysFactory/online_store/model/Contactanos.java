package com.ChasysFactory.online_store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Contactanos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long idContactanos;
        private String nombreApellido;
        private String correoContacto;
        private String telefonoContacto;
        private String mensajeContacto;

    public Contactanos() {
    }

    public Contactanos(Long idContactanos, String nombreApellido, String correoContacto, String telefonoContacto, String mensajeContacto) {
        this.idContactanos = idContactanos;
        this.nombreApellido = nombreApellido;
        this.correoContacto = correoContacto;
        this.telefonoContacto = telefonoContacto;
        this.mensajeContacto = mensajeContacto;
    }

    public Long getIdContactanos() {
        return idContactanos;
    }

    public void setIdContactanos(Long idContactanos) {
        this.idContactanos = idContactanos;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getMensajeContacto() {
        return mensajeContacto;
    }

    public void setMensajeContacto(String mensajeContacto) {
        this.mensajeContacto = mensajeContacto;
    }
}
