package com.ipesa.punto_venta.subsidiary.service.impl;

import com.ipesa.punto_venta.subsidiary.domain.entity.Subsidiary;
import com.ipesa.punto_venta.subsidiary.domain.persistence.SubsidiaryDao;
import com.ipesa.punto_venta.subsidiary.service.ISubsidiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubsidiaryServiceImpl implements ISubsidiaryService {

    private final SubsidiaryDao subsidiaryDao;

    @Autowired
    public SubsidiaryServiceImpl(SubsidiaryDao subsidiaryDao) {
        this.subsidiaryDao = subsidiaryDao;
    }
    @Override
    public void save(Subsidiary subsidiary) {
        this.subsidiaryDao.save(subsidiary);
    }

    @Override
    public void deleteById(Integer id) {
        this.subsidiaryDao.deleteById(id);
    }

    @Override
    public Subsidiary findById(Integer id) {
        return subsidiaryDao.findById(id).orElse(null);
    }

    @Override
    public List<Subsidiary> findAll() {
        return (List<Subsidiary>) subsidiaryDao.findAll();
    }
}
