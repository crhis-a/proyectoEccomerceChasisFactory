package com.ChasysFactory.online_store.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idDetallePedido;
    private int  cantidadProducto;
    private Double precioProducto;



    @ManyToOne
    @JoinColumn(name = "idPedido")
    private Pedido tiene;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto apareceEn;

    public DetallePedido() {
    }

    public DetallePedido(Long idDetallePedido, int cantidadProducto, Double precioProducto ) {
        this.idDetallePedido = idDetallePedido;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;

    }

    public Long getIdDetallePedido() {
        return idDetallePedido;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }


    public void setIdDetallePedido(Long idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }


}
