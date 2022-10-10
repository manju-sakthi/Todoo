package com.perfomatix.todoo.dto;

import org.springframework.http.HttpStatus;

public record ResponseDTO<T>(HttpStatus code, String status, String message, T data) {
}
