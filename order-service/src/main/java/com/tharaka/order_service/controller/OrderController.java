package com.tharaka.order_service.controller;

import com.tharaka.order_service.dto.request.OrderRequestDto;
import com.tharaka.order_service.dto.response.OrderResponseDto;
import com.tharaka.order_service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResponseDto placeOrder(@RequestBody OrderRequestDto order) {
        return orderService.placeOrder(order);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<OrderResponseDto> getAllOrders() {
        return orderService.getAllOrders();
    }
}
