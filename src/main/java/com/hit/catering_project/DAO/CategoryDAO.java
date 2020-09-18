package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDAO extends JpaRepository<CategoryEntity,Long> {
    List<CategoryEntity> findAllByDid(int did);
}
