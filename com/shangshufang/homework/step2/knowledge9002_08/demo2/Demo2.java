package com.shangshufang.homework.step2.knowledge9002_08.demo2;

/**
 * Java面向对象-多态-接口
 */
public class Demo2 {
    public static void main(String[] args) {
        OrderServiceImpl orderServiceImpl = new OrderServiceImpl();
        OrderModel orderModel = new OrderModel();
        OrderDetailModel[] orderDetailArray = new OrderDetailModel[3];

        orderModel.setOrderNumber("SK2020081110152010000");
        orderModel.setOrderTime("2020-08-11 10:15:20");
        orderModel.setShippingAddress("陕西省西安市灞桥区柳烟路");
        orderModel.setShippingName("陆毅");
        orderModel.setShippingCellNumber("18182505290");
        orderModel.setShippingMemo("贵重物品请轻拿轻放！");
        orderModel.setCouponAmount(50);

        OrderDetailModel item1 = new OrderDetailModel();
        OrderDetailModel item2 = new OrderDetailModel();
        OrderDetailModel item3 = new OrderDetailModel();

        item1.setItemName("手机壳");
        item1.setItemUnitPrice(15.99);
        item1.setItemCount(3);
        item1.setDiscount(0.89);

        item2.setItemName("手机贴膜");
        item2.setItemUnitPrice(8.50);
        item2.setItemCount(1);

        item3.setItemName("华为Mate30Pro");
        item3.setItemUnitPrice(5899.00);
        item3.setItemCount(1);
        item3.setDiscount(0.95);

        orderDetailArray[0] = item1;
        orderDetailArray[1] = item2;
        orderDetailArray[2] = item3;

        orderModel.setOrderDetailList(orderDetailArray);

        double orderAmount = orderServiceImpl.getOrderAmount(orderModel);
        orderServiceImpl.printOrderInfo(orderModel);
        System.out.println("订单金额：" + orderAmount);
    }
}
