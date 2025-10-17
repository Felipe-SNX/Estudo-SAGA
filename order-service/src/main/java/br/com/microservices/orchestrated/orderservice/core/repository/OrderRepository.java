package br.com.microservices.orchestrated.orderservice.core.repository;

public interface OrderRepository extends MongoRepository<Order, String> {
    
}
