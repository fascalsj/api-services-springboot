package com.fascal.apiservices.repository.service.impl;


import com.fascal.apiservices.entity.Kota;
import com.fascal.apiservices.repository.KotaRepository;
import com.fascal.apiservices.repository.service.KotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import org.springframework.data.domain.Pageable;

@Service
@Transactional
public class KotaServiceImpl implements KotaService {

    @Autowired
    private KotaRepository kotaRepository;

    @Override
    public List<Kota> findAll(Pageable pageable) {
        return kotaRepository.findAllByOrderByIdAsc();
    }

    @Override
    public Kota findById(Long id) {
        
        return kotaRepository.getOne(id);
    }

    @Override
    public Kota create(Kota kota) {
        return kotaRepository.save(kota);
    }

    @Override
    public Kota update(Long id, Kota kota) {
        kota.setId(id);
        return kotaRepository.save(kota);
    }

    @Override
    public Kota delete(Long id) {
        Kota kota = findById(id);
        kotaRepository.deleteById(id);
        return kota;
    }

}
