package com.tharaka.order_service.mapper;

import com.tharaka.order_service.dto.request.OrderRequestDto;
import com.tharaka.order_service.dto.response.OrderResponseDto;
import com.tharaka.order_service.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public Order fromOrderRequestDtoToOrder(OrderRequestDto orderRequestDto) {
        return Order.builder()
                .orderNumber(orderRequestDto.orderNumber())
                .price(orderRequestDto.price())
                .skuCode(orderRequestDto.skuCode())
                .quantity(orderRequestDto.quantity())
                .build();
    }

    public OrderResponseDto fromOrderToOrderResponseDto(Order order) {
        return OrderResponseDto.builder()
                .id(order.getId())
                .orderNumber(order.getOrderNumber())
                .price(order.getPrice())
                .skuCode(order.getSkuCode())
                .quantity(order.getQuantity())
                .build();
    }
}
