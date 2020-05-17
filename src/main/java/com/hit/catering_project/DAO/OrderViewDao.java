package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.OrdersViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderViewDao extends JpaRepository<OrdersViewEntity,Long> {
    List<OrdersViewEntity> findBySid(int sid);
    List<OrdersViewEntity> findByWid(int wid);
}
