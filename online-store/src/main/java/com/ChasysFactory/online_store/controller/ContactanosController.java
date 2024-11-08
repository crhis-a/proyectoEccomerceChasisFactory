package com.ChasysFactory.online_store.controller;

import com.ChasysFactory.online_store.model.Contactanos;
import com.ChasysFactory.online_store.service.IContactanosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contactanos")
public class ContactanosController {

    @Autowired
    private IContactanosService contactanosService;

    // Endpoint para listar todos los contactos
    @GetMapping("/traer")
    public List<Contactanos> listarContactos() {
        return contactanosService.listarContacto();
    }

    // Endpoint para crear un nuevo contacto
    @PostMapping("/crear")
    public String guardarContactanos(@RequestBody Contactanos contactanos) {
        contactanosService.guardarContactanos(contactanos);
        return "El contacto ha sido registrado exitosamente";
    }

    // Endpoint para buscar un contacto por su ID
    @GetMapping("/buscar/{id}")
    public Contactanos buscarContactanos(@PathVariable Long id) {
        return contactanosService.buscarContactanos(id);
    }

    // Endpoint para editar un contacto
    @PutMapping("/editar/{id}")
    public String editarContactanos(@PathVariable Long id,
                                    @RequestParam(required = false,name = "nombreApellido" ) String nuevoNombreApellido,
                                    @RequestParam(required = false,name ="correoContacto") String nuevoCorreoContacto,
                                    @RequestParam(required = false,name ="telefonoContacto") String nuevoTelefonoContacto,
                                    @RequestParam(required = false,name ="mensajeContacto") String nuevoMensajeContacto) {
        contactanosService.editarContactanos(id, nuevoNombreApellido, nuevoCorreoContacto, nuevoTelefonoContacto, nuevoMensajeContacto);
        return "El contacto ha sido actualizado exitosamente";
    }

    // Endpoint para eliminar un contacto por su ID
    @DeleteMapping("/eliminar/{id}")
    public String eliminarContactanos(@PathVariable Long id) {
        contactanosService.eliminarContactanos(id);
        return "El contacto ha sido eliminado exitosamente";
    }
}
