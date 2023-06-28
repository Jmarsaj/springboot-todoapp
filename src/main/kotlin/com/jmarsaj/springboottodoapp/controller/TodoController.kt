package com.jmarsaj.springboottodoapp.controller

import com.jmarsaj.springboottodoapp.model.TodoEntity
import com.jmarsaj.springboottodoapp.service.TodoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import java.time.LocalDateTime

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

    @PostMapping("/todo")
    fun saveTodo(@ModelAttribute("todo") todo: TodoEntity): String {
        todo.createdDatetime = LocalDateTime.now()
        todoService.saveTodo(todo)
        return "redirect:/todo"
    }

    @GetMapping("/todo/edit/{id}")
    fun editTodoForm(@PathVariable id: Long, model: Model): String {
        model.addAttribute("todo", todoService.getTodoById(id))
        return "edit-todo"
    }

    @PostMapping("/todo/{id}")
    fun updateTodo(
        @PathVariable id: Long,
        @ModelAttribute("todo") todo: TodoEntity,
        model: Model
    ): String {
        val existingTodo = todoService.getTodoById(id)
        existingTodo?.let {
            it.content = todo.content
            it.completed = todo.completed

            if (todo.completed == true) it.completedDatetime = LocalDateTime.now()
            else it.completedDatetime = null

            todoService.saveTodo(it)
        }

        return "redirect:/todo"
    }
}