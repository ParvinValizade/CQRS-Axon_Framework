package com.company.axontraining.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class OrderEntity {

    @Id
    private String orderId;
    private Boolean orderConfirmed;

    public OrderEntity() {
    }

    public OrderEntity(String orderId, boolean orderConfirmed) {
        this.orderId = orderId;
        this.orderConfirmed = orderConfirmed;
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean isOrderConfirmed() {
        return orderConfirmed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderEntity)) return false;
        OrderEntity that = (OrderEntity) o;
        return orderId.equals(that.orderId) && orderConfirmed.equals(that.orderConfirmed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderConfirmed);
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "orderId='" + orderId + '\'' +
                ", orderConfirmed=" + orderConfirmed +
                '}';
    }
}
