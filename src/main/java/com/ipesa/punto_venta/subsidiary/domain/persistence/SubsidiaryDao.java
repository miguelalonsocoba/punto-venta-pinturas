package com.ipesa.punto_venta.subsidiary.domain.persistence;

import com.ipesa.punto_venta.subsidiary.domain.entity.Subsidiary;
import org.springframework.data.repository.CrudRepository;

public interface SubsidiaryDao extends CrudRepository<Subsidiary, Integer> {
}
