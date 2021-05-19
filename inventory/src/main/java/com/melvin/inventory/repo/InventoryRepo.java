package com.melvin.inventory.repo;

import com.melvin.inventory.entity.InventoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepo extends CrudRepository<InventoryEntity,Long> {
}
