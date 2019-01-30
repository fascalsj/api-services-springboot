package com.fascal.apiservices.repository;


import com.fascal.apiservices.entity.Provinsi;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fascal
 */
@Repository
public interface ProvinsiRepository extends JpaRepository<Provinsi, Long>{
    List<Provinsi> findAllByOrderByIdAsc();
}
