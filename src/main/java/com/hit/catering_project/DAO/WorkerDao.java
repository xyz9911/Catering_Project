package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkerDao extends JpaRepository<WorkerEntity,Long> {
    @Query(value="SELECT WID FROM worker WHERE WNAME=?1 AND WPASSWORD=?2 AND ISDELETE=0",nativeQuery=true)
    int wrkLogin(String name,String password);

    @Modifying
    @Query(value="UPDATE worker SET WBALANCE = WBALANCE + (SELECT OPRICE from orders where OID=?1) WHERE WID IN(SELECT WID FROM orders WHERE OID=?1)",nativeQuery=true)
    int addBalance(int oid);

}
