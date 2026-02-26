package com.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ecommerce.entity.ProductReview;

public interface ProductReviewRepository extends JpaRepository<ProductReview,Long> {

}
