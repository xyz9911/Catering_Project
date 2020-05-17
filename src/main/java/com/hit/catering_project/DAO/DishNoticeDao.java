package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.NewDishNoticeEntity;
import com.hit.catering_project.Entities.OrderUpdNoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DishNoticeDao extends JpaRepository<NewDishNoticeEntity,Long> {
    @Query(value="SELECT notice FROM NewDishNoticeEntity notice WHERE notice.nid IN(SELECT nid FROM NoticeStuRelationEntity WHERE sid=?1 AND isread=0)")
    List<NewDishNoticeEntity> getUnreadNotice(int sid);

    @Modifying
    @Query(value="UPDATE notice_stu_relation SET ISREAD=1 WHERE SID=?1",nativeQuery=true)
    int readAllNotice(int sid);
}
