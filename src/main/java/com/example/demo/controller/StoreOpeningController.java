package com.example.demo.controller;
import com.example.demo.model.StoreOpening;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.repository.StoreOpeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nso-updates")
@CrossOrigin(origins = "*")
public class StoreOpeningController {

    @Autowired
    private StoreOpeningRepository repository;

    @GetMapping
    public List<StoreOpening> getAllStoreOpenings() {
        return repository.findAll();
    }

    @PostMapping
    public StoreOpening createStoreOpening(@RequestBody StoreOpening storeOpening) {
        return repository.save(storeOpening);
    }
    @DeleteMapping("/{id}")
    public void deleteStore(@PathVariable Long id) {
       repository.deleteById(id);
    }
}