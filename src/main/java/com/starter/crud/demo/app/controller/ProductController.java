package com.starter.crud.demo.app.controller;

import com.starter.crud.demo.app.model.Product;
import com.starter.crud.demo.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService ;

    @PostMapping("/add")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product) ;
    }

    @PostMapping("/addProducts")
    public List<Product> saveProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products) ;
    }


    @GetMapping("/get/{id}")
    public Product getProduct(@PathVariable int id){
        return productService.getProduct(id) ;
    }

    @GetMapping("/get/{name}")
    public Product getProduct(@PathVariable String name){
        return productService.getProductByName(name) ;
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return productService.getProducts() ;
    }

    @PutMapping("/updateProduct")
    public String updateProduct(@RequestBody Product product){
        return productService.updateProduct(product) ;
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id) ;
    }

}
