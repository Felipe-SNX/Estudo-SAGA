package br.com.microservices.orchestrated.paymentservice.core.repository;

import java.util.Optional;

import main.java.br.com.microservices.orchestrated.productvalidationservice.core.model.Validation;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    Boolean existsByOrderIdAndTransactionId(String orderId, String transactionId);
    Optional<Payment> findByOrderIdAndTransactionId(String orderId, String transactionId);

}
