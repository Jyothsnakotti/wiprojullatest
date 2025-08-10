package com.example.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product save(Product product) {
        return repository.save(product);
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Optional<Product> getById(Integer id) {
        return repository.findById(id);
    }

    public Product update(Product product) {
        return repository.save(product);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
