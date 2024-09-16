package com.ipesa.punto_venta.warehouse.supplier.domain.persistence;

import com.ipesa.punto_venta.warehouse.supplier.domain.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierDao extends JpaRepository<Supplier, Integer> {
}
