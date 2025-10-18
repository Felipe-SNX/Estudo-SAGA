package main.java.br.com.microservices.orchestrated.productvalidationservice.core.repository;

public interface ValidationRepository extends JpaRepository<Validation, Integer>{

    Boolean existsByOrderIdAndTransactionId(String orderId, String transactionId);
    Optional<Validation> findByOrderIdAndTransactionId(String orderId, String transactionId);
}
