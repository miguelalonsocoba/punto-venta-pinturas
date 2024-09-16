package com.ipesa.punto_venta.warehouse.brand.service.impl;

import com.ipesa.punto_venta.warehouse.brand.domain.entities.Brand;
import com.ipesa.punto_venta.warehouse.brand.domain.persistence.BrandDao;
import com.ipesa.punto_venta.warehouse.brand.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements IBrandService {

    private final BrandDao brandDao;

    @Autowired
    public BrandServiceImpl(BrandDao brandDao) {
        this.brandDao = brandDao;
    }

    @Override
    public void save(Brand brand) {
        brandDao.save(brand);
    }

    @Override
    public void deleteById(Integer id) {
        brandDao.deleteById(id);
    }

    @Override
    public Brand findById(Integer id) {
        return brandDao.findById(id).orElse(null);
    }

    @Override
    public List<Brand> findAll() {
        return (List<Brand>) brandDao.findAll();
    }
}
