package com.antoniiocg7.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniiocg7.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
