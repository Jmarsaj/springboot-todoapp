package com.jmarsaj.springboottodoapp.controller

import com.jmarsaj.springboottodoapp.model.TodoEntity
import com.jmarsaj.springboottodoapp.service.TodoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(val todoService: TodoService) {

    @GetMapping("/test")    //GET request to URL /test
    fun list(): MutableList<TodoEntity> {
        return todoService.getList()
    }

    @PostMapping("/test")
    fun add(@RequestBody todo: TodoEntity): String {        //@RequestBody deserializes inbound HttpRequest body onto Java object
        todoService.saveTodo(todo)
        return "Successfully saved!"
    }
}