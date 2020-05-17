package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.RiderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RiderDao extends JpaRepository<RiderEntity,Long> {
    @Query(value="SELECT RID FROM rider WHERE RNAME=?1 and RPASSWORD=?2 AND ISDELETE=0",nativeQuery=true)
    int riderLogin(String name,String password);

}
