package com.project.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String publicId;
    private String url;
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getPublicId() {
        return publicId;
    }
    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public ProductImage(Integer id, String publicId, String url) {
        Id = id;
        this.publicId = publicId;
        this.url = url;
    }
    @ManyToOne()
    @JoinColumn(name = "product_id")
    @JsonIgnore
    private Product product;
    public ProductImage(String url, Product product) {
        this.url = "/uploads"+url;
        this.publicId = url;
        this.product = product;
    }

    
}
