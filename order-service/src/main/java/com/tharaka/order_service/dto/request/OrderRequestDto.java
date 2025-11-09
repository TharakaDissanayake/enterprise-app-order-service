package com.tharaka.order_service.dto.request;

import lombok.Builder;

import java.math.BigDecimal;
@Builder
public record OrderRequestDto(
         String orderNumber,
         String skuCode,
         BigDecimal price,
         Integer quantity
) {
}
