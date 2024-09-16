package com.ipesa.punto_venta.warehouse.type_product.service.impl;

import com.ipesa.punto_venta.warehouse.type_product.domain.entities.ProductType;
import com.ipesa.punto_venta.warehouse.type_product.domain.persistence.ProductTypeDao;
import com.ipesa.punto_venta.warehouse.type_product.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements IProductTypeService {

    private final ProductTypeDao productTypeDao;

    @Autowired
    public ProductTypeServiceImpl(ProductTypeDao productTypeDao) {
        this.productTypeDao = productTypeDao;
    }

    @Override
    public void save(ProductType productType) {
        productTypeDao.save(productType);
    }

    @Override
    public void deleteById(Integer id) {
        productTypeDao.deleteById(id);
    }

    @Override
    public ProductType findById(Integer id) {
        return productTypeDao.findById(id).orElse(null);
    }

    @Override
    public List<ProductType> findAll() {
        return (List<ProductType>) productTypeDao.findAll();
    }
}
