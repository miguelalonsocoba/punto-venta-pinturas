package com.ipesa.punto_venta.warehouse.type_product.service;

import com.ipesa.punto_venta.warehouse.type_product.domain.entities.ProductType;

import java.util.List;

public interface IProductTypeService {

    void save(ProductType productType);
    void deleteById(Integer id);
    ProductType findById(Integer id);
    List<ProductType> findAll();
}
