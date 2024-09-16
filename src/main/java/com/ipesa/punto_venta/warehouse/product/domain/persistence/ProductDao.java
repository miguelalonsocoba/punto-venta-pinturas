package com.ipesa.punto_venta.warehouse.product.domain.persistence;

import com.ipesa.punto_venta.warehouse.product.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
