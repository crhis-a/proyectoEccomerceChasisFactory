package com.ChasysFactory.online_store.controller;


import com.ChasysFactory.online_store.model.Pedido;
import com.ChasysFactory.online_store.model.UsuarioRegistrado;
import com.ChasysFactory.online_store.service.IPedidoService;
import com.ChasysFactory.online_store.service.IUsuarioRegistradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PedidoController {

    @Autowired
     private IPedidoService pedidoService;


    //Endpoint para obtener todas los pedidos registrados
    @GetMapping("/pedidos/traer")
    public List<Pedido> listarPedido(){
           return pedidoService.listarPedido();

    }

    //Endpoint para registrar un pedido nuevo
    @PostMapping("/pedidos/crear")
    public String guardarPedido(@RequestBody Pedido pedido){
          pedidoService.guardarPedido(pedido);

        return "el pedido fue registrado";
    }

    //Endpoint para eliminar pedido registrado
    @DeleteMapping("/pedidos/eliminar/{id}")
    public String eliminarPedido(@PathVariable Long id){
            pedidoService.eliminarPedido(id);

        return "el pedido regidtrado fue eliminado";
    }

    //Endpoint para modificar pedido
    @PutMapping("/pedidos/editar/{id}")
    public Pedido editarPedido(@PathVariable Long id,
                                           @RequestParam(required = false, name = "fechaPedido") LocalDate nuevoFechaPedido,
                                           @RequestParam(required = false, name = "estadoPedido")String nuevoEstadoPedido,
                                           @RequestParam(required = false, name = "totalPrecio") Double nuevoTotalPrecio,
                                           @RequestParam(required = false, name = "direccionPedido") String  nuevoDireccionPedido,
                                          @RequestParam(required = false, name = "ciudadPedido") String  nuevaciudadPedido,
                                          @RequestParam(required = false, name = "departamentoPedido") String  nuevodepartamentoPedido,
                                          @RequestParam(required = false, name = "detallesAdiccionalesPedido") String  nuevoDetallesAdiccionalesPedido)

    {
        pedidoService.editarPedido(id,nuevoFechaPedido,nuevoEstadoPedido,nuevoTotalPrecio,nuevoDireccionPedido
        ,nuevaciudadPedido,nuevodepartamentoPedido,nuevoDetallesAdiccionalesPedido);

        Pedido pedido=pedidoService.buscarPedido(id);

        return pedido;

    }

}
