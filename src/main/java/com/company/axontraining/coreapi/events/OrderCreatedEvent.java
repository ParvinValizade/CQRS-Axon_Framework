package com.company.axontraining.coreapi.events;

import java.util.Objects;

public class OrderCreatedEvent {

    private final String orderId;
    private final Boolean orderConfirmed;

    public OrderCreatedEvent(String orderId, Boolean orderConfirmed) {
        this.orderId = orderId;
        this.orderConfirmed = orderConfirmed;
    }

    public String getOrderId() {
        return orderId;
    }

    public Boolean getOrderConfirmed() {
        return orderConfirmed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderCreatedEvent)) return false;
        OrderCreatedEvent that = (OrderCreatedEvent) o;
        return orderId.equals(that.orderId) && orderConfirmed.equals(that.orderConfirmed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderConfirmed);
    }

    @Override
    public String toString() {
        return "OrderCreatedEvent{" +
                "orderId='" + orderId + '\'' +
                ", orderConfirmed=" + orderConfirmed +
                '}';
    }
}
