package com.ChasysFactory.online_store.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter @Setter
@Entity
public class UsuarioRegistrado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idUsuarioRegistrado ;
    private String nombreApellido ;
    private String numeroCelular ;
    private String correo ;
    private String password ;
    private boolean logueado ;


    @OneToMany(mappedBy = "haceUn")
    private List<Pedido> pedidos;


    public UsuarioRegistrado() {
    }

    public UsuarioRegistrado(Long idUsuarioRegistrado, String nombreApellido, String numeroCelular, String correo, String password, boolean logueado) {
        this.idUsuarioRegistrado = idUsuarioRegistrado;
        this.nombreApellido = nombreApellido;
        this.numeroCelular = numeroCelular;
        this.correo = correo;
        this.password = password;
        this.logueado = logueado;
    }

    public Long getIdUsuarioRegistrado() {
        return idUsuarioRegistrado;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLogueado() {
        return logueado;
    }

    public void setIdUsuarioRegistrado(Long idUsuarioRegistrado) {
        this.idUsuarioRegistrado = idUsuarioRegistrado;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }
}
