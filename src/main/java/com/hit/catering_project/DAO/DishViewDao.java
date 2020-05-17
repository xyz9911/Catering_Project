package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.DishViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DishViewDao extends JpaRepository<DishViewEntity,Long> {
    List<DishViewEntity> findAll();
    List<DishViewEntity> findByWnameContains(String name);
}
