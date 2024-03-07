package com.starter.crud.demo.app.service;

import com.starter.crud.demo.app.model.Product;
import com.starter.crud.demo.app.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository ;

    public Product saveProduct(Product product){
        return productRepository.save(product) ;
    }

    public List<Product> saveProducts(List<Product> products){
        return productRepository.saveAll(products) ;
    }
    public Product getProduct(int id){
        return productRepository.findById(id).orElse(new Product()) ;
    }

    public List<Product> getProducts(){
        return productRepository.findAll() ;
    }

    public Product getProductByName(String name){
        return productRepository.findByName(name) ;
    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return String.format("Product with Id: %d updated" , id ) ;
    }

    public String updateProduct(Product product){
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        productRepository.save(existingProduct) ;
        return String.format("Product with Id: %d updated" , product.getId() );
    }


}
