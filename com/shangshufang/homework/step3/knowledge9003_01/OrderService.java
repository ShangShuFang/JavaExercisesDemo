package com.shangshufang.homework.step3.knowledge9003_01;

public class OrderService {
    public static void printOrderInformation(OrderEntity orderEntity) {
        double orderAmount = 0;
        System.out.println("订单编号：" + orderEntity.getOrderNumber());
        System.out.println("下单时间：" + orderEntity.getOrderTime());
        System.out.println("下单客户：" + orderEntity.getCustomerName());
        System.out.println("客户电话：" + orderEntity.getCustomerCellphone());
        System.out.println("收件人：" + orderEntity.getShippingContacts());
        System.out.println("收件人电话：" + orderEntity.getShippingContactNumber());
        System.out.println("收件人地址：" + orderEntity.getShippingAddress());
        System.out.println("");
        System.out.println("商品                  数量      单价         折扣      总价");

        for (OrderDetailEntity orderDetailEntity : orderEntity.getOrderDetailArray()) {
            double itemTotalAmount = 0;
            if (orderDetailEntity.getItemDiscount() > 0) {
                itemTotalAmount = orderDetailEntity.getItemCount() * orderDetailEntity.getUnitPrice() * orderDetailEntity.getItemDiscount();
            } else {
                itemTotalAmount = orderDetailEntity.getItemCount() * orderDetailEntity.getUnitPrice();
            }

            System.out.print(orderDetailEntity.getItemName() + "      ");
            System.out.print(orderDetailEntity.getItemCount() + "      ");
            System.out.print("¥");
            System.out.printf("%.2f", orderDetailEntity.getUnitPrice());
            System.out.print("      ");
            if (orderDetailEntity.getItemDiscount() > 0) {
                System.out.printf("%.2f", orderDetailEntity.getItemDiscount());
            } else {
                System.out.print("--");
            }

            System.out.print("      ");
            System.out.print("¥");
            System.out.printf("%.2f", itemTotalAmount);
            System.out.println("");

            orderAmount += itemTotalAmount;
        }
        orderEntity.setOrderAmount(orderAmount);
        System.out.println("");
        System.out.print("订单金额：");
        System.out.print("¥");
        System.out.printf("%.2f", orderEntity.getOrderAmount());
        System.out.println("");
    }
}
