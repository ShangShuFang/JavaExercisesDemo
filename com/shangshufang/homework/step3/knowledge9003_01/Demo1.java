package com.shangshufang.homework.step3.knowledge9003_01;

public class Demo1 {
    public static void main(String[] args) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderNumber("1137915971172794134");
        orderEntity.setOrderTime("2020-07-23 10:15:30");
        orderEntity.setCustomerName("吴奇隆");
        orderEntity.setCustomerCellphone("13512345678");
        orderEntity.setShippingContacts("刘诗诗");
        orderEntity.setShippingContactNumber("13512345677");
        orderEntity.setShippingAddress("北京市海淀区中关村山水丽都");
        orderEntity.setOrderMemo("贵重物品，轻拿轻放");

        OrderDetailEntity[] orderDetailEntities = new OrderDetailEntity[2];
        OrderDetailEntity orderItem1 = new OrderDetailEntity();
        orderItem1.setItemName("HUAWEI Mate30 Pro");
        orderItem1.setItemCount(1);
        orderItem1.setUnitPrice(4999);

        OrderDetailEntity orderItem2 = new OrderDetailEntity();
        orderItem2.setItemName("HUAWEI FreeBuds3");
        orderItem2.setItemCount(1);
        orderItem2.setUnitPrice(1099);
        orderItem2.setItemDiscount(0.88F);

        orderDetailEntities[0] = orderItem1;
        orderDetailEntities[1] = orderItem2;
        orderEntity.setOrderDetailArray(orderDetailEntities);

        OrderService.printOrderInformation(orderEntity);
    }
}
