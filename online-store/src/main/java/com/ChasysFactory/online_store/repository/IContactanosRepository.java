package com.ChasysFactory.online_store.repository;

import com.ChasysFactory.online_store.model.Contactanos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactanosRepository extends JpaRepository<Contactanos, Long> {
}
