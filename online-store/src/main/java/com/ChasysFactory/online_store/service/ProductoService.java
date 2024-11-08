package com.ChasysFactory.online_store.service;

import com.ChasysFactory.online_store.model.Pedido;
import com.ChasysFactory.online_store.model.Producto;
import com.ChasysFactory.online_store.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public void guardarProducto(Producto producto){
        productoRepository.save(producto);
    }
    @Override
    public void eliminarProducto(Long idProducto){

        productoRepository.deleteById(idProducto);
    }
    @Override
    public Producto buscarProducto(Long idProducto){

        Producto producto=productoRepository.findById(idProducto).orElse(null);

        return producto;


    }
    @Override
    public void editarProducto(Long idProducto, String nuevoNombreProducto, String nuevaDescripcionProducto, Double nuevoPrecioProducto,
                               byte[] nuevaImagenProducto, String nuevoColor,
                               String nuevaIluminacion, String nuevaRefrigeracion, Character nuevoTamanoChasis, int nuevoStock){

        Producto producto=this.buscarProducto(idProducto);
        producto.setNombreProducto(nuevoNombreProducto);
        producto.setDescripcionProducto(nuevaDescripcionProducto);
        producto.setPrecioProducto(nuevoPrecioProducto);
        producto.setImagenProducto(nuevaImagenProducto);
        producto.setColor(nuevoColor);
        producto.setIluminacion(nuevaIluminacion);
        producto.setRefrigeracion(nuevaRefrigeracion);
        producto.setTamanoChasis(nuevoTamanoChasis);
        producto.setStock(nuevoStock);



    }
    public List<Producto> listarProducto(){

        List<Producto> listaProducto=productoRepository.findAll();

        return listaProducto;



    }
}
