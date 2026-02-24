package com.project.ecommerce.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.ecommerce.entity.Product;
import com.project.ecommerce.repository.ProductRepository;


@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Map<String,Object> getAllProducts(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        Page<Product> products =productRepository.findAll(pageable);

        Map<String,Object> response = new HashMap<>();
        response.put("products", products.getContent());
        response.put("totalProducts", products.getTotalElements());
        return response;
    }

    public Product getProductById(long id){
        return productRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("Product not found with id " +id ));
    }

}
