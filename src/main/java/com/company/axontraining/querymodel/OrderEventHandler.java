package com.company.axontraining.querymodel;

import com.company.axontraining.coreapi.events.OrderCreatedEvent;
import com.company.axontraining.coreapi.queries.FindAllOrderQuery;
import com.company.axontraining.model.OrderEntity;
import com.company.axontraining.repository.OrderEntityRepository;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ProcessingGroup("orders")
public class OrderEventHandler {

    private final OrderEntityRepository repository;

    public OrderEventHandler(OrderEntityRepository repository) {
        this.repository = repository;
    }

    @EventHandler
    public void on(OrderCreatedEvent event){
        repository.save(new OrderEntity(event.getOrderId(),event.getOrderConfirmed()));
    }

    @QueryHandler
    public List<OrderEntity> on(FindAllOrderQuery query){
        return repository.findAll();
    }
}
