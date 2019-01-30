package com.fascal.apiservices.repository;



import com.fascal.apiservices.entity.Kota;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fascal
 */
@Repository
public interface KotaRepository extends JpaRepository<Kota, Long>{
    List<Kota> findAllByOrderByIdAsc();
}
