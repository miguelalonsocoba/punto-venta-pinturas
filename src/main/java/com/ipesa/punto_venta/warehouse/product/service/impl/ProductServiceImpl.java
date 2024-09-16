package com.ipesa.punto_venta.warehouse.product.service.impl;

import com.ipesa.punto_venta.warehouse.product.domain.entity.Product;
import com.ipesa.punto_venta.warehouse.product.domain.persistence.ProductDao;
import com.ipesa.punto_venta.warehouse.product.service.IProductService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    private ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao){
        this.productDao = productDao;
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public void deleteById(Integer id) {
        productDao.deleteById(id);
    }

    @Override
    public Product findById(Integer id) {
        Optional<Product> productOptional = productDao.findById(id);
        if (productOptional.isPresent()) {
            return productOptional.get();
        }
        System.out.println("No existe el producto con el id " + id);
        return null;
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
}
