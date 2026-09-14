package com.tads.ecomerce.repository;

import com.tads.ecomerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long > {
    
}
