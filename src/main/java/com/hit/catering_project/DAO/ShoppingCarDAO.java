package com.hit.catering_project.DAO;

import com.hit.catering_project.Entities.ShoppingCarEntity;
import com.hit.catering_project.Show.CategoryValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShoppingCarDAO extends JpaRepository<ShoppingCarEntity,Long> {
    @Query(value = "select shoppingCar from ShoppingCarEntity shoppingCar where shoppingCar.did in (select did from DishEntity where wid in (select wid from WorkerEntity where cid=?1) and shoppingCar.sid=?2)")
    List<ShoppingCarEntity> findShoppingCarByCidAndSid(int cid,int sid);

    @Query(value = "select new com.hit.catering_project.Show.CategoryValue(cate.cid,car.pid,cate.cname,pro.pname) from ShoppingCarPropertyEntity car inner join PropertyEntity pro on car.pid =pro.pid inner join CategoryEntity cate on pro.cid=cate.cid where car.carid=?1")
    List<CategoryValue> findCategoryValue(int carid);

    @Modifying
    @Query(value = "update ShoppingCarEntity set snum=snum-1 where carid=?1")
    int minusShoppingGoods(int carid);

    int deleteShoppingCarEntityByCarid(int carid);

    ShoppingCarEntity findBySidAndDid(int sid,int did);

    @Modifying
    @Query(value = "INSERT INTO shopping_car(SID, DID, SNUM) values (?1,?2,1)",nativeQuery = true)
    int insertShoppingGoods(int sid,int did);

    @Modifying
    @Query(value = "update ShoppingCarEntity set snum=snum+1 where sid=?1 and did=?2")
    int addShoppingGoods(int sid,int did);

    int existsBySidAndDid(int sid,int did);
}
