package br.com.microservices.orchestrated.inventoryservice.core.repository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer>{

    Optional<Inventory> findByProductCode(String productCode);
}