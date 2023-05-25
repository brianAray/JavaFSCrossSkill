package com.revature.SpringDataJPA.service;

import com.revature.SpringDataJPA.entity.Order;
import com.revature.SpringDataJPA.entity.User;
import com.revature.SpringDataJPA.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // crud

    // save order entity
    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

    // Get by id
    public Optional<Order> getOrderById(Long id){
        return orderRepository.findById(id);
    }

    // get all orders
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    // delete user
    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}
