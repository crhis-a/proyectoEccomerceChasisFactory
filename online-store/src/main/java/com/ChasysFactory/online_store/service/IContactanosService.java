package com.ChasysFactory.online_store.service;

import com.ChasysFactory.online_store.model.Contactanos;
import com.ChasysFactory.online_store.model.Pedido;

import java.time.LocalDate;
import java.util.List;

public interface IContactanosService {

    public void guardarContactanos(Contactanos contactanos);
    public void eliminarContactanos(Long idContactanos);
    public Contactanos buscarContactanos(Long idContactanos);
    public void editarContactanos(Long idContactanos, String nuevoNombreApellido, String nuevoCorreoContacto,
                                  String nuevoTelefonoContacto, String nuevoMensajeContacto);
    public List<Contactanos> listarContacto();
}
