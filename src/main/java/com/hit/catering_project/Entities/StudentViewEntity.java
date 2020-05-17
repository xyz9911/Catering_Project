package com.hit.catering_project.Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "student_view", schema = "catering_system", catalog = "")
public class StudentViewEntity {
    private int sid;
    private String sname;
    private BigDecimal sbalance;
    private String saddress;
    private String scontact;

    @Id
    @Basic
    @Column(name = "SID", nullable = false)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "SNAME", nullable = false, length = 255)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "SBALANCE", nullable = false, precision = 2)
    public BigDecimal getSbalance() {
        return sbalance;
    }

    public void setSbalance(BigDecimal sbalance) {
        this.sbalance = sbalance;
    }

    @Basic
    @Column(name = "SADDRESS", nullable = false, length = 255)
    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    @Basic
    @Column(name = "SCONTACT", nullable = false, length = 255)
    public String getScontact() {
        return scontact;
    }

    public void setScontact(String scontact) {
        this.scontact = scontact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentViewEntity that = (StudentViewEntity) o;

        if (sid != that.sid) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (sbalance != null ? !sbalance.equals(that.sbalance) : that.sbalance != null) return false;
        if (saddress != null ? !saddress.equals(that.saddress) : that.saddress != null) return false;
        if (scontact != null ? !scontact.equals(that.scontact) : that.scontact != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (sbalance != null ? sbalance.hashCode() : 0);
        result = 31 * result + (saddress != null ? saddress.hashCode() : 0);
        result = 31 * result + (scontact != null ? scontact.hashCode() : 0);
        return result;
    }
}
