package com.fascal.apiservices.repository.service.impl;


import com.fascal.apiservices.entity.Negara;
import com.fascal.apiservices.repository.NegaraRepository;
import com.fascal.apiservices.repository.service.NegaraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import org.springframework.data.domain.Pageable;

@Service
@Transactional
public class NegaraServiceImpl implements NegaraService {

    @Autowired
    private NegaraRepository negaraRepository;

    @Override
    public List<Negara> findAll(Pageable pageable) {
        return negaraRepository.findAllByOrderByIdAsc();
    }

    @Override
    public Negara findById(Long id) {
        
        return negaraRepository.getOne(id);
    }

    @Override
    public Negara create(Negara negara) {
        return negaraRepository.save(negara);
    }

    @Override
    public Negara update(Long id, Negara negara) {
        negara.setId(id);
        return negaraRepository.save(negara);
    }

    @Override
    public Negara delete(Long id) {
        Negara negara = findById(id);
        negaraRepository.deleteById(id);
        return negara;
    }

}
