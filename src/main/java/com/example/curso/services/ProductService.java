package com.example.curso.services;

import com.example.curso.entities.Product;
import com.example.curso.entities.User;
import com.example.curso.repositories.ProductRepository;
import com.example.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository product;

    public List<Product> findAll(){
        return  product.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = product.findById(id);
        return obj.get();
    }
}
