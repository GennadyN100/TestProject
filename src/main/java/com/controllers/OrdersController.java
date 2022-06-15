package com.controllers;

import com.entity.OrderEntity;
import com.service.OrderEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    private final OrderEntityService orderEntityService;

    @Autowired
    public OrdersController(OrderEntityService orderEntityService) {
        this.orderEntityService = orderEntityService;
    }

    @GetMapping()
    public List<OrderEntity> getOrders() {
        return orderEntityService.getOrders();
    }

    @GetMapping("/{id}")
    public Optional<OrderEntity> getOrderById(@PathVariable("id") int id) {
        return orderEntityService.getOrderById(id);
    }

    @PostMapping()
    public int createOrder(@RequestBody String name) {
        OrderEntity orderEntity = new OrderEntity(name);
        orderEntityService.createOrder(orderEntity);
        return orderEntity.getId();
    }

    @PatchMapping("/{id}")
    public int editOrder(@PathVariable("id") int id, @RequestBody String name) {
        OrderEntity orderEntity = new OrderEntity(id, name);
        orderEntityService.editOrder(orderEntity);
        return orderEntity.getId();
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable("id") int id) {
        orderEntityService.deleteOrder(id);
        return "success";
    }
}
