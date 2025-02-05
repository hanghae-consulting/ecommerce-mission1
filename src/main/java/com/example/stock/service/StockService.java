package com.example.stock.service;

import com.example.stock.dto.StockDto;
import com.example.stock.entity.Stock;
import com.example.stock.repository.StockRepository;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class StockService {

    public Stock createStock(StockDto dto) {
        // TODO #1: 재고 생성 메서드를 구현하세요.
        // 요구사항:
        // - 재고을 생성하고 재고를 감소시킵니다.
        // - 모든 과정이 하나의 트랜잭션으로 처리되어야 합니다.
        // - 실패 시 롤백되어야 합니다.
    }

    public Stock getStock(String stockId) {
        // TODO #2: 재고 조회 메서드를 구현하세요.
        // 요구사항:
        // - 재고을 조회합니다.
        // - 실패 시 Exception을 발생시켜야 합니다.
    }

    public Stock updateStock(String stockId, StockDto dto) throws JsonMappingException {
        // TODO #3: 재고 업데이트 메서드를 구현하세요.
        // 요구사항:
        // - 재고 상태를 변경하고 시간을 기록합니다.
        // - 상태 변경이 올바른 순서로만 가능해야 합니다.
    }

    @Transactional
    public Stock decreaseStock(String stockId, Long quantity) {
        // TODO #4: 재고 감소 메서드를 구현하세요.
        // 요구사항:
        // - 재고를 감소합니다.
        // - 실패 시 Exception을 발생시켜야 합니다.
    }

    public void deleteStock(String stockId) {
        // TODO #5: 재고 삭제 메서드를 구현하세요.
        // 요구사항:
        // - 재고를 삭제합니다.
        // - 실패 시 Exception을 발생시켜야 합니다.
    }
}
