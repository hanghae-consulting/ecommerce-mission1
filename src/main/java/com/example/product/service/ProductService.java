package com.example.product.service;

import com.example.product.dto.ProductDto;
import com.example.product.entity.Product;
import com.fasterxml.jackson.databind.JsonMappingException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
    @Transactional
    public Product createProduct(ProductDto dto) {
        // TODO #1: 상품 생성 메서드를 구현하세요.
        // 요구사항:
        // - 상품을 생성합니다.
        // - 모든 과정이 하나의 트랜잭션으로 처리되어야 합니다.
        // - 실패 시 롤백되어야 합니다.
    }

    public Product getProduct(String productId) {
        // TODO #2: 상품 조회 메서드를 구현하세요.
        // 요구사항:
        // - 상품 상태를 변경하고 시간을 기록합니다.
        // - 상태 변경이 올바른 순서로만 가능해야 합니다.
    }

    @Transactional
    public Product updateProduct(String productId, ProductDto dto) throws JsonMappingException {
        // TODO #3: 상품 업데이트 메서드를 구현하세요.
        // 요구사항:
        // - 상품을 업데이트합니다.
        // - 실패 시 Exception을 발생시켜야 합니다.
    }

    public void deleteProduct(String productId) {
        // TODO #4: 상품 삭제 메서드를 구현하세요.
        // 요구사항:
        // - 상품을 삭제합니다.
        // - 실패 시 Exception을 발생시켜야 합니다.
    }

}
