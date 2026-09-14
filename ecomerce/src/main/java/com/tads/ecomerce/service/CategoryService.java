package com.tads.ecomerce.service;

import com.tads.ecomerce.entity.Category;
import com.tads.ecomerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        List<Category> list = repository.findAll();
      return list;
    };


}