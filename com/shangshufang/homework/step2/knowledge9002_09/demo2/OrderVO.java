package com.shangshufang.homework.step2.knowledge9002_09.demo2;

public class OrderVO {
    private String orderNumber;
    private String orderTime;
    private String shippingAddress;
    private String shippingName;
    private String shippingCellNumber;
    private String shippingMemo;
    private double couponAmount;
    private Object[] orderDetailList;

    public String getOrderNumber() {
        return orderNumber;
    }

    public double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(final double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Object[] getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(final Object[] orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public String getShippingMemo() {
        return shippingMemo;
    }

    public void setShippingMemo(final String shippingMemo) {
        this.shippingMemo = shippingMemo;
    }

    public String getShippingCellNumber() {
        return shippingCellNumber;
    }

    public void setShippingCellNumber(final String shippingCellNumber) {
        this.shippingCellNumber = shippingCellNumber;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(final String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(final String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(final String orderTime) {
        this.orderTime = orderTime;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
