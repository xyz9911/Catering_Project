package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.CanteenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CanteenDAO extends JpaRepository<CanteenEntity,Long> {
    CanteenEntity findByCid(int cid);
}
