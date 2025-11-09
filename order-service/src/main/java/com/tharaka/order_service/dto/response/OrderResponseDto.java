package com.tharaka.order_service.dto.response;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record OrderResponseDto(
        Long id,
        String orderNumber,
        String skuCode,
        BigDecimal price,
        Integer quantity
) {
}
