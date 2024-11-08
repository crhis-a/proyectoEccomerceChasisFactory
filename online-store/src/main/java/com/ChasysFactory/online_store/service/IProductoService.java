package com.ChasysFactory.online_store.service;


import com.ChasysFactory.online_store.model.Pedido;
import com.ChasysFactory.online_store.model.Producto;

import java.time.LocalDate;
import java.util.List;

public interface IProductoService {


    public void guardarProducto(Producto producto);
    public void eliminarProducto(Long idProducto);
    public Producto buscarProducto(Long idProducto);
    public void editarProducto(Long idProducto, String nuevoNombreProducto, String nuevaDescripcionProducto, Double nuevoPrecioProducto, byte[] nuevaImagenProducto, String nuevoColor,
                               String nuevaIluminacion, String nuevaRefrigeracion, Character nuevoTamanoChasis, int nuevoStock);
    public List<Producto> listarProducto();
}
