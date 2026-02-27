package com.project.ecommerce.seeder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.ecommerce.entity.Product;
import com.project.ecommerce.repository.ProductRepository;

@Component
public class ProductSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        if(productRepository.count()==0){
        List<Product> demoProducts = List.of(
            new Product(null,"Macbook Air M4",95000.00,"Laptop with M4 chip","Electronics",4.8,"Amazon",25,List.of("/products/1.jpeg")),
            new Product(null,"Dell XPS 13",105000.00,"Ultra-thin premium laptop","Electronics",4.5,"Dell Store",20,List.of("/products/2.jpeg")),
            new Product(null,"Apple Watch Series 9",41999.00,"Advanced smartwatch with health tracking","Electronics",4.7,"Amazon",60,List.of("/products/3.jpeg")),
            new Product(null,"iPad Air M2",69999.00,"Powerful tablet with M2 chip","Electronics",4.6,"Flipkart",30,List.of("/products/4.jpeg")),
            new Product(null,"OnePlus 12",64999.00,"High performance 5G smartphone","Electronics",4.5,"Amazon",45,List.of("/products/5.jpeg")),
            new Product(null,"Logitech MX Master 3S",9999.00,"Ergonomic wireless mouse","Accessories",4.8,"Amazon",80,List.of("/products/6.jpeg")),
            new Product(null,"Nike Air Zoom Pegasus",8999.00,"Comfortable running shoes","Footwear",4.6,"Nike Store",55,List.of("/products/7.jpeg")),
            new Product(null,"Levi's Men's Slim Fit Jeans",2499.00,"Stylish slim fit denim jeans","Clothing",4.5,"Amazon",70,List.of("/products/8.jpeg")),
            new Product(null,"Prestige Pressure Cooker 5L",1899.00,"Durable stainless steel pressure cooker","Home & Kitchen",4.4,"Flipkart",90,List.of("/products/9.jpeg")),
            new Product(null,"Philips Air Fryer",9999.00,"Healthy oil-free cooking appliance","Home Appliances",4.7,"Amazon",25,List.of("/products/10.jpeg")),
            new Product(null,"Puma Men's Sports T-Shirt",1299.00,"Breathable gym wear t-shirt","Sportswear",4.3,"Puma Store",100,List.of("/products/11.jpeg")),
            new Product(null,"Classmate Notebook Pack",299.00,"Pack of 6 ruled notebooks","Stationery",4.6,"Amazon",200,List.of("/products/12.jpeg")),
            new Product(null,"Milton Thermosteel Water Bottle",799.00,"1L insulated steel bottle","Home & Kitchen",4.5,"Flipkart",150,List.of("/products/13.jpeg")),
            new Product(null,"Urban Ladder Wooden Study Table",7499.00,"Engineered wood study desk","Furniture",4.4,"Urban Ladder",12,List.of("/products/14.jpeg")),
            new Product(null,"Cosmic Byte Gaming Keyboard",2499.00,"RGB mechanical gaming keyboard","Gaming",4.5,"Amazon",65,List.of("/products/15.jpeg")),
            new Product(null,"Himalaya Face Wash",199.00,"Herbal neem face cleanser","Personal Care",4.2,"Flipkart",180,List.of("/products/16.jpeg"))
        );
        productRepository.saveAll(demoProducts);
        System.out.println("Seeded demo products");
        
        }else{
            System.out.println("Products already exiists!! Skipping seed");
        }
    }

}
