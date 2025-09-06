package br.com.microservices.orchestrated.orderservice.core.document;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderProducts {
    
    private Product product;
    private int quantity;
}
