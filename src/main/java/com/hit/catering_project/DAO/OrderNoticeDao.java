package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.OrderUpdNoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderNoticeDao extends JpaRepository<OrderUpdNoticeEntity,Long> {
    @Query(value="select notice from OrderUpdNoticeEntity notice where notice.oid in (select oid from OrdersEntity where iscanceled=0 and sid=?1) and notice.isread=0")
    List<OrderUpdNoticeEntity> getUnreadNotice(int sid);

    @Modifying
    @Query(value="UPDATE order_upd_notice SET ISREAD=1 WHERE OID IN(SELECT OID FROM orders WHERE SID=?1)",nativeQuery=true)
    int readAllNotice(int sid);

    @Query(value="select notice from OrderUpdNoticeEntity notice where notice.oid in (select oid from OrdersEntity where iscanceled=0 and wid=?1) and notice.wisread=0")
    List<OrderUpdNoticeEntity> getWorkerUnreadNotice(int wid);

    @Modifying
    @Query(value="UPDATE order_upd_notice SET WISREAD=1 WHERE OID IN(SELECT OID FROM orders WHERE WID=?1)",nativeQuery=true)
    int readWorkerAllNotice(int wid);

    @Modifying
    @Query(value="INSERT INTO order_upd_notice(OID,NCONTENT) VALUES(?1,?2)",nativeQuery=true)
    int updateNotice(int oid,String ncontent);

}
