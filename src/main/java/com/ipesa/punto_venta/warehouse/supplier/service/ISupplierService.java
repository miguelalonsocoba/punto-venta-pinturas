package com.ipesa.punto_venta.warehouse.supplier.service;

import com.ipesa.punto_venta.warehouse.supplier.domain.entities.Supplier;

import java.util.List;

public interface ISupplierService {

    void save(Supplier supplier);
    void deleteById(Integer id);
    Supplier findById(Integer id);
    List<Supplier> findAll();
}
