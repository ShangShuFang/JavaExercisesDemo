package com.shangshufang.homework.step3.knowledge9003_01;

public class OrderEntity {
    private String orderNumber;
    private String orderTime;
    private double orderAmount;
    private String customerName;
    private String customerCellphone;
    private String shippingAddress;
    private String shippingContacts;
    private String shippingContactNumber;
    private String orderMemo;
    private OrderDetailEntity[] orderDetailArray;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCellphone() {
        return customerCellphone;
    }

    public void setCustomerCellphone(String customerCellphone) {
        this.customerCellphone = customerCellphone;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShippingContacts() {
        return shippingContacts;
    }

    public void setShippingContacts(String shippingContacts) {
        this.shippingContacts = shippingContacts;
    }

    public String getShippingContactNumber() {
        return shippingContactNumber;
    }

    public void setShippingContactNumber(String shippingContactNumber) {
        this.shippingContactNumber = shippingContactNumber;
    }

    public String getOrderMemo() {
        return orderMemo;
    }

    public void setOrderMemo(String orderMemo) {
        this.orderMemo = orderMemo;
    }

    public OrderDetailEntity[] getOrderDetailArray() {
        return orderDetailArray;
    }

    public void setOrderDetailArray(OrderDetailEntity[] orderDetailArray) {
        this.orderDetailArray = orderDetailArray;
    }
}
