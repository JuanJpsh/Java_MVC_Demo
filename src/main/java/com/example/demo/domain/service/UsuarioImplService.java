package com.example.demo.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.access.dao.IUsuarioDao;
import com.example.demo.domain.entity.Usuario;

@Service
public class UsuarioImplService implements IUsuarioService{

    @Autowired
	private IUsuarioDao usuarioDao;

    @Override
    public Usuario findByUserPassword(String prmUser, String password) {
        Usuario varUser = usuarioDao.findByUserPassword(prmUser, password);
        if (varUser == null) {
			return new Usuario(0L, "", "");
		}
		return varUser;
    }

    @Override
    public Usuario findById(Long id) {
        Usuario user = usuarioDao.findById(id).orElse(null);
		if (user == null) {
			return new Usuario(0L, "", "");
		}
		return user;
    }
    
}