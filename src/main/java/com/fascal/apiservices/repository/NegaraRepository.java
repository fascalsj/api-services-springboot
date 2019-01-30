package com.fascal.apiservices.repository;


import com.fascal.apiservices.entity.Negara;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fascal
 */
@Repository
public interface NegaraRepository extends JpaRepository<Negara, Long>{
    List<Negara> findAllByOrderByIdAsc();
}
