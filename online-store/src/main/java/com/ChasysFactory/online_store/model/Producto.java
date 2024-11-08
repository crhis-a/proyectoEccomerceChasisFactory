package com.ChasysFactory.online_store.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private Double precioProducto;
    private byte[]   imagenProducto;
    private String color;
    private String iluminacion;
    private String refrigeracion;
    private Character tamanoChasis;
    private int Stock;

    @OneToMany(mappedBy = "apareceEn")
    private List<DetallePedido> detallePedidos;

    public Producto() {
    }

    public Producto(Long idProducto, String nombreProducto, String descripcionProducto, Double precioProducto, byte[] imagenProducto, String color, String iluminacion, String refrigeracion, Character tamanoChasis, int stock) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.imagenProducto = imagenProducto;
        this.color = color;
        this.iluminacion = iluminacion;
        this.refrigeracion = refrigeracion;
        this.tamanoChasis = tamanoChasis;
        Stock = stock;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public byte[] getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(byte[] imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(String iluminacion) {
        this.iluminacion = iluminacion;
    }

    public String getRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(String refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    public Character getTamanoChasis() {
        return tamanoChasis;
    }

    public void setTamanoChasis(Character tamanoChasis) {
        this.tamanoChasis = tamanoChasis;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
}
