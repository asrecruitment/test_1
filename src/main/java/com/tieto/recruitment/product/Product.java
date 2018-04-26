package com.tieto.recruitment.product;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Product {
    @Id private String ean;
    private String name;
    private String label;
    private Boolean available;
}
