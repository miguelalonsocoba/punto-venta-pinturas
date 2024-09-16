package com.ipesa.punto_venta.warehouse.brand.domain.persistence;

import com.ipesa.punto_venta.warehouse.brand.domain.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandDao extends JpaRepository<Brand, Integer> {
}
