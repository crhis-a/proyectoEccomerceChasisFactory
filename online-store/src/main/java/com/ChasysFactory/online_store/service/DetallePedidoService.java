package com.ChasysFactory.online_store.service;

import com.ChasysFactory.online_store.model.Contactanos;
import com.ChasysFactory.online_store.model.DetallePedido;
import com.ChasysFactory.online_store.repository.IDetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService implements IDetallePedidoService{

    @Autowired
    private IDetallePedidoRepository detallePedidoRepository;

    @Override
    public void guardarDetallePedido(DetallePedido detallePedido){
        detallePedidoRepository.save(detallePedido);
    }
    @Override
    public void eliminarDetallePedido(Long idDetallePedido){
        detallePedidoRepository.deleteById(idDetallePedido);
    }
    @Override
    public DetallePedido buscarDetallePedido(Long idDetallePedido){
            DetallePedido detallePedido=detallePedidoRepository.findById(idDetallePedido).orElse(null);
        return detallePedido;
    }
    @Override
    public void editarDetallePedido(Long idDetallePedido, int nuevoCantidadProducto, Double nuevoPrecioProducto
                                   ){
        DetallePedido detallePedido=this.buscarDetallePedido(idDetallePedido);
        detallePedido.setCantidadProducto(nuevoCantidadProducto);
        detallePedido.setPrecioProducto(nuevoPrecioProducto);
        this.guardarDetallePedido(detallePedido);

    }
    @Override
    public List<DetallePedido> listarDetallesPedido() {


        List<DetallePedido> listaDetallePedido = detallePedidoRepository.findAll();


        return listaDetallePedido;
    }






}
