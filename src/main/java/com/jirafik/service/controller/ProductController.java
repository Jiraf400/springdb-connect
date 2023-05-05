package com.jirafik.service.controller;

import com.jirafik.service.entity.Product;
import com.jirafik.service.repository.ProductRepo;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
@Slf4j
public class ProductController {

    private final ProductRepo productRepository;

    @PostMapping
    @ResponseStatus(OK)
    public Product createProduct(@RequestBody Product request){
//        throw new IllegalStateException("saving object : "+ request.toString());
        log.info("saving object : {}", request.toString());
        return productRepository.save(request);
    }

    @GetMapping
    @ResponseStatus(OK)
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
