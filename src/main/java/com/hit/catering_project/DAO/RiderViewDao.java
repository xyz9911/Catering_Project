package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.RiderViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiderViewDao extends JpaRepository<RiderViewEntity,Long> {
    RiderViewEntity findByRid(int rid);
}
