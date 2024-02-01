package com.sakin.alcoholinfo.repository;

import com.sakin.alcoholinfo.entity.AlcoholEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlcoholRepository extends JpaRepository<AlcoholEntity, Long> {
}
