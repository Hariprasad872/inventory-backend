package com.example.demo.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.model.Asset;
import com.example.demo.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assets")
@CrossOrigin(origins = "*")
public class AssetController {

    @Autowired
    private AssetRepository repository;

    @GetMapping
    public List<Asset> getAllAssets() {
        return repository.findAll();
    }

    @PostMapping
    public Asset createAsset(@RequestBody Asset asset) {
        return repository.save(asset);
    }
    @DeleteMapping("/{id}")
    public void deleteAsset(@PathVariable Long id) {
        repository.deleteById(id);
    }
}