package com.gamzesirin.myapplication;

import java.io.Serializable;

public class Customers implements Serializable {
    private int CustomerId;
    private String CustomerName;
    private double TotalPrice;

    public Customers(){

    }
    public Customers(int CustomerId,String CustomerName , double TotalPrice) {
        this.CustomerId = CustomerId;
        this.CustomerName = CustomerName;
        this.TotalPrice = TotalPrice;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public int getCustomerId(){
        return CustomerId;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public String getCustomerName() {
        return CustomerName;
    }
}
