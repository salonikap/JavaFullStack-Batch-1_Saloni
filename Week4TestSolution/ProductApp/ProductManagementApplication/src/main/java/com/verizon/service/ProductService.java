package com.verizon.service;

import com.verizon.dao.ProductDao;
import com.verizon.exception.ProductNotFoundException;
import com.verizon.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    ProductDao productDao;

    public String addProduct(Product product) {
        productDao.save(product);
        return "Product Added";
    }

    public List<Product> getProducts() {
        return productDao.findAll();
    }

    public Product getProduct(Integer id) {
        return productDao.findById(id).orElseThrow(() -> 
            new ProductNotFoundException("Product not found with id: " + id));
    }

    public List<Product> getProductsBetweenLowHigh(Integer low, Integer high) {
        return productDao.findProductsBetweenPrice(low, high);
    }

    public Product updateProduct(Integer pid, Product product) {
        Product existingProduct = productDao.findById(pid).orElseThrow(() -> 
            new ProductNotFoundException("Product not found with id: " + pid));
        existingProduct.setPname(product.getPname());
        existingProduct.setPrice(product.getPrice());
        return productDao.save(existingProduct);
    }

    public void deleteProduct(Integer pid) {
        Product product = productDao.findById(pid).orElseThrow(() -> 
            new ProductNotFoundException("Product not found with id: " + pid));
        productDao.delete(product);
    }
}
