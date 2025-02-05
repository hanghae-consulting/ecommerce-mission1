package com.example.order.service;

import com.example.order.dto.OrderDto;
import com.example.order.entity.Order;
import com.example.order.repository.OrderRepository;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository OrderRepository;
    private final ObjectMapper mapper;

    @Transactional
    public Order createOrder(OrderDto dto) {
        // TODO #1: 주문 생성 메서드를 구현하세요.
        // 요구사항:
        // - 주문을 생성하고 재고를 감소시킵니다.
        // - 모든 과정이 하나의 트랜잭션으로 처리되어야 합니다.
        // - 실패 시 롤백되어야 합니다.
    }

    public Order getOrder(String orderId) {
        // TODO #2: 주문 조회 메서드를 구현하세요.
        // 요구사항:
        // - 주문을 조회합니다.
        // - 실패 시 Exception을 발생시켜야 합니다.
    }

    @Transactional
    public Order updateOrder(String orderId, OrderDto dto) throws JsonMappingException {
        // TODO #3: 주문 업데이트 메서드를 구현하세요.
        // 요구사항:
        // - 주문 상태를 변경하고 시간을 기록합니다.
        // - 상태 변경이 올바른 순서로만 가능해야 합니다.
    }

    public void deleteOrder(String orderId) {
        // TODO #4: 주문 삭제 메서드를 구현하세요.
        // 요구사항:
        // - 주문을 삭제합니다.
        // - 실패 시 Exception을 발생시켜야 합니다.
    }
}
