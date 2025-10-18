package br.com.microservices.orchestrated.orderservice.core.controller;

@RestController
@AllArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService service;

    @PostMapping
    public Order createOrder(@RequestBody OrderRequest request){
        return service.createOrder(request);
    }

}
