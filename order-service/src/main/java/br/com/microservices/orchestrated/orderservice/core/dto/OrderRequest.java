package br.com.microservices.orchestrated.orderservice.core.dto;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    private List<OrderProducts> products;
}
