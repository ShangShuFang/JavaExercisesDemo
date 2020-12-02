package com.shangshufang.homework.step2.knowledge9002_09.demo2;

/**
 * Java面向对象-枚举
 */
public class Demo2 {
    public static void main(String[] args) {
        OrderServiceImpl orderServiceImpl = new OrderServiceImpl();
        OrderVO orderVO = new OrderVO();
        ClothingOrderDetailVO[] orderDetailArray = new ClothingOrderDetailVO[2];

        orderVO.setOrderNumber("SK2020081110152010000");
        orderVO.setOrderTime("2020-08-11 10:15:20");
        orderVO.setShippingAddress("陕西省西安市灞桥区柳烟路");
        orderVO.setShippingName("陆毅");
        orderVO.setShippingCellNumber("18182505290");
        orderVO.setShippingMemo("无");
        orderVO.setCouponAmount(30);

        ClothingOrderDetailVO item1 = new ClothingOrderDetailVO();
        ClothingOrderDetailVO item2 = new ClothingOrderDetailVO();

        item1.setItemName("牛仔裤");
        item1.setClothingColor(ClothingColorEnum.BLACK);
        item1.setClothingSize(ClothingSizeEnum.XXL);
        item1.setItemUnitPrice(288.00);
        item1.setItemCount(2);
        item1.setDiscount(0.95);

        item2.setItemName("T恤");
        item2.setClothingColor(ClothingColorEnum.WHITE);
        item2.setClothingSize(ClothingSizeEnum.XXL);
        item2.setItemUnitPrice(150.00);
        item2.setItemCount(2);

        orderDetailArray[0] = item1;
        orderDetailArray[1] = item2;

        orderVO.setOrderDetailList(orderDetailArray);

        double orderAmount = orderServiceImpl.getOrderAmount(orderVO);
        orderServiceImpl.printOrderInfo(orderVO);
        System.out.println("订单金额：" + orderAmount);
    }
}
