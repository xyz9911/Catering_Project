package com.hit.catering_project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "shopping_car_property", schema = "catering_system", catalog = "")
@IdClass(ShoppingCarPropertyEntityPK.class)
public class ShoppingCarPropertyEntity {
    private int carid;
    private int pid;

    @Id
    @Column(name = "CARID")
    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    @Id
    @Column(name = "PID")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCarPropertyEntity that = (ShoppingCarPropertyEntity) o;

        if (carid != that.carid) return false;
        if (pid != that.pid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carid;
        result = 31 * result + pid;
        return result;
    }
}
