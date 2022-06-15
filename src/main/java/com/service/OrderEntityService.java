package com.service;

import com.entity.OrderEntity;
import com.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderEntityService {

    private final OrderRepository orderRepository;

    @Autowired
    protected OrderEntityService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> getOrders() {
        return orderRepository.findAll();
    }

    public Optional<OrderEntity> getOrderById(int id) {
        return orderRepository.findById(id);
    }

    public void createOrder(OrderEntity orderEntity) {
        orderRepository.saveAndFlush(orderEntity);
    }

    public void editOrder(OrderEntity orderEntity) {
        if (orderRepository.existsById(orderEntity.getId())) {
            orderRepository.saveAndFlush(orderEntity);
        }
    }

    public void deleteOrder(int id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
        }
    }
}
