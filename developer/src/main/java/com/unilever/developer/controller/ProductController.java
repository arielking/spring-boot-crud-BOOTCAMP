package com.unilever.developer.controller;
import com.unilever.developer.domain.Product;
import com.unilever.developer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @GetMapping("productos")
    public List<Product> products(){
        return productRepository.findAll();
    }

    @GetMapping("producto/{id}")
    public  Product getProduct(@PathVariable long id){

        Optional<Product> optMachine=productRepository.findById(id);
        if(optMachine.isPresent()){
            return optMachine.get();
        }
        else {
            return null;

        }
    }
    @PostMapping("/producto")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("/producto")
    public  Product updateProduct(@RequestBody Product product){return productRepository.save(product);}

    @DeleteMapping("/producto/{id}")
    public boolean deleteProducto(@PathVariable Long id) { productRepository.deleteById(id);
        return true;
    }




}
