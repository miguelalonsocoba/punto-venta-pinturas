package com.ipesa.punto_venta.warehouse.product.service;

import com.ipesa.punto_venta.warehouse.product.domain.entity.Product;

import java.util.List;

public interface IProductService {

    void save(Product product);
    void deleteById(Integer id);
    Product findById(Integer id);
    List<Product> findAll();
}
