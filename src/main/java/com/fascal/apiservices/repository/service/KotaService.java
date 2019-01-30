package com.fascal.apiservices.repository.service;


import com.fascal.apiservices.entity.Kota;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KotaService {

    /**
     * Find all City
     *
     * @param pageable paging parameter
     * @return list of content
     */
    List<Kota> findAll(Pageable pageable);

    /**
     * Find City by Id
     *
     * @param id id of content
     * @return selected content
     */
    Kota findById(Long id);

    /**
     * Create City
     *
     * @param kota
     * @return created content
     */
    Kota create(Kota kota);

    /**
     * Update City based on Id
     *
     * @param id id of content
     * @param kota
     * @return updated content
     */
    Kota update(Long id, Kota kota);

    /**
     * Delete City based on Id
     *
     * @param id id of content
     * @return deleted content
     */
    Kota delete(Long id);
}
