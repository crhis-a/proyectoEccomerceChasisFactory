package com.ChasysFactory.online_store.service;

import com.ChasysFactory.online_store.model.UsuarioRegistrado;

import java.util.List;

public interface IUsuarioRegistradoService {


    public void guardarUsuario(UsuarioRegistrado usuario);
    public void eliminarUsuario(Long idusuario);
    public UsuarioRegistrado buscarUsuario(Long idusuario);
    public void editarUsuario(Long idusuario, String nuevoNombreApellido,
                              String nuevoNumeroCelular, String nuevoCorreo,
                              String nuevoPassword);
    public List<UsuarioRegistrado> listarUsuarios();
    UsuarioRegistrado autenticarUsuario(String correo, String password);
}
