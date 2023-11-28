package com.example.springtodolist2.controllers;

import com.example.springtodolist2.models.Todo;
import com.example.springtodolist2.services.ITodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoListController {

    @Autowired
    private ITodoListService todoListService;

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoListService.createTodo(todo);
    }

    @GetMapping
    public List<Todo> findAll() {
        return todoListService.findAllTodo();
    };

    @GetMapping("/{id}")
    public Optional<Todo> findOne(@PathVariable("id") String id) {
        return todoListService.findOneTodo(id);
    }

    @PatchMapping("/{id}")
    public Todo update(@PathVariable("id") String id, @RequestBody Todo todo) {
        return todoListService.updateOneTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        todoListService.deleteTodo(id);
    }
}
