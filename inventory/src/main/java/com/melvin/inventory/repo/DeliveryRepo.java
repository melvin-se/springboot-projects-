package com.melvin.inventory.repo;

import com.melvin.inventory.entity.DeliveryEntity;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryRepo extends CrudRepository<DeliveryEntity,Long> {
}
