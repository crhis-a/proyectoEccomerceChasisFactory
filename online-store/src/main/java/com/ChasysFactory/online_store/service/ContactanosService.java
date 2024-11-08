package com.ChasysFactory.online_store.service;

import com.ChasysFactory.online_store.model.Contactanos;
import com.ChasysFactory.online_store.model.UsuarioRegistrado;
import com.ChasysFactory.online_store.repository.IContactanosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactanosService implements IContactanosService {

    @Autowired
    private IContactanosRepository contactanosRepository;

    @Override
    public void guardarContactanos(Contactanos contactanos){
        contactanosRepository.save(contactanos);
    }
    @Override
    public void eliminarContactanos(Long idContactanos){
        contactanosRepository.deleteById(idContactanos);

    }
    @Override
    public Contactanos buscarContactanos(Long idContactanos){

        Contactanos contactanos=contactanosRepository.findById(idContactanos).orElse(null);

        return contactanos;

    }
    @Override
    public void editarContactanos(Long idContactanos, String nuevoNombreApellido, String nuevoCorreoContacto,
                                  String nuevoTelefonoContacto, String nuevoMensajeContacto){

        Contactanos contactanos=this.buscarContactanos(idContactanos);
        contactanos.setNombreApellido(nuevoNombreApellido);
        contactanos.setCorreoContacto(nuevoCorreoContacto);
        contactanos.setTelefonoContacto(nuevoTelefonoContacto);
        contactanos.setMensajeContacto(nuevoMensajeContacto);

        this.guardarContactanos(contactanos);



    }
    @Override
    public List<Contactanos> listarContacto(){

        List<Contactanos> listaContactanos=contactanosRepository.findAll();



        return listaContactanos;



    }





}
