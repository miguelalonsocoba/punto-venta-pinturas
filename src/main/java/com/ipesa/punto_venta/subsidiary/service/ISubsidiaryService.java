package com.ipesa.punto_venta.subsidiary.service;

import com.ipesa.punto_venta.subsidiary.domain.entity.Subsidiary;

import java.util.List;

public interface ISubsidiaryService {

    void save(Subsidiary subsidiary);
    void deleteById(Integer id);
    Subsidiary findById(Integer id);
    List<Subsidiary> findAll();
}
