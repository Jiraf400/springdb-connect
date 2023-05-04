package com.jirafik.service.controller;

import com.jirafik.service.entity.Product;
import com.jirafik.service.repository.ProductRepo;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductRepo productRepository;

    @PostMapping
    @ResponseStatus(CREATED)
    public Product createProduct(@RequestBody Product request){
        return productRepository.save(request);
    }

    @GetMapping
    @ResponseStatus(OK)
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
