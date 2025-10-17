package main.java.br.com.microservices.orchestrated.productvalidationservice.core.model;

import javax.annotation.processing.Generated;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String code;
}
