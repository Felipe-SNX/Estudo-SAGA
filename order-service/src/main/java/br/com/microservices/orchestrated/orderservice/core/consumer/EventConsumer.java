package br.com.microservices.orchestrated.orderservice.core.consumer;

@Slf4j
@Component
@AllArgsConstructor
public class EventConsumer {

    private final EventService service;
    private final JsonUtil jsonUtil;

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}",
        topics = "${spring.kafka.topic.notify-ending}"
    )
    public void consumeNotifyEndingEvent(String payload){
        log.info("Receiving ending notification event {} from notify-ending topic", payload);
        var event = jsonUtil.toEvent(payload); 
        service.notifyEnding(event);
    }
}
