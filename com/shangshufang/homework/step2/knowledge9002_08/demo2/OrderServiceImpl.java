package com.shangshufang.homework.step2.knowledge9002_08.demo2;

public class OrderServiceImpl implements OrderService {

    @Override
    public double getOrderAmount(OrderModel orderModel) {
        OrderDetailModel[] orderDetailList = orderModel.getOrderDetailList();
        double orderAmount = 0;
        for (OrderDetailModel orderDetailModel : orderDetailList) {
            orderAmount += orderDetailModel.getItemUnitPrice() * orderDetailModel.getItemCount();
            orderAmount *= orderDetailModel.getDiscount();
        }
        orderAmount = orderAmount - orderModel.getCouponAmount();
        return orderAmount;
    }

    @Override
    public void printOrderInfo(OrderModel orderModel) {
        OrderDetailModel[] orderDetailList = orderModel.getOrderDetailList();

        System.out.println("订单编号：" + orderModel.getOrderNumber());
        System.out.println("下单日期：" + orderModel.getOrderTime());
        System.out.println("配送地址：" + orderModel.getShippingAddress());
        System.out.println("收件人：" + orderModel.getShippingName());
        System.out.println("联系电话：" + orderModel.getShippingCellNumber());
        System.out.println("----------------");
        for (OrderDetailModel orderDetail : orderDetailList) {
            System.out.println("商品：" + orderDetail.getItemName());
            System.out.println("单价：" + orderDetail.getItemUnitPrice());
            System.out.println("购买数量：" + orderDetail.getItemCount());
            System.out.println("原价：" + orderDetail.getItemUnitPrice() * orderDetail.getItemCount());
            System.out.println("折扣：" + orderDetail.getDiscount());
            System.out.println("现价：" + orderDetail.getItemUnitPrice() * orderDetail.getItemCount() * orderDetail.getDiscount());
            System.out.println("----------------");
        }
    }
}
