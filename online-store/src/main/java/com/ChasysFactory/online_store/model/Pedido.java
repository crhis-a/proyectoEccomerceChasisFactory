package com.ChasysFactory.online_store.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPedido;
    private LocalDate fechaPedido;
    private String estadoPedido;
    private Double totalPrecio;
    private String direccionPedido;
    private String ciudadPedido;
    private String departamentoPedido;
    private String detallesAdiccionalesPedido;


    @ManyToOne
    @JoinColumn(name = "idUsuarioRegistrado")
    private UsuarioRegistrado haceUn;

    @OneToMany (mappedBy = "tiene")
    private List<DetallePedido> detallePedidos;

    public Pedido() {
    }

    public Pedido(Long idPedido, LocalDate fechaPedido, String estadoPedido, Double totalPrecio, String direccionPedido, String ciudadPedido, String departamentoPedido, String detallesAdiccionalesPedido, UsuarioRegistrado haceUn, List<DetallePedido> detallePedidos) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.estadoPedido = estadoPedido;
        this.totalPrecio = totalPrecio;
        this.direccionPedido = direccionPedido;
        this.ciudadPedido = ciudadPedido;
        this.departamentoPedido = departamentoPedido;
        this.detallesAdiccionalesPedido = detallesAdiccionalesPedido;
        this.haceUn = haceUn;
        this.detallePedidos = detallePedidos;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Double getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(Double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

    public String getDireccionPedido() {
        return direccionPedido;
    }

    public void setDireccionPedido(String direccionPedido) {
        this.direccionPedido = direccionPedido;
    }

    public String getCiudadPedido() {
        return ciudadPedido;
    }

    public void setCiudadPedido(String ciudadPedido) {
        this.ciudadPedido = ciudadPedido;
    }

    public String getDepartamentoPedido() {
        return departamentoPedido;
    }

    public void setDepartamentoPedido(String departamentoPedido) {
        this.departamentoPedido = departamentoPedido;
    }

    public String getDetallesAdiccionalesPedido() {
        return detallesAdiccionalesPedido;
    }

    public void setDetallesAdiccionalesPedido(String detallesAdiccionalesPedido) {
        this.detallesAdiccionalesPedido = detallesAdiccionalesPedido;
    }

    public UsuarioRegistrado getHaceUn() {
        return haceUn;
    }

    public void setHaceUn(UsuarioRegistrado haceUn) {
        this.haceUn = haceUn;
    }

    public List<DetallePedido> getDetallePedidos() {
        return detallePedidos;
    }

    public void setDetallePedidos(List<DetallePedido> detallePedidos) {
        this.detallePedidos = detallePedidos;
    }
}
