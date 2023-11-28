package com.example.springtodolist2.respositories;

import com.example.springtodolist2.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoListRespository extends JpaRepository<Todo, String> {

    List<Todo> findAllByStatus(String status);
}
