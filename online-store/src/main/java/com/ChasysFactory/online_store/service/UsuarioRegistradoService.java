package com.ChasysFactory.online_store.service;

import java.util.List;
import com.ChasysFactory.online_store.model.UsuarioRegistrado;
import com.ChasysFactory.online_store.repository.IUsuarioRegistradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioRegistradoService implements IUsuarioRegistradoService {

    @Autowired
    private IUsuarioRegistradoRepository usuarioRegistradoRepository;

    @Override
    public void guardarUsuario(UsuarioRegistrado usuario){
        usuarioRegistradoRepository.save(usuario);



    }

    @Override
    public void eliminarUsuario(Long idusuario){
        usuarioRegistradoRepository.deleteById(idusuario);

    }
    @Override
    public UsuarioRegistrado buscarUsuario(Long idusuario){

        UsuarioRegistrado usuario=usuarioRegistradoRepository.findById(idusuario).orElse(null);

        return usuario;
    }

    @Override
    public void editarUsuario(Long idusuario, String nuevoNombreApellido,
                              String nuevoNumeroCelular, String nuevoCorreo,
                              String nuevoPassword){
        UsuarioRegistrado usuario=this.buscarUsuario(idusuario);
        usuario.setNombreApellido(nuevoNombreApellido);
        usuario.setNumeroCelular(nuevoNumeroCelular);
        usuario.setCorreo(nuevoCorreo);
        usuario.setPassword(nuevoPassword);
        this.guardarUsuario(usuario);

    }

    @Override
    public List<UsuarioRegistrado> listarUsuarios(){
        List<UsuarioRegistrado> listaUsuarios=usuarioRegistradoRepository.findAll();

        return listaUsuarios;
    }
    @Override
    public UsuarioRegistrado autenticarUsuario(String correo, String password) {
        return usuarioRegistradoRepository.findByCorreoAndPassword(correo, password).orElse(null);
    }

}
