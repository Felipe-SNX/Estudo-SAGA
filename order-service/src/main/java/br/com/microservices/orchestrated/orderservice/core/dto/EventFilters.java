package br.com.microservices.orchestrated.orderservice.core.dto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventFilters {
    
    private String orderId;
    private String transactionId;
}
