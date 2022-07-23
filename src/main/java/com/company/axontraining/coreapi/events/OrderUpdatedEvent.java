package com.company.axontraining.coreapi.events;

import java.util.Objects;

public class OrderUpdatedEvent {
    private final String orderId;
    private final Integer count;

    public OrderUpdatedEvent(String orderId, Integer count) {
        this.orderId = orderId;
        this.count = count;
    }

    public String getOrderId() {
        return orderId;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderUpdatedEvent)) return false;
        OrderUpdatedEvent that = (OrderUpdatedEvent) o;
        return orderId.equals(that.orderId) && count.equals(that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, count);
    }
}
