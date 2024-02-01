package com.sakin.alcoholinfo.controllers;

import com.sakin.alcoholinfo.entity.AlcoholEntity;
import com.sakin.alcoholinfo.service.AlcoholService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AlcoholController {
    @Autowired
    private AlcoholService alcoholService;

    @GetMapping("/alcohol/{id}")
    private ResponseEntity<AlcoholEntity> findAlcoholById(@PathVariable Long id) {
        Optional<AlcoholEntity> alcohol = alcoholService.findAlcoholById(id);
        return alcohol.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/alcohol")
    public List<AlcoholEntity> getAllAlcohol() {
        return alcoholService.getAllAlcohol();
    }


    //public String findByName(@PathVariable String name) {
    //}




}
