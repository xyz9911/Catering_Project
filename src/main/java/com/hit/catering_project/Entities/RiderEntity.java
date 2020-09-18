package com.hit.catering_project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "rider", schema = "catering_system", catalog = "")
public class RiderEntity {
    private int rid;
    private String rname;
    private String rpassword;
    private String rcontact;
    private byte rrating;
    private byte isdelete;

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
    @Column(name = "RPASSWORD")
    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
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

    @Basic
    @Column(name = "ISDELETE")
    public byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(byte isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RiderEntity that = (RiderEntity) o;

        if (rid != that.rid) return false;
        if (rrating != that.rrating) return false;
        if (isdelete != that.isdelete) return false;
        if (rname != null ? !rname.equals(that.rname) : that.rname != null) return false;
        if (rpassword != null ? !rpassword.equals(that.rpassword) : that.rpassword != null) return false;
        if (rcontact != null ? !rcontact.equals(that.rcontact) : that.rcontact != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid;
        result = 31 * result + (rname != null ? rname.hashCode() : 0);
        result = 31 * result + (rpassword != null ? rpassword.hashCode() : 0);
        result = 31 * result + (rcontact != null ? rcontact.hashCode() : 0);
        result = 31 * result + (int) rrating;
        result = 31 * result + (int) isdelete;
        return result;
    }
}
