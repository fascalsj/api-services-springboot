package com.fascal.apiservices.repository.service;


import com.fascal.apiservices.entity.Negara;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NegaraService {

    /**
     * Find all City
     *
     * @param pageable paging parameter
     * @return list of content
     */
    List<Negara> findAll(Pageable pageable);

    /**
     * Find City by Id
     *
     * @param id id of content
     * @return selected content
     */
    Negara findById(Long id);

    /**
     * Create City
     *
     * @param negara
     * @return created content
     */
    Negara create(Negara negara);

    /**
     * Update City based on Id
     *
     * @param id id of content
     * @param negara
     * @return updated content
     */
    Negara update(Long id, Negara negara);

    /**
     * Delete City based on Id
     *
     * @param id id of content
     * @return deleted content
     */
    Negara delete(Long id);
}
