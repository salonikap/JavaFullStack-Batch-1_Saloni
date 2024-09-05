package com.verizon.controller;

import com.verizon.model.Product;
import com.verizon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return (productService.getProducts());
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable Integer id) {
        return (productService.getProduct(id));
    }

    @GetMapping("/product/{low}/{high}")
    public List<Product> getProductBetweenPriceRange(@PathVariable Integer low, @PathVariable Integer high) {
        return (productService.getProductsBetweenLowHigh(low, high));
    }

    @PostMapping("/product")
    public String addProductDetails(@RequestBody Product product) {
        productService.addProduct(product);
        return ("Product added successfully");
    }

    @PutMapping("/product/{pid}")
    public Product updateProductDetails(@PathVariable("pid") Integer pid, @RequestBody Product product) {
        return (productService.updateProduct(pid, product));
    }

    @DeleteMapping("/product/{pid}")
    public String deleteProductDetails(@PathVariable("pid") Integer pid) {
        productService.deleteProduct(pid);
        return ("Product deleted successfully");
    }
}
