package com.hit.catering_project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "property", schema = "catering_system", catalog = "")
public class PropertyEntity {
    private int pid;
    private int cid;
    private String pname;
    private int pavailability;

    @Id
    @Column(name = "PID")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "CID")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "PNAME")
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "PAVAILABILITY")
    public int getPavailability() {
        return pavailability;
    }

    public void setPavailability(int pavailability) {
        this.pavailability = pavailability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PropertyEntity that = (PropertyEntity) o;

        if (pid != that.pid) return false;
        if (cid != that.cid) return false;
        if (pavailability != that.pavailability) return false;
        if (pname != null ? !pname.equals(that.pname) : that.pname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid;
        result = 31 * result + cid;
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + pavailability;
        return result;
    }
}
