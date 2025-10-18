package main.java.br.com.microservices.orchestrated.productvalidationservice.core.repository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

    Boolean existsByCode(String code);
    
}
