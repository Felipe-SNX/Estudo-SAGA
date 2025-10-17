package br.com.microservices.orchestrated.orderservice.core.repository;

public interface EventRepository extends MongoRepository<Event, String>{

    List<Event> findAllByOrderByCreatedAtDesc();

    Optional<Event> findTop1ByOrderIdOrderByCreatedAtDesc(String orderId);

    Optional<Event> findTop1ByTransactionIdOrderByCreatedAtDesc(String transactionId);
}
