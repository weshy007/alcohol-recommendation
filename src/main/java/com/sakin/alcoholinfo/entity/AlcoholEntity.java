package com.sakin.alcoholinfo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AlcoholEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String style;
    private Integer styleKey;
    private String brewery;
    private String description;
    private Double abv;
    private Double averageRating;
    private Integer minimumIBU;
    private Integer maximumIBU;
}
