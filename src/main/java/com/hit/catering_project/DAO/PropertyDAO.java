package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.PropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyDAO extends JpaRepository<PropertyEntity,Long> {
    List<PropertyEntity> findAllByCid(int cid);
}
