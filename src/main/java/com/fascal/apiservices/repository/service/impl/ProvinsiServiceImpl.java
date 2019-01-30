package com.fascal.apiservices.repository.service.impl;


import com.fascal.apiservices.entity.Provinsi;
import com.fascal.apiservices.repository.ProvinsiRepository;
import com.fascal.apiservices.repository.service.ProvinsiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import org.springframework.data.domain.Pageable;

@Service
@Transactional
public class ProvinsiServiceImpl implements ProvinsiService {

    @Autowired
    private ProvinsiRepository provinsiRepository;

    @Override
    public List<Provinsi> findAll(Pageable pageable) {
        return provinsiRepository.findAllByOrderByIdAsc();
    }

    @Override
    public Provinsi findById(Long id) {
        
        return provinsiRepository.getOne(id);
    }

    @Override
    public Provinsi create(Provinsi provinsi) {
        return provinsiRepository.save(provinsi);
    }

    @Override
    public Provinsi update(Long id, Provinsi provinsi) {
        provinsi.setId(id);
        return provinsiRepository.save(provinsi);
    }

    @Override
    public Provinsi delete(Long id) {
        Provinsi provinsi = findById(id);
        provinsiRepository.deleteById(id);
        return provinsi;
    }

}
