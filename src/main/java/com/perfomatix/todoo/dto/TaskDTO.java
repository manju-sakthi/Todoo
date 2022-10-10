package com.perfomatix.todoo.dto;

import com.perfomatix.todoo.enums.TaskStatus;
import lombok.Data;

import java.time.ZonedDateTime;
@Data
public class TaskDTO {
    String name;
    TaskStatus status;
    ZonedDateTime createdAt;
    public TaskDTO() {

    }
}
