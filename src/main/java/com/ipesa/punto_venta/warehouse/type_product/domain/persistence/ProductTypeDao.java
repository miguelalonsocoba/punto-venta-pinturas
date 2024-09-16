package com.ipesa.punto_venta.warehouse.type_product.domain.persistence;

import com.ipesa.punto_venta.warehouse.type_product.domain.entities.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeDao extends JpaRepository<ProductType, Integer> {
}
