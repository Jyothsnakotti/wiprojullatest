package com.example.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService service;

    // Create
    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.save(product);
    }

    // Get all
    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }

    // Get by id
    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        Optional<Product> p = service.getById(id);
        return p.orElse(null); // In production, handle 'not found' better!
    }

    // Update
    @PutMapping("/{id}")
    public Product update(@PathVariable Integer id, @RequestBody Product product) {
        product.setId(id);
        return service.update(product);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        service.delete(id);
        return "Product deleted with id: " + id;
    }
}
