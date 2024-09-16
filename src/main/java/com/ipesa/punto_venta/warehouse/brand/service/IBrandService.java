package com.ipesa.punto_venta.warehouse.brand.service;

import com.ipesa.punto_venta.warehouse.brand.domain.entities.Brand;

import java.util.List;

public interface IBrandService {

    void save(Brand brand);
    void deleteById(Integer id);
    Brand findById(Integer id);
    List<Brand> findAll();
}
