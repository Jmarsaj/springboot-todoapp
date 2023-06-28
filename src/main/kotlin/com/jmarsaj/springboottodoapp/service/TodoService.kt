package com.jmarsaj.springboottodoapp.service

import com.jmarsaj.springboottodoapp.model.TodoEntity
import com.jmarsaj.springboottodoapp.repository.TodoEntityRepository
import org.springframework.data.domain.Sort
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class TodoService(val todoRepository: TodoEntityRepository) {

    fun getList(): MutableList<TodoEntity>{
        return todoRepository.findAll(Sort.by(Sort.Direction.ASC, "id"))
    }

    fun saveTodo(todo: TodoEntity): TodoEntity {
        return todoRepository.save(todo)
    }

    fun getTodoById(id: Long): TodoEntity? {
        return todoRepository.findByIdOrNull(id)
    }

    fun deleteTodo(id: Long) {
        todoRepository.deleteById(id)
    }
}