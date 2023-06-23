package com.example.demo.domain.service;

import com.example.demo.domain.entity.Producto;

public interface IProductoService {
    public Producto[] getPorductsByUser(Long id);

    public Iterable<Producto> getAllProducts();

    public Producto getById(Long id);

    public Producto save(Producto producto);

    public void delete(Long id);
}
