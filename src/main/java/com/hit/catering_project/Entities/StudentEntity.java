package com.hit.catering_project.Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "student", schema = "catering_system", catalog = "")
public class StudentEntity {
    private int sid;
    private String sname;
    private String spassword;
    private BigDecimal sbalance;
    private String saddress;
    private String scontact;
    private byte isdelete;

    @Id
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
    @Column(name = "SPASSWORD", nullable = false, length = 255)
    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
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

    @Basic
    @Column(name = "ISDELETE", nullable = false)
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

        StudentEntity that = (StudentEntity) o;

        if (sid != that.sid) return false;
        if (isdelete != that.isdelete) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (spassword != null ? !spassword.equals(that.spassword) : that.spassword != null) return false;
        if (sbalance != null ? !sbalance.equals(that.sbalance) : that.sbalance != null) return false;
        if (saddress != null ? !saddress.equals(that.saddress) : that.saddress != null) return false;
        if (scontact != null ? !scontact.equals(that.scontact) : that.scontact != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (spassword != null ? spassword.hashCode() : 0);
        result = 31 * result + (sbalance != null ? sbalance.hashCode() : 0);
        result = 31 * result + (saddress != null ? saddress.hashCode() : 0);
        result = 31 * result + (scontact != null ? scontact.hashCode() : 0);
        result = 31 * result + (int) isdelete;
        return result;
    }
}
