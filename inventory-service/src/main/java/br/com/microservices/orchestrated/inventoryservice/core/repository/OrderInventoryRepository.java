package br.com.microservices.orchestrated.inventoryservice.core.repository;

public interface OrderInventoryRepository extends JpaRepository<OrderInventory, Integer>{

    Boolean existsByOrderIdAndTransactionId(String orderId, String transactionId);
    List<OrderInventory> findByOrderIdAndTransactionId(String orderId, String transactionId);
}