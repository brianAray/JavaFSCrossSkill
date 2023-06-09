package com.revature.SpringDataJPA.controller;

import com.revature.SpringDataJPA.dto.OrderDTO;
import com.revature.SpringDataJPA.entity.Order;
import com.revature.SpringDataJPA.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
@CrossOrigin("*")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    // create order
    @PostMapping
    public Order postOrder(@RequestBody OrderDTO order){
        return orderService.saveOrder(order);
    }
    // get all orders
    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
    // get order by id
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable String id){
        Optional<Order> optionalOrder = orderService.getOrderById(Long.parseLong(id));
        if(optionalOrder.isPresent()){
            return optionalOrder.get();
        }else{
            return null;
        }
    }

    @GetMapping("/user/{id}")
    public List<Order> getOrderByUserId(@PathVariable String id){
        return orderService.getOrderByUserId(Long.parseLong(id));
    }

    // update order
    // delete order
}
