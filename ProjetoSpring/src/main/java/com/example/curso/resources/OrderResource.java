package com.example.curso.resources;

import com.example.curso.entities.Order;
import com.example.curso.entities.User;
import com.example.curso.services.OrderService;
import com.example.curso.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService order;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = order.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = order.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
