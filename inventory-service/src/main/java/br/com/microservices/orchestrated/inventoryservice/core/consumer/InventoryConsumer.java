package br.com.microservices.orchestrated.inventoryservice.core.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import br.com.microservices.orchestrated.inventoryservice.core.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@AllArgsConstructor
public class InventoryConsumer {

    private final JsonUtil jsonUtil;
    private final InventoryService inventoryService;
    
    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}",
        topics = "${spring.kafka.topic.inventory-success}"
    )
    public void consumeSuccessEvent(String payload){
        log.info("Receiving success event {} from inventory-success topic", payload);
        var event = jsonUtil.toEvent(payload);
        inventoryService.updateInventory(event);
    }

    @KafkaListener(
        groupId = "${spring.kafka.consumer.group-id}",
        topics = "${spring.kafka.topic.inventory-fail}"
    )
    public void consumeFailEvent(String payload){
        log.info("Receiving rollback event {} from inventory-fail topic", payload);
        var event = jsonUtil.toEvent(payload);
        inventoryService.rollbackinventory(event);
    }

}
