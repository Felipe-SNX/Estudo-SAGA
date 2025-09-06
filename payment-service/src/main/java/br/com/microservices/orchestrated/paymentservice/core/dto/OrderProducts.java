package br.com.microservices.orchestrated.paymentservice.core.dto;

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
