package com.ChasysFactory.online_store.repository;

import com.ChasysFactory.online_store.model.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetallePedidoRepository extends JpaRepository<DetallePedido, Long> {
}
