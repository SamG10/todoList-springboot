package com.example.springtodolist2.dto;

import jakarta.validation.constraints.NotBlank;

public class TodoDto {
    @NotBlank
    private String task;

    @NotBlank
    private String status;
}
