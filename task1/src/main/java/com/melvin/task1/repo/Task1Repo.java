package com.melvin.task1.repo;

import com.melvin.task1.entity.CalcEntity;
import org.springframework.data.repository.CrudRepository;

public interface Task1Repo extends CrudRepository<CalcEntity,Long> {
}
