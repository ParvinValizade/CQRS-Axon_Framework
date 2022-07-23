package com.company.axontraining.repository;

import com.company.axontraining.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderEntityRepository extends JpaRepository<OrderEntity,String> {
}
