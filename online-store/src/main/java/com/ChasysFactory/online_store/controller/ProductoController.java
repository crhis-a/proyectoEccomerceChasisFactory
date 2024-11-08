package com.ChasysFactory.online_store.controller;

import com.ChasysFactory.online_store.model.Producto;
import com.ChasysFactory.online_store.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    // Endpoint para obtener todos los productos
    @GetMapping("/traer")
    public List<Producto> listarProductos() {
        return productoService.listarProducto();
    }

    // Endpoint para registrar un nuevo producto
    @PostMapping("/crear")
    public String guardarProducto(@RequestBody Producto producto) {
        productoService.guardarProducto(producto);
        return "El producto ha sido registrado exitosamente";
    }

    // Endpoint para eliminar un producto por su ID
    @DeleteMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return "El producto ha sido eliminado";
    }

    // Endpoint para editar los detalles de un producto
    @PutMapping("/editar/{id}")
    public Producto editarProducto(
            @PathVariable Long id,
            @RequestParam(required = false,name = "nombreProducto") String nuevoNombreProducto,
            @RequestParam(required = false,name = "descripcionProducto") String nuevaDescripcionProducto,
            @RequestParam(required = false,name = "PrecioProducto") Double nuevoPrecioProducto,
            @RequestParam(required = false,name = "imagenProducto") byte[] nuevaImagenProducto,
            @RequestParam(required = false,name = "color") String nuevoColor,
            @RequestParam(required = false,name = "iluminacion") String nuevaIluminacion,
            @RequestParam(required = false,name = "refrigeracion") String nuevaRefrigeracion,
            @RequestParam(required = false,name = "tamanoChasis") Character nuevoTamanoChasis,
            @RequestParam(required = false,name = "stock") int nuevoStock) {

        productoService.editarProducto(id, nuevoNombreProducto, nuevaDescripcionProducto, nuevoPrecioProducto, nuevaImagenProducto, nuevoColor,
                nuevaIluminacion, nuevaRefrigeracion, nuevoTamanoChasis, nuevoStock);
        return productoService.buscarProducto(id);
    }

    // Endpoint para obtener un producto específico por ID
    @GetMapping("/buscar/{id}")
    public Producto buscarProducto(@PathVariable Long id) {
        return productoService.buscarProducto(id);
    }
}
