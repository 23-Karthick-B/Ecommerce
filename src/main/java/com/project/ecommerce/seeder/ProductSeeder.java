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
            new Product(null,"Macbook Air M4",95000.00,"Laptop with M4 chip",4.8,"Amazon",25),
            new Product(null,"iPhone 15 Pro",129999.00,"Apple flagship smartphone",4.7,"Flipkart",40),
            new Product(null,"Samsung Galaxy S24",79999.00,"Samsung premium smartphone",4.6,"Amazon",35),
            new Product(null,"Sony WH-1000XM5",29990.00,"Noise cancelling wireless headphones",4.7,"Amazon",50),
            new Product(null,"iPad Air M2",69999.00,"Apple tablet with M2 chip",4.8,"Flipkart",30),
            new Product(null,"Dell XPS 13",115000.00,"Ultra thin premium laptop",4.5,"Amazon",20),
            new Product(null,"Boat Airdopes 141",1299.00,"Wireless Bluetooth earbuds",4.3,"Flipkart",100),
            new Product(null,"LG 55 inch OLED TV",145000.00,"4K Ultra HD Smart OLED TV",4.6,"Amazon",15),
            new Product(null,"Logitech MX Master 3S",8995.00,"Advanced wireless mouse",4.7,"Amazon",60),
            new Product(null,"Amazon Echo Dot 5th Gen",5499.00,"Smart speaker with Alexa",4.4,"Amazon",80),
            new Product(null,"HP Pavilion Gaming Laptop",72000.00,"Gaming laptop with RTX graphics",4.5,"Flipkart",22)
        );
        productRepository.saveAll(demoProducts);
        System.out.println("Seeded demo products");
        
        }else{
            System.out.println("Products already exiists!! Skipping seed");
        }
    }

}
