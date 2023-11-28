package com.example.springtodolist2.services;

import com.example.springtodolist2.dto.TodoDto;
import com.example.springtodolist2.models.Todo;
import com.example.springtodolist2.respositories.TodoListRespository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Optional;

@Service
public class TodoListService implements ITodoListService {

    @Autowired
    private TodoListRespository todoListRespository;

    @Override
    public Todo createTodo(Todo todo) {
        return todoListRespository.save(todo);
    }

    @Override
    public List<Todo> findAllTodo() {
        return todoListRespository.findAll();
    }

    @Override
    public Optional<Todo> findOneTodo(String id) {
        return todoListRespository.findById(id);
    }

    @Override
    public Todo updateOneTodo(String id, Todo todo) {
        Todo existingTodo = todoListRespository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found with id: " + id));

        BeanUtils.copyProperties(todo, existingTodo, "id");

        return todoListRespository.save(existingTodo);
    }

    @Override
    public void deleteTodo(String id) {
        todoListRespository.deleteById(id);
    }


}
