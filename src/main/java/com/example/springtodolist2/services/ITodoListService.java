package com.example.springtodolist2.services;

import com.example.springtodolist2.models.Todo;

import java.util.List;
import java.util.Optional;


public interface ITodoListService {
    Todo createTodo(Todo todo);

    List<Todo> findAllTodo(String status);

    Optional<Todo> findOneTodo(String id);

    Todo updateOneTodo(String id, Todo todo);

    void deleteTodo(String id);
}
