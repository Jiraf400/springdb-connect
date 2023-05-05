package com.jirafik.service.entity;

import jakarta.persistence.*;
import lombok.*;
//import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.AUTO;
import static jakarta.persistence.GenerationType.IDENTITY;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
@Entity
@Table
public class Product {
    @GeneratedValue(strategy = IDENTITY)
    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    private int id;
    private String title;
    private String description;
    private BigDecimal price;

}
