package com.sakin.alcoholinfo.service;

import com.sakin.alcoholinfo.entity.AlcoholEntity;
import com.sakin.alcoholinfo.repository.AlcoholRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlcoholService {
    @Autowired
    private AlcoholRepository alcoholRepository;

    public Optional<AlcoholEntity> findAlcoholById(Long id) {
        return alcoholRepository.findById(id);
    }

    public List<AlcoholEntity> getAllAlcohol() {
        return alcoholRepository.findAll();
    }
}
