package com.hit.catering_project.Show;

import com.hit.catering_project.Entities.PropertyEntity;

import java.util.List;

public class Category {
    private int cid;
    private String cname;
    private List<PropertyEntity> propertyEntities;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<PropertyEntity> getPropertyEntities() {
        return propertyEntities;
    }

    public void setPropertyEntities(List<PropertyEntity> propertyEntities) {
        this.propertyEntities = propertyEntities;
    }

    public Category(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
}
