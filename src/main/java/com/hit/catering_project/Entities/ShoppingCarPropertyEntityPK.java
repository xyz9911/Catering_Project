package com.hit.catering_project.Entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ShoppingCarPropertyEntityPK implements Serializable {
    private int carid;
    private int pid;

    @Column(name = "CARID")
    @Id
    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    @Column(name = "PID")
    @Id
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

        ShoppingCarPropertyEntityPK that = (ShoppingCarPropertyEntityPK) o;

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
