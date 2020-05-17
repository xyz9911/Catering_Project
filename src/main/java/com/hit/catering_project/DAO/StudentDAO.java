package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface StudentDAO extends JpaRepository<StudentEntity,Long> {
    @Query(value="SELECT SID FROM student WHERE SNAME=?1 AND SPASSWORD=?2 AND ISDELETE=0",nativeQuery=true)
    int stuLogin(String name,String password);

    @Modifying
    @Query(value="UPDATE student SET SBALANCE = SBALANCE- (SELECT OPRICE from orders where OID=?1) WHERE SID IN(SELECT SID FROM orders WHERE OID=?1)",nativeQuery=true)
    int spendBalance(int oid);

}
