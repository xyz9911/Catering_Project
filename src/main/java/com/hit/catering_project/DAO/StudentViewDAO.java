package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.StudentViewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentViewDAO extends JpaRepository<StudentViewEntity,Long> {
    StudentViewEntity findBySid(int sid);
}
