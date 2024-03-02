package com.engeto.ja.Restaurant;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Orders {
    private int tableNumber;
    private Dish dish;

    private int amount;
    private LocalDateTime orderedTime;
    private LocalDateTime fulfilmentTime;
    private Boolean isItDelivered;
    private Boolean isItPaid;

    public Orders(int tableNumber, Dish dish, int amount, LocalDateTime orderedTime, LocalDateTime fulfilmentTime,Boolean isItDelivered, Boolean isItPaid) {
        this.tableNumber = tableNumber;
        this.dish = dish;
        this.amount = amount;
        this.orderedTime = orderedTime;
        this.fulfilmentTime = fulfilmentTime;
        this.isItDelivered = isItDelivered;
        this.isItPaid = isItPaid;
    }



    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getOrderedTime() {
        return orderedTime;
    }

    public void setOrderedTime(LocalDateTime orderedTime) {
        this.orderedTime = orderedTime;
    }

    public LocalDateTime getFulfilmentTime() {
        return fulfilmentTime;
    }

    public void setFulfilmentTime(LocalDateTime fulfilmentTime) {
        this.fulfilmentTime = fulfilmentTime;
    }

    public Boolean getItPaid() {
        return isItPaid;
    }

    public void setItPaid(Boolean itPaid) {
        isItPaid = itPaid;
    }
    public BigDecimal getPartialPrice(){
        BigDecimal partialPrice = dish.getPrice().multiply(BigDecimal.valueOf(getAmount()));
        return partialPrice;

    }





    @Override
    public String toString() {
        return "Orders{" +
                "tableNumber=" + tableNumber +
                ", dish=" + dish +
                ", amount=" + amount +
                ", orderedTime=" + orderedTime +
                ", fulfilmentTime=" + fulfilmentTime +
                ", isItPaid=" + isItPaid +
                ", partialPrice"+getPartialPrice()+"\n";
    }
}
