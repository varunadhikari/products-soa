package com.product.controller;

import com.product.model.OrderDTO;
import com.product.model.OrderStatusCount;
import com.product.service.OrderService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping({"/external/order","/api/order"})
@RestController
@Slf4j
@Api("order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Validated OrderDTO orderDto) {
        orderService.save(orderDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> findById(@PathVariable("id") Integer id) {
        OrderDTO order = orderService.findById(id);
        return ResponseEntity.ok(order);
    }

    @GetMapping("/all")
    public ResponseEntity<List<OrderDTO>> findAllOrders(@RequestParam(value = "days") Integer days) {
        List<OrderDTO> orders = orderService.findAllOrders(days);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<OrderDTO>> findAllOrdersByUser(@RequestParam(value = "days") Integer days, @PathVariable("id") String id) {
        List<OrderDTO> orders = orderService.findAllOrdersByUser(days, id);
        return ResponseEntity.ok(orders);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        orderService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody @Validated OrderDTO orderDto, @PathVariable("id") Integer id) {
        orderService.update(orderDto, id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/status/{user}")
    public ResponseEntity<OrderStatusCount> findAllOrdersStatusCount(@PathVariable(value = "user") String user) {
        OrderStatusCount orders = orderService.findAllOrdersStatusCount(user);
        return ResponseEntity.ok(orders);
    }
}