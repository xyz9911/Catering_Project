package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface OrdersDao extends JpaRepository<OrdersEntity,Long> {
    @Modifying
    @Query(value="INSERT INTO orders(SID,WID,OPRICE) values(?1,?2,?3)",nativeQuery=true)
    int createOrder(int sid, int wid, BigDecimal price);

    @Modifying
    @Query(value="INSERT INTO order_dish_relation values(LAST_INSERT_ID(),?1,?2)",nativeQuery=true)
    int createRelation(int did, int servings);

    @Modifying
    @Query(value="INSERT INTO order_upd_notice(OID,NCONTENT) values(LAST_INSERT_ID(),?1)",nativeQuery=true)
    int createNotice(String content);

    @Modifying
    @Query(value="UPDATE orders SET ISCANCELED=1 WHERE OID=?1 AND ISTAKEN=0",nativeQuery=true)
    int cancelOrder(int oid);

    @Query(value="SELECT DNAME,SERVINGS FROM order_dish_relation NATURAL JOIN dish WHERE OID=?1 AND OID IN(SELECT OID FROM orders WHERE SID=?2)",nativeQuery=true)
    List<Object> getOrderInfo(int oid, int sid);

    @Query(value="SELECT DNAME,SERVINGS FROM order_dish_relation NATURAL JOIN dish WHERE OID=?1 AND OID IN(SELECT OID FROM orders WHERE WID=?2)",nativeQuery=true)
    List<Object> getWorkerOrderInfo(int oid, int wid);

    @Modifying
    @Query(value="INSERT INTO comment VALUES(?1,?2,?3)",nativeQuery=true)
    int commentOrder(int oid,Byte wrate,Byte rrate);

    @Modifying
    @Query(value="UPDATE orders SET ISTAKEN=1 WHERE OID=?1 AND ISCANCELED=0",nativeQuery=true)
    int takeOrder(int oid);

    @Query(value="SELECT OID,ODATE,OPRICE,WNAME,SNAME,SADDRESS,SCONTACT FROM orders NATURAL JOIN student NATURAL JOIN worker WHERE RID is NULL AND ISTAKEN=1 AND ISCANCELED=0",nativeQuery=true)
    List<Object> getTakableOrders();

    @Modifying
    @Query(value="UPDATE orders SET RID=?1 WHERE OID=?2",nativeQuery=true)
    int riderTakeOrder(int rid,int oid);

    List<OrdersEntity> findBySidAndIscanceledAndAndIstaken(int sid,Byte iscanceled,Byte istaken);

    List<OrdersEntity> findByWidAndIscanceledAndAndIstaken(int wid,Byte iscanceled,Byte istaken);
}
