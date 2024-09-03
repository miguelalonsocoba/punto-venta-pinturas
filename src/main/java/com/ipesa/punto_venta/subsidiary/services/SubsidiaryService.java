package com.ipesa.punto_venta.subsidiary.services;

import com.ipesa.punto_venta.subsidiary.domain.entities.Subsidiary;

import java.util.List;

public interface SubsidiaryService {

    public void save(Subsidiary subsidiary);
    public void deleteById(Integer id);
    public Subsidiary findById(Integer id);
    public List<Subsidiary> findAll();
}
