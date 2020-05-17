package com.hit.catering_project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "order_dish_relation", schema = "catering_system", catalog = "")
@IdClass(OrderDishRelationEntityPK.class)
public class OrderDishRelationEntity {
    private int oid;
    private int did;
    private int servings;

    @Id
    @Column(name = "OID", nullable = false)
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Id
    @Column(name = "DID", nullable = false)
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Basic
    @Column(name = "SERVINGS", nullable = false)
    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderDishRelationEntity that = (OrderDishRelationEntity) o;

        if (oid != that.oid) return false;
        if (did != that.did) return false;
        if (servings != that.servings) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oid;
        result = 31 * result + did;
        result = 31 * result + servings;
        return result;
    }
}
