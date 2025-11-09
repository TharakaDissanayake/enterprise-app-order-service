package com.tharaka.order_service.service;

import com.tharaka.order_service.dto.request.OrderRequestDto;
import com.tharaka.order_service.dto.response.OrderResponseDto;
import com.tharaka.order_service.mapper.OrderMapper;
import com.tharaka.order_service.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public OrderResponseDto placeOrder(OrderRequestDto request) {
        var order = orderMapper.fromOrderRequestDtoToOrder(request);
        order.setOrderNumber(UUID.randomUUID().toString());
        return orderMapper.fromOrderToOrderResponseDto(orderRepository.save(order));

    }

    public List<OrderResponseDto> getAllOrders() {
        var orders = orderRepository.findAll();
        return orders.stream()
                .map(orderMapper::fromOrderToOrderResponseDto)
                .toList();
    }
}
