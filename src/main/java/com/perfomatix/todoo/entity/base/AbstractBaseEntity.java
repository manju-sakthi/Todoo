package com.perfomatix.todoo.entity.base;

import lombok.Data;

import java.time.ZonedDateTime;

@Data

public abstract class AbstractBaseEntity {
    private ZonedDateTime createdDate;
    private ZonedDateTime modifiedDate;
    private Boolean isActive;
}
