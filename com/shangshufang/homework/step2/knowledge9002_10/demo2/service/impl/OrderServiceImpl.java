package com.shangshufang.homework.step2.knowledge9002_10.demo2.service.impl;

import com.shangshufang.homework.step2.knowledge9002_10.demo2.service.OrderService;
import com.shangshufang.homework.step2.knowledge9002_10.demo2.vo.ClothingOrderDetailVO;
import com.shangshufang.homework.step2.knowledge9002_10.demo2.vo.OrderVO;

public class OrderServiceImpl implements OrderService {

    @Override
    public double getOrderAmount(OrderVO orderModel) {
        Object[] orderDetailList = orderModel.getOrderDetailList();
        double orderAmount = 0;
        for (Object orderDetail : orderDetailList) {
            ClothingOrderDetailVO clothingOrderDetail = (ClothingOrderDetailVO)orderDetail;
            orderAmount += clothingOrderDetail.getItemUnitPrice() * clothingOrderDetail.getItemCount();
            orderAmount *= clothingOrderDetail.getDiscount();
        }
        orderAmount = orderAmount - orderModel.getCouponAmount();
        return orderAmount;
    }

    @Override
    public void printOrderInfo(OrderVO orderModel) {
        Object[] orderDetailList = orderModel.getOrderDetailList();

        System.out.println("订单编号：" + orderModel.getOrderNumber());
        System.out.println("下单日期：" + orderModel.getOrderTime());
        System.out.println("配送地址：" + orderModel.getShippingAddress());
        System.out.println("收件人：" + orderModel.getShippingName());
        System.out.println("练习电话：" + orderModel.getShippingCellNumber());
        System.out.println("----------------");
        for (Object orderDetail : orderDetailList) {
            ClothingOrderDetailVO clothingOrderDetail = (ClothingOrderDetailVO)orderDetail;
            double originalOrderAmount = getOriginalOrderAmount(clothingOrderDetail.getItemUnitPrice(), clothingOrderDetail.getItemCount());
            double finalOrderAmount = getFinalOrderAmount(originalOrderAmount, clothingOrderDetail.getDiscount());
            System.out.println("商品：" + clothingOrderDetail.getItemName());
            System.out.println("颜色：" + clothingOrderDetail.getClothingColor());
            System.out.println("单价：" + clothingOrderDetail.getItemUnitPrice());
            System.out.println("数量：" + clothingOrderDetail.getItemCount());
            System.out.println("原价：" + originalOrderAmount);
            System.out.println("折扣：" + clothingOrderDetail.getDiscount());
            System.out.println("现价：" + finalOrderAmount);
            System.out.println("----------------");
        }
    }

    private double getOriginalOrderAmount(double itemUnitPrice, int itemCount) {
        return itemUnitPrice * itemCount;
    }

    private double getFinalOrderAmount(double originalOrderAmount, float discount) {
        return originalOrderAmount * discount;
    }
}
