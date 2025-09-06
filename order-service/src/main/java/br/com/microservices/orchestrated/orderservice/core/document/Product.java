package br.com.microservices.orchestrated.orderservice.core.document;

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
