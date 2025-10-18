package br.com.microservices.orchestrated.orderservice.core.controller;

@RestController
@AllArgsConstructor
@RequestMapping("/api/event")
public class EventController {

    private final EventService service;

    @GetMapping
    public Event findByFilters(EventFilters filters){
        return service.findByFilters(filters);
    }

    @GetMapping("/all")
    public List<Event> findAll(){
        return service.findAll();
    }
}
