package com.ChasysFactory.online_store.service;

import com.ChasysFactory.online_store.model.Pedido;
import com.ChasysFactory.online_store.model.UsuarioRegistrado;

import java.time.LocalDate;
import java.util.List;

public interface IPedidoService {


    public void guardarPedido(Pedido pedido);
    public void eliminarPedido(Long idPedido);
    public Pedido buscarPedido(Long idPedido);
    public void editarPedido(Long idPedido, LocalDate nuevoFechaPedido,
                             String nuevoEstadoPedido, Double nuevoTotalPrecio,
                             String nuevoDireccionPedido,
                             String nuevoCiudadPedido, String nuevoDepartamentoPedido,
                             String nuevoDetallesAdiccionalesPedido);
    public List<Pedido> listarPedido();
}
