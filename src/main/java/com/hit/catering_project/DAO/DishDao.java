package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface DishDao extends JpaRepository<DishEntity,Long> {
    List<DishEntity> findByWidAndIsdelete(int wid,Byte isdelete);
    @Query(value="SELECT DPRICE FROM dish WHERE DID=?1",nativeQuery=true)
    BigDecimal getPrice(int did);

    @Modifying
    @Query(value="INSERT INTO dish(WID,DNAME,DPRICE) VALUES(?1,?2,?3)",nativeQuery=true)
    int createDish(int wid, String dname, BigDecimal dprice);

    @Modifying
    @Query(value="INSERT INTO new_dish_notice(NCONTENT) VALUES(?1)",nativeQuery=true)
    int insertNotice(String content);

    @Modifying
    @Query(value="INSERT INTO notice_stu_relation(NID,SID) SELECT LAST_INSERT_ID(),SID FROM STUDENT",nativeQuery=true)
    int insertRelation();

    @Modifying
    @Query(value="UPDATE dish SET DAVAILABILITY=?1 WHERE DID=?2",nativeQuery=true)
    int updateDishStatus(Byte ava,int did);

    @Modifying
    @Query(value="UPDATE dish SET ISDELETE=1 WHERE DID=?1",nativeQuery=true)
    int deleteDish(int did);

    DishEntity findByDid(int did);

}
