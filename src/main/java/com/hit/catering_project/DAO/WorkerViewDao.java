package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.WorkerViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkerViewDao extends JpaRepository<WorkerViewEntity,Long> {
    WorkerViewEntity findByWid(int wid);

    List<WorkerViewEntity> findByCid(int cid);
}
