package com.hit.catering_project.Show;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingCarInfo {
    public double price;
    public int sum;
    public List<DishInfo> dishInfoList;

    public ShoppingCarInfo() {
        price=0.00;
        sum=0;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public List<DishInfo> getDishInfoList() {
        return dishInfoList;
    }

    public void setDishInfoList(List<DishInfo> dishInfoList) {
        this.dishInfoList = dishInfoList;
    }
}
