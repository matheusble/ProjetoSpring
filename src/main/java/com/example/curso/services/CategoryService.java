package com.example.curso.services;

import com.example.curso.entities.Category;
import com.example.curso.entities.User;
import com.example.curso.repositories.CategoryRepository;
import com.example.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository category;

    public List<Category> findAll(){
        return  category.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = category.findById(id);
        return obj.get();
    }


}
