package com.ChasysFactory.online_store.controller;

import com.ChasysFactory.online_store.model.DetallePedido;
import com.ChasysFactory.online_store.service.IDetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detallesPedido")
public class DetallePedidoController {

    @Autowired
    private IDetallePedidoService detallePedidoService;

    // Endpoint para obtener todos los detalles de pedido
    @GetMapping("/traer")
    public List<DetallePedido> listarDetallesPedido() {
        return detallePedidoService.listarDetallesPedido();
    }

    // Endpoint para crear un nuevo detalle de pedido
    @PostMapping("/crear")
    public String guardarDetallePedido(@RequestBody DetallePedido detallePedido) {
        detallePedidoService.guardarDetallePedido(detallePedido);
        return "El detalle de pedido ha sido registrado exitosamente";
    }

    // Endpoint para obtener un detalle de pedido por su ID
    @GetMapping("/buscar/{id}")
    public DetallePedido buscarDetallePedido(@PathVariable Long id) {
        return detallePedidoService.buscarDetallePedido(id);
    }

    // Endpoint para actualizar un detalle de pedido
    @PutMapping("/editar/{id}")
    public String editarDetallePedido(@PathVariable Long id,
                                      @RequestParam(required = false,name = "cantidadProducto") int nuevaCantidadProducto,
                                        @RequestParam(required = false,name = "precioProducto")double nuevoPrecioProducto
                                       )
                                       {
        detallePedidoService.editarDetallePedido(id, nuevaCantidadProducto, nuevoPrecioProducto);
        return "El detalle de pedido ha sido actualizado exitosamente";
    }

    // Endpoint para eliminar un detalle de pedido por su ID
    @DeleteMapping("/eliminar/{id}")
    public String eliminarDetallePedido(@PathVariable Long id) {
        detallePedidoService.eliminarDetallePedido(id);
        return "El detalle de pedido ha sido eliminado exitosamente";
    }
}
