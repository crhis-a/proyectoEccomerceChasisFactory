package com.ChasysFactory.online_store.controller;

import com.ChasysFactory.online_store.dto.UsuarioLoginDTO;
import com.ChasysFactory.online_store.model.UsuarioRegistrado;
import com.ChasysFactory.online_store.service.IUsuarioRegistradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioRegistradoController {

    @Autowired
    private IUsuarioRegistradoService usuarioRegistradoService;

    //Endpoint para obtener todas las personas registradas
    @GetMapping("/usuariosRegistrados/traer")
    public List<UsuarioRegistrado> listarUsuarios(){
        return usuarioRegistradoService.listarUsuarios();
    }

    //Endpoint para registrar un usuario
    @PostMapping("/usuariosRegistrados/crear")
    public ResponseEntity<String> guardarUsuario(@RequestBody UsuarioRegistrado usuario) {
        usuarioRegistradoService.guardarUsuario(usuario);
        return ResponseEntity.ok("El usuario fue registrado exitosamente");
    }

    @PostMapping("/usuariosRegistrados/login")
    public ResponseEntity<String> login(@RequestBody UsuarioLoginDTO usuarioLoginDTO) {
        String correo = usuarioLoginDTO.getCorreo();
        String password = usuarioLoginDTO.getPassword();
        UsuarioRegistrado usuario = usuarioRegistradoService.autenticarUsuario(correo, password);
        // Aquí va la lógica de autenticación
        if (usuario != null) {
            return ResponseEntity.ok("Inicio de sesión exitoso");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales incorrectas");
        }
    }

    //Endpoint para eliminar usuario registrado
    @DeleteMapping("/usuariosRegistrados/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Long id){
        usuarioRegistradoService.eliminarUsuario(id);
        return "el usuario regidtrado fue eliminado";
    }

    //Endpoint para modificar usuario
    @PutMapping("/usuariosRegistrados/editar/{id}")
    public UsuarioRegistrado editarUsuario(@PathVariable Long id,
    @RequestParam(required = false, name = "nombre") String nuevoNombreApellido,
                                           @RequestParam(required = false, name = "numeroCelular")String nuevoNumeroCelular,
                                           @RequestParam(required = false, name = "correo") String nuevoCorreo,
                                           @RequestParam(required = false, name = "password") String nuevoPassword ){

        usuarioRegistradoService.editarUsuario(id,nuevoNombreApellido,nuevoNumeroCelular,nuevoCorreo,nuevoPassword);
        UsuarioRegistrado usuarioRegistrado =usuarioRegistradoService.buscarUsuario(id);

        return usuarioRegistrado;
    }




}
