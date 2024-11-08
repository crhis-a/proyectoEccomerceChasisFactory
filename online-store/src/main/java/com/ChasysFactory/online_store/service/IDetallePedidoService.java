package com.ChasysFactory.online_store.service;

import com.ChasysFactory.online_store.model.DetallePedido;
import com.ChasysFactory.online_store.model.UsuarioRegistrado;

import java.util.List;

public interface IDetallePedidoService {

    public void guardarDetallePedido(DetallePedido detallePedido);
    public void eliminarDetallePedido(Long idDetallePedido);
    public DetallePedido buscarDetallePedido(Long idDetallePedido);
    public void editarDetallePedido(Long idDetallePedido, int nuevoCantidadProducto, Double nuevoPrecioProducto
                                    );
    public List<DetallePedido> listarDetallesPedido();
}

