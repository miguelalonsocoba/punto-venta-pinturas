package com.ipesa.punto_venta.subsidiary.services.impl;

import com.ipesa.punto_venta.subsidiary.domain.entities.Subsidiary;
import com.ipesa.punto_venta.subsidiary.domain.persistence.SubsidiaryDao;
import com.ipesa.punto_venta.subsidiary.services.SubsidiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubsidiaryServiceImpl implements SubsidiaryService {

    private SubsidiaryDao subsidiaryDao;

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
