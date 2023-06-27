package com.jmarsaj.springboottodoapp.controller

import com.jmarsaj.springboottodoapp.model.TodoEntity
import com.jmarsaj.springboottodoapp.service.TodoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TodoController(val todoService: TodoService) {

    @GetMapping("/todo")
    fun index(model: Model): String {
        model.addAttribute("todos", todoService.getList())
        return "index"
    }

    @GetMapping("/")
    fun root(): String {
        return "redirect:/todo"
    }

    @GetMapping("/todo/create")
    fun createTodoForm(model: Model): String {
        val todo = TodoEntity()
        model.addAttribute("todo", todo)
        return "create-todo"
    }
}