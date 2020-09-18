package com.hit.catering_project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "rider_view", schema = "catering_system", catalog = "")
public class RiderViewEntity {
    private int rid;
    private String rname;
    private String rcontact;
    private byte rrating;

    @Basic
    @Id
    @Column(name = "RID")
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "RNAME")
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Basic
    @Column(name = "RCONTACT")
    public String getRcontact() {
        return rcontact;
    }

    public void setRcontact(String rcontact) {
        this.rcontact = rcontact;
    }

    @Basic
    @Column(name = "RRATING")
    public byte getRrating() {
        return rrating;
    }

    public void setRrating(byte rrating) {
        this.rrating = rrating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RiderViewEntity that = (RiderViewEntity) o;

        if (rid != that.rid) return false;
        if (rrating != that.rrating) return false;
        if (rname != null ? !rname.equals(that.rname) : that.rname != null) return false;
        if (rcontact != null ? !rcontact.equals(that.rcontact) : that.rcontact != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid;
        result = 31 * result + (rname != null ? rname.hashCode() : 0);
        result = 31 * result + (rcontact != null ? rcontact.hashCode() : 0);
        result = 31 * result + (int) rrating;
        return result;
    }
}
