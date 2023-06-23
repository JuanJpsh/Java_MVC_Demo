package com.example.demo.access.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{
    
    @Query("select c from Producto c where c.usuario.id = ?1")
	Producto[] findByUserId(Long idUser);
}
