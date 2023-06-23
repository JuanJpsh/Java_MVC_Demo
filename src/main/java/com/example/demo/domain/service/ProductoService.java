package com.example.demo.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.access.dao.IProductoDao;
import com.example.demo.domain.entity.Producto;


@Service
public class ProductoService implements IProductoService{

    @Autowired
	private IProductoDao productoDao;

    @Override
    public Producto[] getPorductsByUser(Long id) {
        return productoDao.findByUserId(id);
    }

    @Override
    public Iterable<Producto> getAllProducts() {
        return productoDao.findAll();
    }

    @Override
    public Producto getById(Long id){
        Producto producto = productoDao.findById(id).orElse(null);
		if (producto == null) {
			return new Producto(0L, "", 0);
		}
		return producto;
    }

    @Override
    public Producto save(Producto producto){
        return productoDao.save(producto);
    }

    @Override
    public void delete(Long id) {
        productoDao.deleteById(id);
    }
}
