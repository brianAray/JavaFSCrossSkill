package com.revature.SpringDataJPA.service;

import com.revature.SpringDataJPA.dto.OrderDTO;
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

    @Autowired
    private UserService userService;

    // crud

    // save order entity
    public Order saveOrder(OrderDTO order){
        // user entity
        Optional<User> userOptional = userService.getUserById(order.getUserId());

        if(userOptional.isPresent()){
            Order orderToBeSaved = new Order();
            orderToBeSaved.setUser(userOptional.get());
            orderToBeSaved.setDescription(order.getDescription());
            return orderRepository.save(orderToBeSaved);
        }else{
            return null;
        }
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

    public List<Order> getOrderByUserId(Long userId){
        return orderRepository.findAllByUserId(userId);
    }
}
