package com.jmarsaj.springboottodoapp.controller

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
}