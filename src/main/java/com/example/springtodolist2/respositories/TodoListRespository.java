package com.example.springtodolist2.respositories;

import com.example.springtodolist2.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRespository extends JpaRepository<Todo, String> {

}
