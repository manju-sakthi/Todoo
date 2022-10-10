package com.perfomatix.todoo.repository;

import com.perfomatix.todoo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
