package com.ChasysFactory.online_store.repository;

import com.ChasysFactory.online_store.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,Long> {



}
