package com.ipesa.punto_venta.warehouse.supplier.service.impl;

import com.ipesa.punto_venta.warehouse.supplier.domain.entities.Supplier;
import com.ipesa.punto_venta.warehouse.supplier.domain.persistence.SupplierDao;
import com.ipesa.punto_venta.warehouse.supplier.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements ISupplierService {

    private final SupplierDao supplierDao;

    @Autowired
    public SupplierServiceImpl(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    @Override
    public void save(Supplier supplier) {
        supplierDao.save(supplier);
    }

    @Override
    public void deleteById(Integer id) {
        supplierDao.deleteById(id);
    }

    @Override
    public Supplier findById(Integer id) {
        return supplierDao.findById(id).orElse(null);
    }

    @Override
    public List<Supplier> findAll() {
        return (List<Supplier>) supplierDao.findAll();
    }
}
