package br.com.microservices.orchestrated.orchestratorservice.core.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    
    private String code;
    private double unitValue;
}
