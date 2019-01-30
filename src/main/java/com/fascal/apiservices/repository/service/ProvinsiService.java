package com.fascal.apiservices.repository.service;


import com.fascal.apiservices.entity.Provinsi;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProvinsiService {

    /**
     * Find all City
     *
     * @param pageable paging parameter
     * @return list of content
     */
    List<Provinsi> findAll(Pageable pageable);

    /**
     * Find City by Id
     *
     * @param id id of content
     * @return selected content
     */
    Provinsi findById(Long id);

    /**
     * Create City
     *
     * @param provinsi
     * @return created content
     */
    Provinsi create(Provinsi provinsi);

    /**
     * Update City based on Id
     *
     * @param id id of content
     * @param provinsi
     * @return updated content
     */
    Provinsi update(Long id, Provinsi provinsi);

    /**
     * Delete City based on Id
     *
     * @param id id of content
     * @return deleted content
     */
    Provinsi delete(Long id);
}
