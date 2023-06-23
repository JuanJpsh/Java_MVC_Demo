package com.example.demo.access.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.domain.entity.Usuario;


public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
    
    @Query("select c from Usuario c where c.usuario = ?1 and c.clave = ?2")
	Usuario findByUserPassword(String usuario, String clave);
}
