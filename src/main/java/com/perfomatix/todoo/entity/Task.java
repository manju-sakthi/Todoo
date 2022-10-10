package com.perfomatix.todoo.entity;

import com.perfomatix.todoo.entity.base.AbstractBaseEntity;
import com.perfomatix.todoo.enums.TaskStatus;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "tasks_details",schema = "todoo")
public class Task extends AbstractBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String taskName;
    @Enumerated(EnumType.STRING)
    private TaskStatus status;
}
